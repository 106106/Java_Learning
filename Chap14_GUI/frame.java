/* Tuesday, September 17, 2019
making a GUI program!
*/

import javax.swing.*;	//for GUI stuff
import java.awt.*;		//for various graphical objects and layout manager

public class frame {
	public static void main(String[] args) {
		//Setting up the frame
		JFrame frame = new JFrame();			//creates a frame object
		frame.setForeground(Color.WHITE);		//sets the foreground to white
		frame.setLocation(new Point(10,50));	//sets the position of the top left corner of the frame
		frame.setSize(new Dimension(900,500));	//makes frame dimension 300x120
		frame.setTitle("A window frame");		//sets the title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//exits program if frame is closed
		frame.setResizable(true);				//makes the frame resizable
		frame.setLayout(new FlowLayout());		//to make buttons flow left-to-right

		//filling the frame with buttons and stuff
		//creating the first button and adding it to the frame
		JButton button1 = new JButton();		//constructs a default button
		button1.setText("I'm the first button");//sets the text in the button
		button1.setBackground(Color.RED);		//sets the button background to red
		button1.addActionListener(new MessageListener()); //attachs a listener to handle events for this button.
		frame.add(button1);						//add button to frame
		//creating the second button and adding it to the frame
		JButton button2 = new JButton("I'm the second button");		//can construct a button with text 
		button2.setBackground(Color.BLUE);		//sets the button background to blue
		button2.addActionListener(new MessageListener1()); //attachs a listener to handle events for this button.
		frame.add(button2);	


		//creates the actual frame on the screen.
		frame.setVisible(true);					//makes 'frame' visible
		
		
	}
}
