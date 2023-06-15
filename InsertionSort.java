
public class InsertionSort {
	/**The method for sorting the numbers */
	public static int compareNum; //static variables.
	public static int moveNum;
	public static void insertionSort(int[] list) {
		for (int i = 1; i < list.length; i++) {
			compareNum++;
			/** Insert list[i] into a sorted sublist list[0..i-1] so that 
			 * 	list[0..i] is sorted
			 */
			int currentElement = list[i];
			moveNum++;
			int k;
			for (k = i-1; k>= 0 && list[k] > currentElement; k--) {
				compareNum++;
				list[k+1] = list[k];
				moveNum++;
			}
			
			//insert the current element into list[k + 1]
			list[k + 1] = currentElement;
			moveNum++;
			
		}
	}
	public int getCompareNum(){
		return compareNum;
	}
	public int getMoveNum(){
		return moveNum;
	}
}
