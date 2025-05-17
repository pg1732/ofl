package src;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ofl extends JFrame {

	public ofl() {
		super("OceanFloorLandforms");
        this.setLayout(new GridLayout(4,1,5,5));
        
		JPanel buttonPanel = new JPanel();
		GridLayout buttonLayout = new GridLayout(4,1,5,5);
		buttonPanel.setLayout(buttonLayout);
		customButton plainsButton = new customButton("plains");
		customButton shelfButton = new customButton("shelf");
		customButton ridgeButton = new customButton("ridge");
		customButton trenchButton = new customButton("trench");
		
		plainsButton.setWaterText("10,000 feet");
		plainsButton.setFeaturesText("Hills, valleys, and seamounts");
		plainsButton.setProductivityText("The largest habitat on earth and less productive then the continental shelf");
		plainsButton.setHabitatText("Biodiversity and a wide variety of life");
		buttonPanel.add(plainsButton);
		shelfButton.setWaterText("A few hundred feet deep");
		shelfButton.setFeaturesText("Guyots, submarine volcanic fields, interacting fans, seafloor channels, levees, and landslide scarps");
		shelfButton.setProductivityText("Relatively productive in light and nutrients");
		shelfButton.setHabitatText("None");
		buttonPanel.add(shelfButton);
		ridgeButton.setWaterText("8,000 feet");
		ridgeButton.setFeaturesText("Hills, valleys, and seamounts(uderwater mountains");
		ridgeButton.setProductivityText("The largest habitat on earth. New floor is created as tectonic plates spread apart. There are many volcanoes that cover the mid ocean ridge(longest mountain range on earth).");
		ridgeButton.setHabitatText("None");
		buttonPanel.add(ridgeButton);
		trenchButton.setWaterText("36,201 feet");
		trenchButton.setFeaturesText("Deepest place in the ocean");
		trenchButton.setProductivityText("None");
		trenchButton.setHabitatText("None");
		buttonPanel.add(trenchButton);
		
		this.add(buttonPanel);
		
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new GridLayout(4,2,5,5));
		
		JLabel waterLabel = new JLabel("Water Depth");
		dataPanel.add(waterLabel);
		dataPanel.add(plainsButton.getWaterField());
		
//		JLabel featuresLabel = new JLabel("Features");
//		dataPanel.add(featuresLabel);
//		dataPanel.add(plainsButton.getFeaturesField());
//		
//		JLabel productivityLabel = new JLabel("Productivity");
//		dataPanel.add(productivityLabel);
//		dataPanel.add(plainsButton.getProductivityField());
//		
//		JLabel habitatLabel = new JLabel("Habitat");
//		dataPanel.add(habitatLabel);
//		dataPanel.add(plainsButton.getHabitatField());
//		
//		JPanel textFieldPanel = new JPanel();
//		textFieldPanel.setLayout(new GridLayout(0,1,5,5));
//		textFieldPanel.add(new JTextField("Water Depth"));

		add(dataPanel);
		this.setSize(400, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ofl();
	}

}
