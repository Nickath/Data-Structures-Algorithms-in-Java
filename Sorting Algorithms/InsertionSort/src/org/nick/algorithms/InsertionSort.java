package org.nick.algorithms;

public class InsertionSort {

	/*  In-place algorithm
	 * 
	 *  Complexity (Worst case): O(n^2)
	 *  
	 *  Stable algorithm
	 *  
	 *  Divides the array into sorted and unsorted partitions
	 *  Unlike the Selection sort, the Insertion sort grows the sorted partition from left to right
	 *  (starting from the 0-index element which is sorted as it is the unique element in the 
	 *  sorted partition
	 */
	public static void main(String[] args) {
		
        int array[] = {20,50,10,43,543,-43,-42,-245,5,21,5,1010};
        
        for(int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
        	
        	int newElement = array[firstUnsortedIndex]; //storing the element of the unsorted array temporary to newElement	in case we need to overwrite
       
        	int i;
        	//we want to keep looking for the insertion position as long as we havent hit the front of the array
        	for(i = firstUnsortedIndex; (i > 0 && array[i-1] > newElement); i--) {
        		array[i] = array[i-1];
        	}
        	
        	array[i] = newElement;
        }
        
        printer(array);
        
	}
	
	public static void printer(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
