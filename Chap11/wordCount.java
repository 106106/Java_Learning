/* Thursday, September 12, 2019
Practice using the Map ADT to count number of wqords in a file
Used with wordCountText.txt
*/

import java.io.*;
import java.util.*;

public class wordCount {
	
	//minimum number of occurrences needed to be printed
	public static final int OCCURRENCES = 9;

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println();

		//read the text into a map
		Scanner in = new Scanner(new File("wordCountText.txt"));
		Map<String, Integer> wordCountMap = getCountMap(in);
		
		//Calculates the word count
		//and prints the number of occurrences of each word with more than OCCURRENCES
		for(String word: wordCountMap.keySet()) {
			int count = wordCountMap.get(word);
			if(count>=OCCURRENCES) {
				System.out.println(word + " occurs " + count + " times.");	
			}
		}
	}

	//Read the scanner object into a map and returns a map
	public static Map<String, Integer> getCountMap(Scanner in) {
		Map<String, Integer> wordCountMap = new TreeMap<String, Integer>(); //since the data has a natural order we use treemap
		
		while(in.hasNext()) {
			String word = in.next().toLowerCase();
			if(!wordCountMap.containsKey(word)) {
				wordCountMap.put(word, 1);			//adds the words since it hasn't been seen before
			} else {
				int count = wordCountMap.get(word);
				wordCountMap.put(word, count + 1);	//put replaces the old occurence of word/key
			}
		}
		
		return wordCountMap;
	}
}
