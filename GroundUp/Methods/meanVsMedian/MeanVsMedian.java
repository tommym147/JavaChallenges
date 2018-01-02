// Thomas Mejia
// 1/2/2018
// Implement two methods that calculate the median of three integers and
// that calculate the average of three integers, rounding to the nearest integer
import java.util.Scanner;

public class MeanVsMedian {
	public static int median(int x, int y, int z) { // function that determines median
		if ((z > x && x > y) || (y > x && x > z)) {
			return x;
		}
		if ((x > y && y > z) || (z > y && y > x)) {
			return y;
		}
		return z;
	}
	
	public static int mean(int x, int y, int z) { // function that calculates mean
		return (int) (x + y + z)/3;
	}
	
	public static void versus(int theMedian, int theMean) { // function that determines if the median is smaller, larger, or equal to the mean
		if (theMedian > theMean) {
			System.out.println("The Median " + theMedian + " is larger than the mean " + theMean + ".");
		}
		else if (theMedian < theMean) {
			System.out.println("The Median " + theMedian + " is smaller than the mean " + theMean + ".");
		}
		else {
			System.out.println("The Median " + theMedian + " is equal to the mean " + theMean + ".");
		}
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // reads user input
		int x, y, z, theMedian, theMean; // x, y, z hold positive integer user input, the latter hold median and mean
		
		// ask for user input
		System.out.println("Please enter three integers: ");
		x = input.nextInt();
		y = input.nextInt();
		z = input.nextInt();
		
		// calculate median and mean
		theMedian = median(x,y,z);
		theMean = mean(x,y,z);
		
		// print results
		versus(theMedian, theMean);
	}
}