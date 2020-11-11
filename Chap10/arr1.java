/* Tuesday, September 10, 2019
practice using a ArrayList<String>, adding and removing entries
*/

import java.util.*;

public class arr1 {
	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<String>();

		words.add("four");
		words.add("score");
		words.add("and");
		words.add("seven");
		words.add("years");
		words.add("ago");
		System.out.println("words = " + words);

		for(int i = 0; i < words.size(); i += 2) {
			words.add(i, "~");
		}
		System.out.println("words = " + words);
		
		for(int i = 0; i < words.size(); i++) {
			words.remove(i);
		}
		System.out.println("words = " + words);
		
		for(int i = words.size()-1; i >= 0; i--) {
			words.add(i, "*");
		}
		System.out.println("words = " + words);

		for(int i = words.size()-2; i>=0 ; i -= 2) {
			words.remove(i);
		}
		System.out.println("words = " + words);

		int sum = 0;
		for(String s : words) {
			sum += s.length();
		}
		System.out.println("Total characters = " + sum);
	}
}
