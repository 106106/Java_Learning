/* Tuesday, August 27, 2019
Example of a for-each loop.
Creates an array and fills each entry with a random number then prints the array.
Note: for each can't be used to fill the array because changing the variable n does not change the array.
i.e. the array will be fill with the same random number for all.
*/

import java.util.*;

public class forEachExample {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[99];
		//for-each loop
		for(int n=0; n<arr.length; n++) {
			int next = r.nextInt(11);
			arr[n] = next;
		}
		//prints the array
		for(int n: arr) {
			System.out.print(n+ " ");
		}
	}
}
