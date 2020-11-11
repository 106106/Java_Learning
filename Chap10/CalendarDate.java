/* Tuesday, September 10, 2019
practice implementing the comparable interface
CalenderDate just stores day and month
*/

public class CalendarDate implements Comparable<CalendarDate> {
	private int month;
	private int day;

	public CalendarDate(int month, int day) {	//constructor method, not the this. since parameters are overloaded
		this.month = month;
		this.day = day;
	}

	//compare this calendar date to another calendar date.
	public int compareTo(CalendarDate other) {	//note that the method name matchs compareTo inorder to overide/implement
		if(month != other.month){
			return month - other.month;			//will return negative if month is less than other etc
		} else {
			return day - other.day;				//will return negative if day is less than other etc
		}
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	//implements toString()
	public String toString() {
		return month + "/" + day;
	}
	
}
