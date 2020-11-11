/* Tuesday, September 17, 2019
Code that can be used to time how long another piece of code takes.
*/

import java.util.*;

public class timingCode {
	public static void main(String[] args) {
		
		//START timer
		long starttime = System.currentTimeMillis(); //get the current epoch from the system

		//code to be timed
		//for example...
		for(int i=0;i<1000;i++) {
			for(int j=0;j<1000;j++) {
				System.out.print("1 instruction excuted");
			}
		}

		//END timer
		long endtime = System.currentTimeMillis(); //get the current epoch from the system
		
		//compute the difference between the starttime and endtime
		System.out.println("Elapsed milliseconds: " + (endtime-starttime));
	}	
}
