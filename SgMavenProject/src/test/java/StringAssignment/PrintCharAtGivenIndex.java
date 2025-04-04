package StringAssignment;

public class PrintCharAtGivenIndex {

	/**
	 * Write a program that will  print out the last character and first character
	 * of a word.
	 */
	
	public static char firstCharacter(String word) {
		if (word == null || word.isEmpty() || word.equals(" ")) {
			return 'F';
		} else if (word.length() == 1) {
			return 'F';

		}
		char c = word.charAt(0);
		return c;
	}
	
	public static char lastCharacter(String word) {
		char c = word.charAt(word.length()-1);
		return c;
	}

	public static void main(String[] args) {
		char c = PrintCharAtGivenIndex.firstCharacter("Abhishek");
		System.out.println(c);
		
		char c1 = PrintCharAtGivenIndex.lastCharacter("Java Selenium");
		System.out.println(c1);
	}

}
