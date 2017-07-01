// Thomas Mejia
// Write a program that computes and displays the temperatures in
// Fahrenheit for Celsius values -5, 0, 12, 68, 22.7, 100, and 6.

public class FtoC {
    public static void main (String [] args) {
        double [] celsius = {-5, 0, 12, 68, 22.7, 100, 6}; // array holding celsius values

        // printing calculations
        for (int i = 0; i < celsius.length; i++) {
            System.out.println(celsius[i] + " degrees Celsius is " + (((9.0/5.0) * celsius[i]) + 32.0) + " degrees Fahrenheit");
        }
    }
}
