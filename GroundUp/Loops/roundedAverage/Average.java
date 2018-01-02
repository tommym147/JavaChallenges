// Thomas Mejia
// 12/30/2017
// Write a program that calculates the average of n test scores, such that
// each score is an integer in the range of 0 through 100.
import java.util.Scanner;

public class Average {
	public static int numberOfTests(Scanner input) { // function to return number of tests user inputs
		// Ask for user input
		System.out.println("How many tests would you like to input?");
		int t = input.nextInt();
		
		while (t < 0 || t > 20) { // if integer is invalid, ask again
			System.out.println("Invalid input. Enter integer from 0 to 20.");
			t = input.nextInt();
		}
		
		return t; // return tests
	}
	
	public static double getAverage(int tests, Scanner input) { // function to calculate average
		double average = 0.0; // holds average
		System.out.println("Enter scores: ");
		for (int i = 0; i < tests; i++) { // ask for scores for each test
			int score = input.nextInt();
			
			while (score < 0 || score > 100) { // checks if scores are in valid range
				System.out.println("Invalid input. Enter integer from 0 to 100.");
				score = input.nextInt();
			}
			
			average += score; // adds each score to average
		}
		return average /= (double)tests; // returns average by adding sum of scores divided by number of tests
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // read user input
		int tests; // holds number of tests
		double roundedAverage = 0.0; // holds rounded average of test scores
		
		tests = numberOfTests(input); // get number of tests
		roundedAverage = getAverage(tests, input); // get average test scores
		
		System.out.println("Rounded average: " + (int)roundedAverage); // print out rounded average
	}
}