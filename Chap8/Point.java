/* Tuesday, August 27, 2019
point object class
practicing object creation
*/

public class Point {

	private int x;
	private int y;

	//constructs a point at the origin
	public Point() {
		this(0,0);
	}

	//constructs a new point at a given location
	public Point(int x, int y) {
		setLocation(x,y);
	}
	
	//gets the x-coordinate
	public int getX() {
		return x;
	}

	//gets the y-coordinate
	public int getY() {
		return y;
	}

	//set a new location for the point
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}

	//swifts points location by dx for x and dy for y
	public void translate(int dx, int dy) {
		setLocation(x+dx,y+dy);
	}
	
	//returns distance between this point and (0,0)
	public double distanceFromOrigin() {
		return Math.sqrt((x*x)+(y*y));
	}

	//toString method prints in the form "(x, y)"
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	//return whether to point have the same coordinates
	public boolean equals(Object o) {
		if(o instanceof Point) {
			Point temp = (Point) o;		
			return (x==temp.getX() && y==temp.getY());
		} else {
			return false;
		}
	}


}
