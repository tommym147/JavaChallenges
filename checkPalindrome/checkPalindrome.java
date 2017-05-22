// Thomas Mejia 5/18/17
// Challenge: Write a program that checks if a String is a palindrome.

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CheckPalindrome {
    public static boolean isPalindrome(String inputString) {
        char [] theString = inputString.toCharArray(); // converting String to char array

        int frontIndex = 0;
        int backIndex = theString.length - 1;

        // iterate from both sides of array to see if characters are equal
        while(backIndex > frontIndex) {
            if (theString[frontIndex] != theString[backIndex]) {
                return false; // if not equal, return false
            }
            frontIndex++;
            backIndex--;
        }
        return true; // return true if all characters were found equal
    }

    public static void main (String [] args) {
        // user input objects
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(reader);

        try {
            // asking and recording user input
            System.out.println("Enter String: ");
            String inputString = console.readLine();

            // printing boolean result
            System.out.println(isPalindrome(inputString));
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
