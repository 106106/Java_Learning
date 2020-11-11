/* Thursday, September 12, 2019
Practice using the Set ADT
specifically the HashSet<String> object
*/

import java.util.*;

public class set1 {
	public static void main(String[] args) {
		//Creates the set object 
		Set<String> words = new HashSet<String>();
		//Adding words to it, Note: duplicates won't be added
		words.add("Hello");
		words.add("bye");
		words.add("hello");
		words.add("Hello");		//won't be added
		words.add("Bye");		
		words.add("bye");		//won't be added
		words.add("hello");		//won't be added

		//checks the set
		System.out.println("the words added are " + words);
	}
}
