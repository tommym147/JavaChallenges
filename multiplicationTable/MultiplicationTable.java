// Thomas Mejia
// 12/30/2017
// Write a program to generate a multiplication table.

public class MultiplicationTable {
	public static void row(int i) { // multiplies i to create table
		for (int j = 0; j <= 9; j++) {
			System.out.print((j * i) + "\t"); // multiply row number by incrementing j
		}
		System.out.println();
	}
	
	public static void main(String [] args) {
		// top row
		for (int i = 0; i <= 9; i++) {
			System.out.print("\t"+i);
		}
		System.out.println();
		
		// sequential rows (0 - 9)
		for (int i = 0; i <= 9; i++) {
			System.out.print(i+"\t"); // display with row it is
			row(i); // create row
		}
	}
}