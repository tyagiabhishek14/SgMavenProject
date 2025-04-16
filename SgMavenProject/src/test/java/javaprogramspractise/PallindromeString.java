package javaprogramspractise;

public class PallindromeString {

	/**
	 * Check if a string is a palindrome Input: "madam" → Output: true
	 * 
	 * @param args
	 * @return
	 */

	public boolean pallindromeString(String inputString) {
		String reverseString = "";
		for (int i = inputString.toLowerCase().length() - 1; i >= 0; i--) {
			reverseString = reverseString + inputString.charAt(i);
		}
		if (inputString.equals(reverseString)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		PallindromeString obj = new PallindromeString();
		if (obj.pallindromeString("abba") == true) {
			System.out.println("The String is pallindrome");
		} else {
			System.out.println("The String is not pallindrome");
		}

	}

}
