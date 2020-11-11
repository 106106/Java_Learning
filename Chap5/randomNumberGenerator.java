// randomNumberGenerator.java -- creates a pseudorandom number 1-100

import java.util.*;

public class randomNumberGenerator {
	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextInt(100) + 1);
	}
}