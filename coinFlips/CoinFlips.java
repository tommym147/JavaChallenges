// Thomas Mejia
// 12/29/2017
// Write a program that simulates flipping a coin 100,000 times and reports
// the longest consecutive sequence of heads.

public class CoinFlips {
	public static void main(String [] args) {
		int flip, counter = 0, max = 0; // flip holds randomly generated 1 or 0, counter holds consecutive heads (0's), max holds longest sequence
		boolean sequence = false; // checks if there's a sequence of heads

		for (int i = 0; i < 100000; i++) {
			flip = (int) (Math.random() + .5); // generate random number
			if (flip == 0 && sequence == true) { // if heads and already in a sequence
				counter++;
				if (counter > max) { // check if sequence is greater than previous
					max = counter;
				}
			}
			else if (flip == 0) { // increment counter and set sequence to true if heads
				sequence = true;
				counter++;
			}
			else { // set sequence to false and counter to 0 if tails
				sequence = false;
				counter = 0;
			}
		}

		System.out.println("Longest consecutive sequence of heads: " + max); // print max sequence
	}
}
