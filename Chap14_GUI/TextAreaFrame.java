/* Tuesday, September 24, 2019
creats a GUI with a text book 5 lines and 20 characters per line
*/

import java.awt.*;
import javax.swing.*;

public class TextAreaFrame {
	public static void main(String[] args) {
		TextAreaFrame gui = new TextAreaFrame();
	}

	//fields
	private JFrame frame;
	private JTextArea area;
	private JButton convertButton;

	//constructor for the GUI
	public TextAreaFrame() {
		area = new JTextArea(5,20);
		convertButton = new JButton();
		convertButton.setText("convert to CAPS");
		convertButton.setBackground(Color.RED);	

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(new Dimension(300, 150));
		frame.setTitle("text frame");
	
		frame.add(new JScrollPane(area));
		frame.add(convertButton);
		
		frame.setVisible(true);
	}
}
