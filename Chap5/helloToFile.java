
/* Friday, August 9, 2019
This program uses a printstream to output text to a file hello.txt
learning to use the PrintStream class
*/

import java.io.*;

public class helloToFile {
	public static void main(String args[]) throws FileNotFoundException {	//Remember when using file objects need to throw or catch exceptions
		PrintStream output = new PrintStream(new File("hello.txt"));			//creats a file object and then a printstream object to the file
		output.println();
		output.println("Hello world");
		output.println("hello file");
		output.println("Goodbye, au'revoir, adios, chow"); 
	}
}

