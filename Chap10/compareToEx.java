/* Tuesday, Septemper 10, 2019
compare to equivalents to primitive comparisons
*/

import java.util.*;

public class compareToEx {
	public static void main(String[] args) {
		Integer x = 2;
		Integer y = 3;

		if(x.compareTo(y) < 0) {
			System.out.println("less than");			//x<y
		}

		if(x.compareTo(y) <= 0) {
			System.out.println("less than or equal");	//x<=y
		}

		if(x.compareTo(y) == 0) {
			System.out.println("equal");				//x==y
		}
		
		if(x.compareTo(y) != 0) {
			System.out.println("not equal");			//x!=y
		}

		if(x.compareTo(y) > 0) {
			System.out.println("great than");			//x>y
		}
		
		if(x.compareTo(y) >= 0) {
			System.out.println("great than or equal");	//x>=y
		}
	}
}

