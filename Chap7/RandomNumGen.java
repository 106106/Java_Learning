/* Tuesday, August 27, 2019
program to fill tally.txt with random numbers between 0 and 4.
*/

import java.util.*;

public class RandomNumGen {
	public static void main(String[] args) {
		Random r = new Random();
		for(int i=0; i<1000; i++) {
			System.out.print(r.nextInt(51) + " ");
		}
	}
}
