package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class CustomButton extends JButton implements ActionListener{
	private JTextField waterField;
	private JTextField featuresField;
	private JTextField productivityField;
	private JTextField habitatField;
	private String buttonName;
	private String[] texts;
	
	public CustomButton(String buttonName)
	{
		super(buttonName);
		addActionListener(this);
		this.buttonName = buttonName;
		this.texts = new String[4];
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		waterField.setText(this.texts[0]);
		featuresField.setText(this.texts[1]);
		productivityField.setText(this.texts[2]);
		habitatField.setText(this.texts[3]);
	}

	public String getButtonName() {
		return buttonName;
	}

	public void setButtonName(String buttonName) {
		this.buttonName = buttonName;
	}

	public String getText(int idx            ) { return texts[idx]; }
	public void   setText(int idx,String text) { texts[idx]=text;   }
	
	public String toString()
	{
		String fields ="";
		for(int idx=0; idx<4; idx++)
			fields += texts[idx]+"'";
		return this.buttonName+": "+fields;
	}
	

	public JTextField getWaterField() {
		return this.waterField;
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
