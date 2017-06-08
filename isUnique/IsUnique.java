// Thomas Mejia
// Implement an algorithm to determine if a string has all unique characters.

public class IsUnique {
	public static boolean uniqueString(String x) {
                char [] str = x.toCharArray(); // converts string to char array
                boolean [] ascii = new boolean[128]; // array representing ASCII table

                for (int i = 0; i < str.length; i++) {
                        int value = str[i];
                        if (ascii[value]) { // if boolean ASCII index was already set to true,
                                return false; // string has duplicate characters
                        }
                        ascii[value] = true; // sets each index to true
                }

                return true;
        }

	public static void main(String [] args) {
		// sample strings
		String a = "Tommy";
		String b = "TomMy";
		
		// print results
		System.out.print("Is " + a + " unique? ");
		System.out.println(uniqueString(a));
		System.out.print("Is " + b + " unique? ");
		System.out.println(uniqueString(b));
	}
}
