/*
	Given two strings, write a method to decide if one is a permutation of the other
*/
public class CheckPermutation {
	public static void main(String [] args) {
		// Permutations are the same characters in different orders
		CheckPermutation x = new CheckPermutation();
		String a = "cat";
		String b = "act";
		
		System.out.println("Strings '" + a + "' and '" + b + "' will be checked if they are permutations of each other.");
		System.out.print(x.permutation(a,b));
	}
	
	public String sort(String s) {
		// String.toCharArray() converts a String object into char array
		char [] content = s.toCharArray();
		
		// Arrays.sort sorts by ASCII value on char arrays
		java.util.Arrays.sort(content);
		
		// String constructor accepts char arrays and converts to String object
		return new String(content);
	}
	
	public boolean permutation (String s, String t) {
		// First check if the string lengths are the same
		if (s.length() != t.length()) {
			System.out.println("They are not the same length! No permutation!");
			return false;
		}
		// Then sort both to see if they have same letters and same outcome
		System.out.println("They are the same length. Will now sort to check if they have same characters.");
		return sort(s).equals(sort(t));
	}
}