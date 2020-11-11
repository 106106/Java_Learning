/* Friday, September 20, 2019
A GUI to compute a person's body mass index
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BMIGUI implements ActionListener {
	//BMIGUI is its own runnable client program
	public static void main(String[] args) {
		BMIGUI gui = new BMIGUI();
	}

	//onscreen components stored as fields
	private JFrame frame;
	private JTextField heightField;
	private JTextField weightField;
	private JLabel bmiLabel;
	private JButton computeButton;

	public BMIGUI() {
		//set up components
		heightField = new JTextField(5);
		weightField = new JTextField(5);
		bmiLabel = new JLabel("Type your height and weight");
		computeButton = new JButton("Compute");

		//attach a event listener to compute button
		computeButton.addActionListener(this);

		//layout
		JPanel north = new JPanel(new GridLayout(2,2));
		north.add(new JLabel("Height: "));
		north.add(heightField);
		north.add(new JLabel("Weight: "));
		north.add(weightField);

		//overall frame
		frame = new JFrame("BMI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		frame.add(north, BorderLayout.NORTH);
		frame.add(bmiLabel, BorderLayout.CENTER);
		frame.add(computeButton, BorderLayout.SOUTH);
		frame.pack();
		frame.setVisible(true);
	}

	//Handles clicks on Compute button by computing BMI.
	public void actionPerformed(ActionEvent event) {
		//read heigh/weight from text fields
		String heightText = heightField.getText();
		double height = Double.parseDouble(heightText);
		String weightText = weightField.getText();
		double weight = Double.parseDouble(weightText);
		
		//compute BMI and display is on screen
		double bmi = weight / (height * height) * 703;
		bmiLabel.setText("BMI: " + bmi);
	}
}
