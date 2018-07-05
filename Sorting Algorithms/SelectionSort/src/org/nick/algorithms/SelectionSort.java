package org.nick.algorithms;

public class SelectionSort {

	/* In-place algorithm
     *
     * Complexity (Worst case scenario): quadratic
	 * 
	 * Does not require as much swapping as bubble sort - usually performs better than bubble sort in average
	 * 
	 * Unstable algorithm
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		int[] array = {30,50,-100,-1000,1,2,3,7,-9,800,5,10,20,12,15};
		
		//Selection Sort ASC implementation
		//increasing the sorted partition, growing from right to left
		for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			int largest = 0; //the index of the largest element in the unsorted partition
			
			for(int i = 1; i <= lastUnsortedIndex; i++) { 
				if(array[i] > array[largest]) {
					largest = i;
				}
			}
			
			swap(array, largest, lastUnsortedIndex); //// swap the largest element with the last element in the unsorted partition 
		}
		
		printer(array);
		
		
		//Selection Sort DESC implementation
         for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			
			int minimum = 0; //the index of the minimum element in the unsorted partition
			
			for(int i = 1; i <= lastUnsortedIndex; i++) { 
				if(array[i] < array[minimum]) {
					minimum = i;
				}
			}
			
			swap(array, minimum, lastUnsortedIndex); // swap the minimum element with the last element in the unsorted partition
		}
		
         printer(array);
		

	}
	
	public static void swap(int[] array, int i, int j) {
		
		if(i == j) {
			return;
		}
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static void printer(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
