// Thomas Mejia
// 12/28/2017
// Write a program that accepts an integer n and prints the following right
// triangle with base and height n.
import java.util.Scanner;

public class Pictures {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		int triangle;
		String x = "";
		
		System.out.println("Please enter an integer: ");
		triangle = input.nextInt();
		
		for (int i = 0; i < triangle; i++) {
			x = x + "X";
			System.out.println(x);
		}
	}
}