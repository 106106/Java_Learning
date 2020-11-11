/* Tuesday, August 27, 2019
Reads a series of values between 0 and 4 and reports the frequency of each value
Used with the tally.txt file
*/

import java.io.*;
import java.util.*;

public class tally {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(new File("tally.txt"));
		int[] count = new int[51];
		//reads data from tally.txt
		while(input.hasNextInt()) {
			int next = input.nextInt();
			count[next]++;
		}
		//Reports frequencies
		System.out.println("Value\tOccurrences");
		for(int i=0; i<count.length; i++) {
			System.out.println(i + "\t" + count[i]);
		}
	}
}
