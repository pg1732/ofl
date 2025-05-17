package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class customButton extends JButton implements ActionListener{
	private JTextField waterField;
	private JTextField featuresField;
	private JTextField productivityField;
	private JTextField habitatField;
	private String waterText;
	private String featuresText;
	private String productivityText;
	private String habitatText;
	private String buttonName;
	
	public customButton(String buttonName)
	{
		super(buttonName);
		addActionListener(this);
		this.buttonName = buttonName;
		waterField = new JTextField();
		waterField.setEditable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		waterField.setText(this.waterText);
		featuresField.setText(this.featuresText);
		productivityField.setText(this.productivityText);
		habitatField.setText(this.habitatText);
		
	}

	public String getButtonName() {
		return buttonName;
	}

	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	public String getWaterText() {
		return waterText;
	}

	public void setWaterText(String waterText) {
		this.waterText = waterText;
	}

	public String getFeaturesText() {
		return featuresText;
	}

	public void setFeaturesText(String featuresText) {
		this.featuresText = featuresText;
	}

	public String getProductivityText() {
		return productivityText;
	}

	public void setProductivityText(String productivityText) {
		this.productivityText = productivityText;
	}

	public String getHabitatText() {
		return habitatText;
	}

	public void setHabitatText(String habitatText) {
		this.habitatText = habitatText;
	}

	public JTextField getWaterField() {
		return waterField;
	}

	public void setWaterField(JTextField waterField) {
		this.waterField = waterField;
	}

	public JTextField getFeaturesField() {
		return featuresField;
	}

	public void setFeaturesField(JTextField featuresField) {
		this.featuresField = featuresField;
	}

	public JTextField getProductivityField() {
		return productivityField;
	}

	public void setProductivityField(JTextField productivityField) {
		this.productivityField = productivityField;
	}

	public JTextField getHabitatField() {
		return habitatField;
	}

	public void setHabitatField(JTextField habitatField) {
		this.habitatField = habitatField;
	}
	
	
}
