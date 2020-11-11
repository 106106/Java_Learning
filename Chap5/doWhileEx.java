/* Wednesday, August 7, 2019
Illustrates the do-while loop.
The do-while loop checks the condition at the end of the loop, instead of the start.
Note: the statements inside the loop will always excute atleast once.
*/

public class doWhileEx {
	public static void main(String arg[]) {
		int number = 1;
		do {
			number *=2;
			System.out.println(number);
		} while(number <= 200);
	}
}
