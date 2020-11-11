/* Friday, September 13, 2019
Practice creating recursive functions

integer exponentiation
*/

public class recursiveFunctions1 {
	public static void main(String[] args) throws IllegalArgumentException {
		//gets input from the first 2 command line arguments and parses them
		try{
			try {
   				int x = Integer.parseInt(args[0]);
				int y = Integer.parseInt(args[1]);
				System.out.println("x is " + x + " :: y is " + y); 
				int power =	pow(x,y);
				System.out.println(power);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("needs two natural number command line arguments");
			}
		} catch (NumberFormatException e) {
   			System.out.println("needs to be numbers");
		}
	}

	public static int pow(int x, int y) {
		if(y<0) {
			throw new IllegalArgumentException("negative exponent");
		//base case
		} else if(y == 0) {
			return 1;
		//recursion for even y
		} else if(y % 2 == 0) {
			return pow(x * x, y / 2);
		//recursion for odd y
		} else {
			return x * pow(x, y - 1);
		}
	}
}
