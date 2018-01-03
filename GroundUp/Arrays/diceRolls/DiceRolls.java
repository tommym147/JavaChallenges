// Thomas Mejia
// 1/2/2018
// Write a program that simulates rolling two dice 100,000 times and
// displays the number of occurrences of each from 2 to 12

public class DiceRolls {
	public static void rolls(int [] array) {
		int roll; // holds roll value
		for (int i = 0; i < 100000; i++)  { // simulate 100000 rolls
			roll = ((int) (6 * Math.random()) + 1) + ((int) (6 * Math.random()) + 1);
			array[roll-2]++; // increment index equal to roll value to record it
		}
	}
	
	public static void displayOccurrences(int [] array) { // print roll results
		System.out.println("Number of occurrences: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Roll " + (i+2) + ": " + array[i]);
		}
	}
	
	public static void main(String [] args) {
		int [] array = new int [11]; // declare array
		
		rolls(array); // simulate dice rolls
		displayOccurrences(array); // print results
	}
}