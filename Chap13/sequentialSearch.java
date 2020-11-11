/* Tuesday, September 17, 2019
search algorithms of an integer array
*/

public class searchAlgos {
	public static void main(String[] args) {
		
	}
	
	//Sequential search algorithm
	//returns the index of the first occurence of the given target number
	//returns -1 if the target is not found
	public static int sequential(int[] list, int target) {
		for(int i=0;i<list.length;i++) {
			if(list[i]==target) return i;
		}
		return -1; //not found
	}
	
	//Binary search algorithm
	//returns the index of the first occurence of the given target number
	//returns -1 if the target is not found
	//Arrays.sort(list);		//need a sorted array to work
	public static int binary(int[] list, int target) {
		
		int min=0;
		int max=list.length-1;

		while(min<=max) {
			int mid = (max+min)/2;
			if(list[mid]==target){
				return mid;			//found it
			} else if(list[mid]<target) {
				min = mid + 1;		//too small
			} else {
				max = mid - 1;		//too big
			}
		}

		return -1;		//not found
	}
}
