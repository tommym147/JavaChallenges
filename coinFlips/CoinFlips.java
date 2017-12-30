// Thomas Mejia
// 12/29/2017
// Write a program that simulates flipping a coin 100,000 times and reports
// the longest consectutive sequence of heads.

public class CoinFlips {
	public static void main(String [] args) {
		int flip, counter = 0, max = 0;
		boolean sequence = false;

		for (int i = 0; i < 100000; i++) {
			flip = (int) (Math.random() + .5);
			if (flip == 0 && sequence == true) {
				counter++;
				if (counter > max) {
					max = counter;
				}
			}
			else if (flip == 0) {
				sequence = true;
				counter++;
			}
			else {
				sequence = false;
				counter = 0;
			}
		}

		System.out.println("Longest consecutive sequence of heads: " + max);
	}
}
