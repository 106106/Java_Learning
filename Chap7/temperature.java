/* Tuesday, August 27, 2019
practicing making arrays and using vim syntax highlighting
*/

import java.util.*;

public class temperature {
	public static void main(String[] args) {
		//Input and data structure set up.
		Scanner console = new Scanner(System.in);
		System.out.print("How many temperatures to input? ");
		int numOfTemps = console.nextInt();
		double[] temps = new double[numOfTemps];

		//Read in temps and calculate their average.
		double sum = 0.0;
		for(int i=0; i<temps.length; i++) {
			System.out.print("Temp " + (i+1) + " is: ");
			temps[i] = console.nextDouble();
			sum += temps[i];
		}
		double avr = sum/numOfTemps;
		
		//Count the temps above avr.
		int numAbove = 0;
		for(int i=0; i<temps.length; i++) {
			if(temps[i]>avr) numAbove++;
		}

		//Report info.
		System.out.println();
		System.out.println("\n" + "Average = " + avr);
		System.out.println("There were " + numAbove + " temps above average");
	}
}
