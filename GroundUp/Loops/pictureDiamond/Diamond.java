// Thomas Mejia
// 12/29/2017
// Write a program that accepts an integer n and prints the following
// picture of a diamond with 2n - 1 rows
import java.util.Scanner;

public class Diamond {
	public static void createTriangle(int i, int rows) {
		String x = "X", spaces = ""; // String print outs
		int n = (i * 2) - 1; // number of times X will print to form diamond
		
		// Create diamond line by concatenating "X" n number of times
		for (int j = 0; j <= n; j++) {
			x = x + "X";
		}
		// Create diamond shape by concatenating spaces
		for (int j = rows - i; j > 0; j--) {
			spaces += " ";
		}
		System.out.println(spaces + x);
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int rows;
		
		// Ask for user input
		System.out.println("Please enter an integer: ");
		rows = input.nextInt();
		
		// Create top of diamond
		for (int i = 0; i < rows; i++) {
			createTriangle(i, rows);
		}
		
		// Create bottom of diamond
		for (int i = rows; i >= 0; i--) {
			createTriangle(i, rows);
		}
	}
}