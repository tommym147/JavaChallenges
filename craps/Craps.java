// Thomas Mejia
// 12/31/2017
// Write a program that plays craps.
import java.util.Scanner;

public class Craps {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int x, roll, point;
		boolean rounds = false;
		
		System.out.println("Welcome to the game of Craps!");
		System.out.println("Press 1 to roll, 0 to exit.");
		x = input.nextInt();
		
		while (x == 1) {
			int die = (int)(6 * Math.random()) + 1;
			roll = die + ((int) (6 * Math.random()) + 1);
			System.out.println("You rolled " + roll);
			
			if (roll == 7 || roll == 11) {
				System.out.println("You win!");
			}
			else if (roll == 2 || roll == 3 || roll == 12) {
				System.out.println("You lose!");
			}
			else {
				point = roll;
				rounds = true;
				System.out.println("Your point is " + point + ". Continue rolling.");
					
				while (roll != 7 && rounds == true) {
					die = (int)(6 * Math.random()) + 1;
					roll = die + ((int) (6 * Math.random()) + 1);
					System.out.println("You rolled " + roll);
					if (roll == 7) {
						System.out.println("You lose!");
						rounds = false;
					}
					if (roll == point) {
						System.out.println("You win!");
						rounds = false;
					}
				}
			}
			System.out.println("Play again? Enter 1 to roll, 0 to exit.");
			x = input.nextInt();
		}
	}
}