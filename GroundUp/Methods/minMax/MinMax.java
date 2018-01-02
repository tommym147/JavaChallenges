// Thomas Mejia
// 1/1/2018
// Write two methods, each of which accepts two integers x and y, and 
// outputs the larger/smaller of the two respectively.
import java.util.Scanner;

public class MinMax {
	public static int myMin(int x, int y) {
		if (x < y) {
			return x;
		}
		return y;
	}
	
	public static int myMax(int x, int y) {
		if (x > y) {
			return x;
		}
		return y;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int x, y, min, max;
		
		System.out.println("Please enter two integers: ");
		x = input.nextInt();
		y = input.nextInt();
		
		min = myMin(x,y);
		max = myMax(x,y);
		
		System.out.println("Minimum value: " + min);
		System.out.println("Maximum value: " + max);
	}
}