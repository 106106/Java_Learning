/* Tuesday, August 27, 2019
Tests the point object class
*/

public class PointMain {
	public static void main(String[] args) {
		Point p1 = new Point(7,2);
		Point p2 = new Point(4,3);
		Point p3 = new Point();

		System.out.println("p1 is " + p1);
		System.out.println("p2 is " + p2);
		System.out.println("p3 is " + p3);

		System.out.println(p1.distanceFromOrigin());
		System.out.println(p2.distanceFromOrigin());
		System.out.println(p3.distanceFromOrigin());

		p1.translate(11, 6);
		p2.translate(1, 7);
		p3.translate(1, 1);
		
		System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
        System.out.println("p3 is " + p3);

		Point p4 = new Point(1,1);
		System.out.println(p4.equals(p3));
		System.out.println(p4.equals(p2));
	}
}
