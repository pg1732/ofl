package src;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
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
 * Represents a button to display the corresponding ocean floor landforms information.
 */

public class LandformButton extends JButton implements ActionListener {
	private JTextField waterField; // Create water field.
	private JTextField featuresField; // Create features field.
	private JTextField productivityField; // Create productivity field.
	private JTextField habitatField; // Create habitat field.
	private String buttonName; // Create button name for custom button method.
	private String[] texts; // Create array for the data file text.

	/**
	 * Purpose: Constructor that takes in the text to display on this button.
	 * 
	 * @param buttonName The text to display on this button.
	 */
	public LandformButton(String buttonName) {
		// Call button name parameter.
		super(buttonName);
		// Add action listener for each button.
		addActionListener(this);
		// Button name equals button name parameter.
		this.buttonName = buttonName;
		this.texts = new String[4];
	}

	/**
	 * Purpose: Action performed method created to set text in text fields.
	 * 
	 * @param e used to performed action event with the text fields.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		waterField.setText(this.texts[0]);
		featuresField.setText(this.texts[1]);
		productivityField.setText(this.texts[2]);
		habitatField.setText(this.texts[3]);
	}

	/**
	 * Purpose: Get the name of the button.
	 * 
	 * @return button name such as features, habitat, productivity, and water
	 *         buttons.
	 */
	public String getButtonName() {
		return buttonName;
	}

	/**
	 * Purpose: Set the button name.
	 * 
	 * @param buttonName parameter such as features, habitat, productivity, and
	 *                   water buttons.
	 */
	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	/**
	 * Purpose: Getter created to return text found in array.
	 * 
	 * @param idx found in the array that iterated through the data file.
	 * @return text used in getter to access text found in the array.
	 */
	public String getText(int idx) {
		return texts[idx];
	}

	/**
	 * Purpose: Setter created to set text in the text fields.
	 * 
	 * @param idx  Index found in the array.
	 * @param text found in the data file.
	 */
	public void setText(int idx, String text) {
		texts[idx] = text;
	}

	/**
	 * Purpose: Create toString for button information.
	 * 
	 * @return buttonName used in the customButton constructor.
	 */
	public String toString() {
		String fields = "";
		for (int idx = 0; idx < 4; idx++)
			fields += texts[idx] + "'";
		return this.buttonName + ": " + fields;
	}

	/**
	 * Purpose: Get the water field.
	 * 
	 * @return TextField used for the water field information.
	 */
	public JTextField getWaterField() {
		return this.waterField;
	}

	/**
	 * Purpose: Set water field setter with water field parameters for water field
	 * text field.
	 * 
	 * @param waterField textfield used for water field information
	 */
	public void setWaterField(JTextField waterField) {
		this.waterField = waterField;
	}

	/**
	 * Purpose: Get the features field.
	 * 
	 * @return TextField used for the features field information.
	 */
	public JTextField getFeaturesField() {
		return featuresField;
	}

	/**
	 * Purpose: Set the features field.
	 * 
	 * @param featuresField textfield used for features field information
	 */
	public void setFeaturesField(JTextField featuresField) {
		this.featuresField = featuresField;
	}

	/**
	 * Purpose: Get the productivity field.
	 * 
	 * @return TextField used for the productivity field information.
	 */
	public JTextField getProductivityField() {
		return productivityField;
	}

	/**
	 * Purpose: Set the productivity field.
	 * 
	 * @param productivityField textfield used for productivity field information
	 */
	public void setProductivityField(JTextField productivityField) {
		this.productivityField = productivityField;
	}

	/**
	 * Purpose: Get the habitat field.
	 * 
	 * @return TextField used for the habitat field information.
	 */
	public JTextField getHabitatField() {
		return habitatField;
	}

	/**
	 * Purpose: Set the habitat field.
	 * 
	 * @param habitatField textfield used for habitat field information
	 */
	public void setHabitatField(JTextField habitatField) {
		this.habitatField = habitatField;
	}
}
