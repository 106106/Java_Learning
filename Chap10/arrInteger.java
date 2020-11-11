/* Tuesday, September 10, 2019
Practice using ArrayList<Integer>, i.e. using an array list with primitive data
needs a wrapper class since ArrayList<E> deals with objects and int's etc. are not objects.
*/

import java.util.*;

public class arrInteger {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();	
		list.add(13);
		list.add(12);
		list.add(11);
		list.add(10);

		int sum = 0;
		for(int n : list) {
			sum += n;
		}
		System.out.println("The list is " + list);
		System.out.println(sum);
	}
}
