/* SSSTriangleSolver.java -- Given three sides A, B, C returns the three
corresponding a, b, c where a is opposite A etc. 						*/

import java.util.*;

public class SSSTriangleSolver {
	public static void main (String[] args) {
		Scanner console = new Scanner(System.in);
		
		//Ask for and reads in the three sides.
		double A, B, C;
		double a, b, c;
		System.out.print("Please input the three side lengths separated by a space: ");
		A = console.nextDouble();
		B = console.nextDouble();
		C = console.nextDouble();
		System.out.println("A is " + A + " ,B is " + B + ",and C is " + C);
		System.out.println("So...");
		a = Math.toDegrees(Math.acos((C*C + B*B - A*A)/(2*B*C)));
		b = Math.toDegrees(Math.acos((A*A + C*C - B*B)/(2*A*C)));
		c = Math.toDegrees(Math.acos((A*A + B*B - C*C)/(2*A*B)));
		System.out.println("a is " + a + " ,b is " + b + ",and c is " + c);
	}
}