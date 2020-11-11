/* Tuesday, August 27, 2019
Constructs a jagged 2d array containing the first rows of Pascal's triangle
*/

public class PascalsTriangle {
	public static void main(String[] args) {
		int[][] triangle = new int[11][]; //11 rows and the number of columns will be computed later
		fillIn(triangle);
		print(triangle);
	}

	public static void fillIn(int[][] triangle) {
		for(int i=0; i<triangle.length; i++) {			//triangle.lenght give number of rows
			triangle[i] = new int[i+1]; 				//creats the row with i+1 columns
			triangle[i][0] = 1; 						//first number of the row is always 1
			triangle[i][i] = 1;							//last number of the row is always 1
			for(int j=1; j<i; j++) {					//triangle[i].lenght gives number if columns
				triangle[i][j] = triangle[i-1][j-1] + triangle[i-1][j];
			}
		}
	}

	public static void print(int[][] triangle) {
		for(int i = 0; i<triangle.length; i++) {
			for(int j = 0; j<triangle[i].length; j++) {
				System.out.print(triangle[i][j] + " ");
			}
			System.out.println();
		}
	}
}
