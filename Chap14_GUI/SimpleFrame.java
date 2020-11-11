/* Tuesday, September 17, 2019
using the JFrame class, displays an empty window
*/

import javax.swing.*;	//for GUI stuff
import java.awt.*;		//for various graphical objects

public class SimpleFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();			//creates a frame object
		frame.setForeground(Color.WHITE);		//sets the foreground to white
		frame.setLocation(new Point(10,50));	//sets the position of the top left corner of the frame
		frame.setSize(new Dimension(900,500));	//makes frame dimension 300x120
		frame.setTitle("A window frame");		//sets the title
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//exits program if frame is closed
		frame.setResizable(true);				//makes the frame resizable
		
		
		frame.setVisible(true);					//makes 'frame' visible
	}
}
