/* Wednesday, August 7, 2019
This program simulates the rolling of two dice until doubles come up.
Note: the declairation is outside of the loop since the check for the do-while loop 
is outside the scope of the curly braces.
*/

import java.util.*;

public class doubleDice {
	public static void main(String args[]) {
		Random r = new Random();				//Creates new random object named 
		int count = 1;
		int roll1, roll2;
		do {
			roll1 = r.nextInt(6) + 1;
			roll2 = r.nextInt(6) + 1;
			System.out.println("Roll " + count + " = " + roll1 + "," + roll2);
			count++;
		} while(roll1 != roll2);
	}
}
