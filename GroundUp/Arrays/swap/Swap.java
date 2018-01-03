// Thomas Mejia
// 1/3/2018
// Write a method that accepts an array reference and two array
// indexes and interchanges the contents of them.

public class Swap {
	public static void printArray(int [] array) { // function that prints the array
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int [] array, int i, int j) { // function that swaps two indexes of an array
		int temp = array[i]; // temporarily hold i index value
		array[i] = array[j]; // i index copies j value
		array[j] = temp; // j value copies the temp value which had i's original value
	}
	
	public static void main(String [] args) {
		int [] array = {4,2,3,1,5};
		
		System.out.println("Original content of array: "); // print original array
		printArray(array);
		
		swap(array, 0, 3); // swap index values
		
		System.out.println("New content of array with 0 and 3 indexes swapped: "); // print array with swapped indexes
		printArray(array);
	}
}