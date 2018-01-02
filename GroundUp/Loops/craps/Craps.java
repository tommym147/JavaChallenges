// Thomas Mejia
// 12/31/2017
// Write a program that plays craps.
import java.util.Scanner;

public class Craps {
	public static int diceRoll() { // function that returns the sum of 2 randomly generated numbers
		int roll = ((int)(6 * Math.random()) + 1) + ((int) (6 * Math.random()) + 1);
		System.out.println("You rolled " + roll);
		return roll;
	}
	
	public static void pointPhase(int roll) { // function plays point phase
		int point = roll; // holds point number
		boolean rounds = true; // check to see when the round is over
		System.out.println("Your point is " + point + ". Continue rolling.");
			
		while (roll != 7 && rounds == true) { //keeps looping until roll is 7 or the point number
			roll = diceRoll();
			if (roll == point) { // user wins if roll matches point number
				System.out.println("You win!");
				rounds = false;
			}
			if (roll == 7) { // user loses if roll is 7
				System.out.println("You lose!");
				rounds = false;
			}
		}
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // read user input
		int x, roll, point; // hold play input, dice rolls, and point number
		
		// ask for user input
		System.out.println("Welcome to the game of Craps!");
		System.out.println("Press 1 to roll, 0 to exit.");
		x = input.nextInt();
		
		// keep looping until user doesn't hit 1
		while (x == 1) {
			roll = diceRoll();
			
			if (roll == 7 || roll == 11) { // user wins if roll is 7 or 11
				System.out.println("You win!");
			}
			else if (roll == 2 || roll == 3 || roll == 12) { // user loses if roll is 2, 3, or 12
				System.out.println("You lose!");
			}
			else {
				pointPhase(roll); // user engages point phase if any other number is rolled
			}
			System.out.println("Play again? Enter 1 to roll, 0 to exit."); // ask again if user wants to play again
			x = input.nextInt();
		}
	}
}