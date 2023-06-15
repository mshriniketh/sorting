
public class HeapSort {
	/** Heap sort method */
	public static int compareNum; //static variables
	public static int moveNum;
	public static <E extends Comparable<E>> void heapSort(E[] list) {
		//	Create a Heap of integers
		Heap<E> heap = new Heap<>();
		
		//	Add elements to the heap
		for (int i = 0; i < list.length; i++) {
			compareNum++;
			heap.add(list[i]);
		}
		
		//	Remove elements from the heap
		for (int i = list.length -1; i >= 0; i--) {
			compareNum++;
			list[i] = heap.remove();
			moveNum++;
		}
	}
	
	
 	/**	A test method */
	public static void main(String[] args) {
		Integer[] list = {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
		heapSort(list);
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i] + " ");
		}
	}
	public int getCompareNum(){
		return compareNum;
	} //getter methods.
	public int getMoveNum(){
		return moveNum;
	}
	
}
