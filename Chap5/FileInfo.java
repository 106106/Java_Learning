
/* Wednesday, August 7, 2019
Demonstrates reading in a file and reporting some info about the file.
Note: this program requires that testData.txt be in the same folder.
*/

import java.io.*;											 //for reading the file

public class FileInfo {
	public static void main(String args[]){
		File f = new File("testData.txt");					//creating a file object to read in info from testData.txt
		System.out.println("exists returns " + f.exists());
		System.out.println("canRead returns " + f.canRead());
		System.out.println("length returns " + f.length());
		System.out.println("getAbsolutePath returns " + f.getAbsolutePath());
	}
}

