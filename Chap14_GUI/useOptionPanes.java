/* Tuesday, September 17,2019
Second GUI program, practicing using JOptionPane class
usins showConfirmDialog(Parent, message), showInputDialog(parent, message), and
showMessageDialog(Parent, message) methods
*/

import javax.swing.*; //for GUI components

public class useOptionPanes {
	public static void main(String[] args) {
		//Read the user name graphically
		String name = JOptionPane.showInputDialog(null, "What is your name?");
		
		//ask the user a yes/no question
		int choice = JOptionPane.showConfirmDialog(null, "Do you like chocolate, " + name + "?");

		//show different responses depending on answer
		if(choice==JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Of course, who doesn't?");	//user clicked yes
		} else {
			JOptionPane.showMessageDialog(null, "hmmm...");			//user clicked no
		}
	}
}
