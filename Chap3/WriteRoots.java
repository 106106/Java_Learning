/* WriteRoots.java -- the square roots of 1-20 */
public class WriteRoots {
	public static void main(String[] args) {
		for(int i = 1; i <= 20; i++){
			double root = Math.sqrt(i);
			System.out.println("sqrt(" + i + ") = " + root);
		}
	}
} 