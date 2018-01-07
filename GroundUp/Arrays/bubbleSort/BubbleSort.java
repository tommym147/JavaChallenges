// Thomas Mejia
// 1/7/2018
// Write a program that sorts an array using bubble sort

public class BubbleSort {
	public static void swap(int [] array, int i, int j) { // function to swap values
		int temp = array[i]; // hold first value
		array[i] = array[j]; // copy second value to first index
		array[j] = temp; // copy first value to second index
	}
	
	public static void bubbleSort(int [] array) {
		for (int i = array.length - 1; i > 0; i--) { // iterates through array once backwards
			for (int j = 0; j < i; j++) { // iterates forward to get max value to the end
				if (array[j] > array[j+1]) {
					swap(array, j, j+1);
				}
			}
		}
	}
	
	public static void printArray(int [] array) { // function that iterates through array and prints elements
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		int [] array = {19, 88, 4, 47, 23, 90, 76, 55}; // array that holds integer values
		
		// print content of unsorted array
		System.out.println("Original content of array: ");
		printArray(array);
		
		bubbleSort(array); // sort by using bubble sort
		
		// print content of sorted array
		System.out.println("New content of array: ");
		printArray(array);
	}
}