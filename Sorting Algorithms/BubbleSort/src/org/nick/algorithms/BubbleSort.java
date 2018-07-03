package org.nick.algorithms;

public class BubbleSort {

	/*  Description:
	 * 
	 *  The Bubble Sort algorithm is an in-place algorithm (no need to create another array (f.e temporal)
	 *  to perform the sort
	 *  (In-place algorithms are called the algorithms where the extra memory used for the sort
	 *  does not increase as the number of items in the array increases
	 *  
	 *  Complexity:
	 *  
	 *  O(n^2) time complexity - quadratic 
	 *  
	 *  Degrades quicly
	 */
	
	
	public static void main(String[] args) {
		
		int[] intArray = {1,5,10,-5,25,-30,100,80,98,1000}; //sample of array of integers
		
		printer(intArray);
		
		// CLASSIC IMPLEMENTATION OF THE BUBBLE SORT ASCENDING ORDER
		
		for(int i = 0; i < intArray.length; i++) {
			for(int j = 0; j < intArray.length; j++) {
				if(intArray[i] < intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
			   }
		    }
	     }		
		
		//CLASSIC IMPLEMENTATION OF THE BUBBLE SORT DESCENDING ORDER
		
		for(int i = 0; i< intArray.length; i++) {
			for(int j = 0; j < intArray.length; j++) {
				if(intArray[i] > intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		

		//OPTIMIZED BUBBLESORT IN ASCENDING ORDER
		
		//FIRST IMPLEMENTATION
		for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
		    for(int i = 0; i < lastUnsortedIndex; i++) {
		    	if(intArray[i] > intArray[i+1] ) {
		    		swap(intArray, i, i+1);
		    	}
		    }
		}
		
		printer(intArray);
		
		//SECOND IMPLEMENTATION OF OPTIMIZED BUBBLESORT
		for(int firstUnsortedIndex = 0; firstUnsortedIndex <= intArray.length -1 ; firstUnsortedIndex++) {
		    for(int i = 0; i < firstUnsortedIndex; i++) {
		    	if(intArray[i] > intArray[i+1] ) {
		    		swap(intArray, i, i+1);
		    	}
		    }
		}
		
		
		

		printer(intArray);
		
		//DESCENDING ORDER
		
		//OPTIMIZED FIRST IMPLEMENTATION
		for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
		    for(int i = 0; i < lastUnsortedIndex; i++) {
		    	if(intArray[i] < intArray[i+1] ) {
		    		swap(intArray, i, i+1);
		    	}
		    }
		}
		
		printer(intArray);
		
		//OPTIMIZED SECOND IMPLEMENTATION
		for(int firstUnsortedIndex = 0; firstUnsortedIndex < intArray.length-1; firstUnsortedIndex++) {
		    for(int i = 0; i < firstUnsortedIndex; i++) {
		    	if(intArray[i] < intArray[i+1] ) {
		    		swap(intArray, i, i+1);
		    	}
		    }
		}
		
		printer(intArray);
		
		
		//This implementation can handle the scenario where the array is already sorted
		
		boolean swapped = true;
        while(swapped) {
            swapped = false;
            for(int i = 0; i < intArray.length - 1; i++) {
                if(intArray[i] > intArray[i + 1]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[i + 1];
                    intArray[i + 1] = temp;
                    swapped = true;
                }
            }
        }
        
        printer(intArray);

	}

	
	public static void swap(int[] array, int i, int j) {
		
		if(i==j) {
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
