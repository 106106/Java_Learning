
/* Friday, August 9, 2019
This programs uses try-catch to get the input file from the user
Illustrates try-catch code and senting a scanner object to main
*/

import java.io.*;
import java.util.*;

public class hoursWorked2 {
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		Scanner input = getInput(console);
		while(input.hasNextLine()) {
			String text = input.nextLine();
			processLine(text);
		}
	}
	
	//prompts the user for a legal file name, creates and returns a scanner tied to the file
	public static Scanner getInput(Scanner console) {
		Scanner result = null;
		while(result == null) {
			System.out.println("input file name?");
			String name = console.nextLine();
			try {
				result = new Scanner(new File(name));
			} catch(FileNotFoundException e) {
				System.out.println("File not found. " + "Please input name again.");
			}
		}
		return result;
	}

	//processes the given line string (ID#, name, and hours worked)
	public static void processLine(String text) {
		Scanner data = new Scanner(text);
		int id = data.nextInt();
		String name = data.next();
		double sum = 0;
		while(data.hasNextDouble()) {
			sum += data.nextDouble();			
		}
		System.out.println("Total hours worked by " + name + " (id#" + id + ") = " + sum); 
	}	
}

