/* Tuesday, September 24, 2019
A GUI to check that a number is a valid visa credit card
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CreditCardGUI implements ActionListener {
	public static void main(String[] args) {
		CreditCardGUI gui = new CreditCardGUI();
	}

	//fields
	private JFrame frame;
	private JTextField numberField;
	private JLabel validLabel;
	private JButton verifyButton;

	//creates components, does layout, shows window onscreen
	public CreditCardGUI() {
	numberField = new JTextField(16);
	validLabel = new JLabel("not yet Verified");
	verifyButton = new JButton("Verify CC Number");

	//event listeners
	verifyButton.addActionListener(this);

	frame = new JFrame("Credit card number verifier");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(new Dimension(350,100));
	frame.setLayout(new FlowLayout());
	frame.add(numberField);
	frame.add(verifyButton);
	frame.add(validLabel);
	frame.setVisible(true);
	}
	
	//Returns whether the given string is a valid visa
	//card number according to the luhn checksum algorithm.
	public boolean isValidCC(String text) {
		int sum = 0;
		for(int i = text.length() - 1; i>=0;i--) {
			int digit = Integer.parseInt(text.substring(i, i+1));
			if(i%2==0) {	//doubles even digits
				digit *=2;
			}
			sum += (digit/10) + (digit%10);
		}
		//valid numbers add up to a multiple of 10
		return sum % 10 == 0 && text.startsWith("4");
	}

	//Sets label's text to show whether CC number is valid
	//implements the action
	public void actionPerformed(ActionEvent event) {
		String text = numberField.getText();
		if(isValidCC(text)) {
			validLabel.setText("Valid number!");
			verifyButton.setBackground(Color.GREEN);	//doesn't work?
		} else {
			validLabel.setText("invalid number!");
			verifyButton.setBackground(Color.RED);		//doesn't work?
		}
	}
}	
