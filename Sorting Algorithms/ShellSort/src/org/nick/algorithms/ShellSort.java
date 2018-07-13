package org.nick.algorithms;

/**
 * 
 * @author NICK
 * Shell Sort is a variation of Insertion Sort
 * Unlike Insertion Sort which chooses which element to insert using a gap of 1, Shell Sort uses 
 * a bigger one 
 * The goal of shell sort is to reduce the amount of shifting required
 * 
 * In-place algorithm
 * Difficult to nail down the time complexity because it will depend on the chosen gap
 * Complexity O(n^2) (Worst case), but usually performs much better
 * Does not require as much shifting as insertion sort 
 * Unstable algorithm
 */
public class ShellSort {

	public static void main(String[] args) {
		
		int[] array = {10,50,20,-10,-20,-18,4,5,1,3432,434,2,-34,100};
	
		//starting with a gap of length/2 and divide it by two on each step
		for(int gap = array.length / 2; gap > 0; gap /=2) {
			
			for(int i = gap; i < array.length; i++) {
				int newElement = array[i];
				
				int j = i;
				
				while(j >= gap && array[j - gap] > newElement) {
					array[j] = array[j - gap];
					j -= gap;
				}
				
				array[j] = newElement;
			}
		}
		
		printer(array);
	
	}
	
	public static void printer(int[] array) {
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
