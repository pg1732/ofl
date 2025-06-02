package src;
import java.awt.GridLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Lead Author(s):
 * 
 * @author	Patrick Gonzales
 * 
 * Other contributors:
 * Tutor David and Sirn
 * 
 * References:
 *         Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 *         Retrieved from
 *         https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 * 
 * Version/date: 5/28/2025
 * 
 * Responsibilities of class:
 * This is the main window for the application. It contains a gridlayout that lays out the text
 * fields, and buttons. When each button is pressed the corresponding land forms information
 * is displayed in each textfield. All that information is read from a text file.
 */

public class OceanFloorLandformsApp extends JFrame {
	private JTextField waterField; // Create water text field.
	private JTextField featuresField; // Create features text field.
	private JTextField productivityField; // Create productivity text field.
	private JTextField habitatField; // Create habitat text field.

	/**
	 * Purpose: Constructor created to set the title and create a layout.
	 */
	public OceanFloorLandformsApp() {
		super("OceanFloorLandforms");
		// Create grid layout.
		this.setLayout(new GridLayout(4, 1, 5, 5));
		// Create button panel for buttons.
		JPanel buttonPanel = new JPanel();
		// Create button layout.
		GridLayout buttonLayout = new GridLayout(4, 1, 5, 5);
		buttonPanel.setLayout(buttonLayout);

		// Create array list of buttons.
		ArrayList<LandformButton> buttons = new ArrayList<LandformButton>();
		// Create text fields in the JPanel.
		waterField = new JTextField();
		featuresField = new JTextField();
		productivityField = new JTextField();
		habitatField = new JTextField();

		// Create text file for text fields information.
		File myFile = new File("datafile.txt"); // fileName is the name of the file
		// Scanner in text file is null.
		Scanner scan = null;
		// Try block uses scanner and for loop to go through the text fields.
		try {
			scan = new Scanner(myFile); // Create a Scanner object using the File object
			for (int b = 0; b < 4; b++) {
				String name = scan.nextLine();
				LandformButton button = new LandformButton(name);
				button.setWaterField(waterField);
				button.setFeaturesField(featuresField);
				button.setProductivityField(productivityField);
				button.setHabitatField(habitatField);
				// For loop used for text fields
				for (int f = 0; f < 4; f++) {
					// Read the data in the text file line by line.
					String field = scan.nextLine();
					button.setText(f, field);
				}
				System.out.println("setup button:" + button);
				buttons.add(button);
			}
		}
		// Catch block used to through exception in case there is no file.
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// Finally block used to close the file.
		finally {
			if (scan != null)
				scan.close();
		}
		// Enhanced for loop used to iterate through the buttons.
		for (LandformButton button : buttons) {
			buttonPanel.add(button);
		}
		this.add(buttonPanel);

		// Create data panel for the fields.
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new GridLayout(4, 2, 5, 5));

		JLabel waterLabel = new JLabel("Water Depth");
		dataPanel.add(waterLabel);
		dataPanel.add(waterField);

		JLabel featuresLabel = new JLabel("Features");
		dataPanel.add(featuresLabel);
		dataPanel.add(featuresField);

		JLabel productivityLabel = new JLabel("Productivity");
		dataPanel.add(productivityLabel);
		dataPanel.add(productivityField);

		JLabel habitatLabel = new JLabel("Habitat");
		dataPanel.add(habitatLabel);
		dataPanel.add(habitatField);

		JPanel textFieldPanel = new JPanel();
		textFieldPanel.setLayout(new GridLayout(0, 1, 5, 5));
		textFieldPanel.add(new JTextField("Water Depth"));

		add(dataPanel);
		this.setSize(400, 500);
		setVisible(true);
	}

	/**
	 * Purpose: main method used to call Ocean floor land forms class.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new OceanFloorLandformsApp();
	}

}
