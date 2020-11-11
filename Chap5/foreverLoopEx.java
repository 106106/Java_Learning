/* Wednesday, August 7, 2019
Demonstrates a "forever loop" using middle break technique using "break"
This construction is useful for solving fence post problems
*/

import java.util.*;

public class foreverLoopEx {
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		
		int sum = 0;
		for(;;) {					//forever loop, it will excute indefinitly unless the break is reached
			System.out.print("Next integer please (-1 to quit):");
			int number = console.nextInt();
			if(number == -1) {		//This is the actual check condition.
				break;
			}
			sum += number;
			System.out.println("a " + sum);
		}
		System.out.println("sum = " + sum);
	}
}

