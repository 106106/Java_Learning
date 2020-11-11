/* Tuesday, August 6, 2019
This program asks for your age with a prompt, and keeps prompting until an Integer is imput.
Illustrates checking user imput
Try with "7.4", "j", "8jj", and "8"
*/

import java.util.*;

public class getIntegerAge {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int age = getInt(console, "How old are you?");
		System.out.println("You are " + age + " years old"); 
	}

	//prompts until a valid integer is entered. note negatives?
	public static int getInt(Scanner console, String prompt) {
		System.out.print(prompt);
		while(!console.hasNextInt()) {
			console.next();
			System.out.println("Not an integer; try again.");
			System.out.print(prompt);
		}
		return console.nextInt();
	}
}
