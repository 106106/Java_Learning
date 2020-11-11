
/* Wednesday, August 7, 2019
Counts the number of "words" in testData.txt
Illustrates the throws clause and Scanner object creation with a file as input.
*/

import java.io.*;				// for the File object
import java.util.*;				// for the Scanner object

public class countNumberOfWords {
	public static void main(String args[]) throws FileNotFoundException {		//throws says this method wont deal with FileNotFoundException
		Scanner input = new Scanner(new File("testData.txt"));					//the Scanner object takes input from testData.txt
		int count = 0;
		while(input.hasNext()) {
			String word = input.next();
			count++;
		}
		System.out.println("total words = " + count);
	}
}

