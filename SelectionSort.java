
public class SelectionSort {
	/** The method for sorting the numbers */
	public static int compareNum; //static variables.
	public static int moveNum;
	public static void selectionSort(int[] list) { //int[] list?
		for (int i = 0; i < list.length -1; i++) {
			// Find the minimum in the list[i..list.length-1]
			int currentMin = list[i];
			int currentMinIndex = i;
			
			for (int j = i+1; j < list.length; j++) {
				compareNum++;
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			//	Swap list[i] wiht list[currentMinIndex[ if necessary
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
				moveNum++;
			}
		}
	}
	public int getCompareNum(){
		return compareNum;
	}
	public int getMoveNum(){
		return moveNum;
	}
}
