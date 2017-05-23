// Thomas Mejia 5/23/17
// Write an application that inputs one number consisting of five digits from the user,
// separates the number into its individual digits and prints the digits separated
// from one another by three spaces each.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.NumberFormatException;

public class SeparateDigits {
	public static void main (String [] args) {
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader console = new BufferedReader(reader);

		// ask for user input
		System.out.println("Enter 5 digit integer: ");
		try {
			String input = console.readLine();
			while (input.length() != 5) { // check if 5 digits were inputed
				System.out.println("Invalid input. Please enter 5 digit integer.");
				input = console.readLine();
			}
			// check if string is numeric
			Integer.parseInt(input);

			// separate digits
			for (int i = 0; i < input.length(); i++) {
				System.out.print(input.charAt(i) + "   ");
			}
		}
		catch (IOException | NumberFormatException e) {
			System.out.println(e);
		}
	}
}
