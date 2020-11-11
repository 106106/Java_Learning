
/* Wednesday, August 7, 2019
Read in the hours_worked.txt file and sums out the total hours for each employee
Deals with mixed input
*/

import java.io.*;
import java.util.*;

public class hoursWorked {
	public static void main(String args[]) throws FileNotFoundException {		//throws since reading in a file
		Scanner input = new Scanner(new File("hours_worked.txt"));
		process(input);
	}
	
	public static void process(Scanner input) {
		while(input.hasNext()) {
			String name = input.next();
			double sum = 0.0;
			while (input.hasNextDouble()) {
				sum += input.nextDouble();
			}
			System.out.println("Total hours worked by " + name + " = " + sum);
		}
	}
}

