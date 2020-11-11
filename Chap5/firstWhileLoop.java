// firstWhileLoop.java -- simple while loop example.

import java.util.*;

public class firstWhileLoop {
	public static void main(String[] arg){
		
		int number = 1;
		System.out.println(number);
		while(number<= 40000){
			number *= 2;
			System.out.println(number);
		}
	}
}