package StringAssignment;

import java.util.Optional;

public class FindHalfOfString {

	/**
	 * Write a program that gives you the last half of the string. Abhishek ==shek
	 */

	public String halfOfString(String inputString) {
		System.out.println(inputString.length());
		if (inputString == null || inputString.isBlank()) {

			// function return middle character.

			return "You have entered invalid(null,empty or only white spaces) String";
		} else if (inputString.length() == 1) {
			return "The string length is 1 hence last part of this string cannot be printed";

		}
		String halfString = "";
		int i = inputString.length();
		int j = i / 2;// 7/2 = 3.5 = 3

		for (int k = j - 1; k < inputString.length(); k++) {
			halfString = halfString + (inputString.charAt(k));
		}
		return halfString;
	}

	public static void main(String[] args) {

		FindHalfOfString str = new FindHalfOfString();
		String halfString = str.halfOfString("Shubham");
		System.out.println(halfString);

	}

}
