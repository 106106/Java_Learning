// divideByTwo.java -- divide a number by two until it reachs 0?

import java.util.*;
 
public class divideByTwo {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Type a number: ");
		
		int number = console.nextInt();
		 
		 while(number > 0 ) {
		 	number = number/2;
		 	System.out.println(number);
		 }
	}
}