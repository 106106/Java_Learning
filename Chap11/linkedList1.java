/* Thursday, September 12, 2019
Practice using a linked list, and creating a iterator for the list, then 
using the iterator to remove even length strings
*/

import java.util.*;

public class linkedList1 {
	public static void main(String[] args) {
		LinkedList<String> words = new LinkedList<String>();	//creats a linkedlist object
		
		//adding words to the list called words.
		words.add("Once");
		words.add("upon");
		words.add("a");
		words.add("time");
		words.add("there");
		words.add("was");
		words.add("a");
		words.add("monkey");
		words.add("who");
		words.add("could");
		words.add("dance");
		
		//test longest method
		System.out.println(longest(words));
		
		//testing the word addition and removeEven
		System.out.println("words = " + words);
		removeEvenLength(words);
		System.out.println("words = " + words);
		
		//reverses the list using the Collections class 
		//Note: collection class != collections interface
		//interfaces are implemented by classes
		Collections.reverse(words);
		System.out.println("words = " + words);
	}	

	//removes the even length words from a list using a iterator.
	public static void removeEvenLength(LinkedList<String> list) {
		Iterator<String> i = list.iterator();
		while(i.hasNext()) {
			String element = i.next();
			if(element.length() % 2 == 0) {
				i.remove();
			}
		}
	}
	
	//returns the longest string in the given list
	//pre-condition: needs list.size() > 0
	//Note: uses List<String> instead of LinkedList<String> or ArrayList<String>
	//so the method can accept either and will still word. ABSTRACTION
	public static String longest(List<String> list) {
		Iterator<String> i = list.iterator();
		String result = i.next(); //to start comparing against
		while(i.hasNext()) {
			String next = i.next();
			if(next.length() > result.length()) {
				result = next;
			}			
		}
		return result;
	}

}
