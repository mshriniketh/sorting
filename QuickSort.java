public class QuickSort {
	public static int compareNum; //static variables.
	public static int moveNum;
	public static void quickSort(int[] list) {
		quickSort(list, 0, list.length-1);
	}
	
	public static void quickSort(int[] list, int first, int last) {
		if (last > first) {
			compareNum++;
			int pivotIndex = partition(list, first, last);
			quickSort(list, first, pivotIndex -1);
			quickSort(list, pivotIndex + 1, last);
		}
	}
	
	/** Partition the array list[first..last] */
	public static int partition(int[] list, int first, int last) {
		int pivot = list[(first + last) / 2]; // Choose the first element as the pivot
		int low = first + 1; // Index for forward search
		int high = last; //Index for backward search
		
		while (high > low) {
			compareNum++;
			// Search forward from left
			while (low <= high && list[low] <= pivot) {
				compareNum++;
				low++;
			}
			
			// Search backward from right
			while (low <= high && list[high] > pivot) {
				compareNum++;
				high--;
			}
			
			//	Swap two elements in the list
			if (high > low) {
				compareNum++;
				int temp = list[high];
				moveNum++;
				list[high] = list[low];
				moveNum++;
				list[low] = temp;
				moveNum++;
			}
		}
		
		while (high > first && list[high] >= pivot) {
			compareNum++;
			high--;
		}
		
		//	Swap pivot with list[high]
		if (pivot > list[high]) {
			compareNum++;
			list[first] = list[high];
			moveNum++;
			list[high] = pivot;
			moveNum++;
			return high;
		}
		else {
			return first;
		}
	}
	public int getCompareNum(){
		return compareNum;
	}
	public int getMoveNum(){
		return moveNum;
	}
}
