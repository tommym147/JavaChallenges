// Thomas Mejia
// 1/4/2018
// Write a program that sorts an array using insertion sort

public class InsertionSort {
	public static void insertionSort(int [] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i]; // save current iteration element
			int j = i; // j will iterate backwards to start of array
			
			// while each previous element is bigger than temp 
			// and j hasn't reached the beginning of array
			while (j > 0 && temp < array[j - 1]) {
				array[j] = array[j-1]; // copy previous elements if bigger
				j--; // iterate to beginning
			}
			array[j] = temp; // copy temp to index that has a smaller previous value
		}
	}
	
	public static void printArray(int [] array) { // function that iterates through array and prints elements
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		int [] array = {5, 2, 4, 3, 7, 5, 1, 9}; // array that holds integer values

		// print content of unsorted array
		System.out.println("Original content of array: ");
		printArray(array);
		
		insertionSort(array); // sort by using insertion sort
		
		// print content of sorted array
		System.out.println("New content of array: ");
		printArray(array);
	}
}