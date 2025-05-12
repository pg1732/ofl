package ofl;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ofl extends JFrame {

	
	public ofl() {
		super("OceanFloorLandforms");
        this.setLayout(new FlowLayout());
        
		JPanel buttonPanel = new JPanel();
		GridLayout buttonLayout = new GridLayout(4,1,5,5);
		buttonPanel.setLayout(buttonLayout);
		JButton plainsButton = new JButton("plains");
		JButton shelfButton = new JButton("shelf");
		JButton ridgeButton = new JButton("ridge");
		JButton trenchButton = new JButton("trench");
		
		buttonPanel.add(plainsButton);
		//plainsButton.addActionListener();
		buttonPanel.add(shelfButton);
		//shelfButton.addActionListener();
		buttonPanel.add(ridgeButton);
		//ridgeButton.addActionListener();
		buttonPanel.add(trenchButton);
		//trenchButton.addActionListener();
		this.add(buttonPanel);
		
		JPanel dataPanel = new JPanel();
		dataPanel.setLayout(new GridLayout(2,1,5,5));
		JLabel waterLabel = new JLabel("Water Depth");
		dataPanel.add(waterLabel);
		JLabel featuresLabel = new JLabel("Features");
		dataPanel.add(featuresLabel);
		JLabel productivityLabel = new JLabel("Productivity");
		dataPanel.add(productivityLabel);
		JLabel habitatLabel = new JLabel("Habitat");
		dataPanel.add(habitatLabel);
		
		
		JPanel textFieldPanel = new JPanel();
		textFieldPanel.setLayout(new GridLayout(0,1,5,5);
		textFieldPanel.add(new JTextField("Water Depth"))

		add(dataPanel);
		this.setSize(400, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ofl();
	}

}
