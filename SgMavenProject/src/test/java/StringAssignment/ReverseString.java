package StringAssignment;

import java.util.Collections;
import java.util.List;

public class ReverseString {

	/**
	 * Write a function/ method to reverse your own name. Input = "abhishek" Output
	 * = "kehsihba"
	 */

	public String revverseString(String name) {
		if (name.isEmpty() || name == null) {
			return "The string you have entered is valid";
		}
		if (name.length() == 1) {
			return "You have entered only one character which cannot be revered";
		}

		String revName = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			revName = revName + name.charAt(i);
		}
		return revName;

	}

	public static void main(String[] args) {
		ReverseString obj = new ReverseString();
		String reversedName = obj.revverseString("Shubham");
		System.out.println(reversedName);

	}

}
