/* Wednesday, August 28, 2019
Practicing Inheritance
Client program of A,B,C,and D.
*/

public class ABCDMain {
	public static void main(String[] args) {
		A[] elements = {new A(), new B(), new C(), new D()};
		
		for(int i=0;i<elements.length;i++) {
			System.out.println(elements[i]);
			elements[i].m1();
			elements[i].m2();
			System.out.println();
		}
		B b = (B) elements[1];
		b.m3();
	}
}
