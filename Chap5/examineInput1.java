/*
Tuesday, august 6, 2019
This program examins the ways a token can be read using the "has" methods
Try as imput "348", "Hello world", "348.2", and "5fkk6"
*/

import java.util.*;

public class examineInput1 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("token? ");
		System.out.println("  hasNextint = " + console.hasNextInt());
		System.out.println("  hasNextDouble = " + console.hasNextDouble());
		System.out.println("  hasNext = " + console.hasNext());
	}
}

