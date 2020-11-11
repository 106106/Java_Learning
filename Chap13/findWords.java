/* Friday, September 13, 2019
Searches for a word in the file "words.txt" 
and reports the words possition in the file
*/

import java.util.*;
import java.io.*;

public class findWords {
	public static void main(String[] args) throws FileNotFoundException {
		//reads in "words.txt"
		Scanner in = new Scanner(new File("words.txt"));
		List<String> words = new ArrayList<String>();
		while(in.hasNext()) {
			String word = in.next();
			words.add(word);
		}
		System.out.println(words);

		//Sorts words so that we can binary search
		Collections.sort(words);
		System.out.println(words);
		
		//binary search the list for a word
		System.out.print("Your word? ");
		Scanner console = new Scanner(System.in);
		String target = console.nextLine();
		int index = Collections.binarySearch(words, target);
		if(index >= 0) {
			System.out.println(target + " is word # " + index);
		} else {
			System.out.println(target + " is not found");
		}
	}
}
