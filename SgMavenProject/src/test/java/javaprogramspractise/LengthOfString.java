package javaprogramspractise;

import java.util.ArrayList;
import java.util.List;

public class LengthOfString {
	//// Write a program to find the length of a string without using length().

	public void getLength(String inputString) {

		char arr[] = inputString.toCharArray();
		List<Character> list1 = new ArrayList<Character>();
		for (char e : arr) {
			list1.add(e);
		}
		int length = list1.size();
		System.out.println(length);
	}

	public static void main(String[] args) {
		LengthOfString obj = new LengthOfString();
		obj.getLength("My name is java");

	}

}
