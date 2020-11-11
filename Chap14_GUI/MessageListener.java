/* Wednesday, September 18, 2019
class to excute/add for when button is pressed
*/

import javax.swing.*;
import java.awt.event.*;		//to get the ActionListener interface

public class MessageListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		JOptionPane.showMessageDialog(null, "You clicked the button!");
	}
}
