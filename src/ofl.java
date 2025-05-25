package src;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ofl extends JFrame {
	private JTextField waterField;
	private JTextField featuresField;
	private JTextField productivityField;
	private JTextField habitatField;

	public ofl() {
		super("OceanFloorLandforms");
        this.setLayout(new GridLayout(4,1,5,5));
		JPanel buttonPanel = new JPanel();
		GridLayout buttonLayout = new GridLayout(4,1,5,5);
		buttonPanel.setLayout(buttonLayout);
        
        ArrayList<CustomButton> buttons = new ArrayList<CustomButton>();
        waterField = new JTextField();
        featuresField = new JTextField();
        productivityField = new JTextField();
		habitatField = new JTextField();

    	
		
		File myFile = new File("datafile.txt"); // fileName is the name of the file
		Scanner scan = null;
		try {
			scan = new Scanner(myFile); // Create a Scanner object using the File object
			for(int b=0; b<4; b++)
			{
				String name = scan.nextLine();
				buttons.add(new CustomButton(name));
				for(int f=0; f<4;f++)
				{
					String field = scan.nextLine();
					buttons[b].setText(f,field);
				}
				System.out.println("setup button:"+buttons[b]);
				buttons[b].setWaterField(waterField);
				buttons[b].setFeaturesField(featuresField);
				buttons[b].setProductivityField(productivityField);
				buttons[b].setHabitatField(habitatField);
				buttonPanel.add(buttons[b]);

			}
		} 
		catch (FileNotFoundException e) { e.printStackTrace(); } 
		finally { if (scan != null) scan.close(); }
		this.add(buttonPanel);
		
	  		
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new GridLayout(4,2,5,5));
		
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
		textFieldPanel.setLayout(new GridLayout(0,1,5,5));
		textFieldPanel.add(new JTextField("Water Depth"));

		add(dataPanel);
		this.setSize(400, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ofl();
	}

}
