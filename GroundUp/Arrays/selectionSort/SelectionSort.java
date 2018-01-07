// Thomas Mejia
// 1/7/2018
// Write a program that sorts an array by using selection sort

public class SelectionSort {
	public static void swap(int [] array, int i, int j) { // function to swap values
		int temp = array[i]; // hold first value
		array[i] = array[j]; // copy second value to first index
		array[j] = temp; // copy first value to second index
	}
	
	public static void selectionSort(int [] array) {
		for (int i = 0; i < array.length; i++) { // main iterator
			int minIndex = i, // minIndex to record min value index
			minValue = array[i]; // minValue to record min value
			
			// find min value in array in each iteration
			for (int j = i; j < array.length; j++) {
				if (array[j] < minValue) {
					minValue = array[j];
					minIndex = j;
				}
			}
			// swap with current index
			swap(array, i, minIndex);
		}
	}
	
	public static void printArray(int [] array) { // function that iterates through array and prints elements
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		int [] array = {33, 21, 98, 43, 88, 80, 14, 1}; // array that holds integer values
		
		// print content of unsorted array
		System.out.println("Original content of array: ");
		printArray(array);
		
		selectionSort(array); // sort by using selection sort
		
		// print content of sorted array
		System.out.println("New content of array: ");
		printArray(array);
	}
}