package StringAssignment;

public class WordPresetInString {

	/**
	 * Write a program to verify a word or a character contained in the sentence.
	 */

	public static boolean contains(String inputString, String containedElement) {
		if (inputString == null || containedElement == null) {
			return false;
		} else if (inputString.isEmpty() || inputString.isEmpty()) {
			return false;
		}
		if (inputString.toLowerCase().contains(containedElement.toLowerCase()))
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		boolean b = WordPresetInString.contains("This is Java", "Mava");
		System.out.println(b);
	}

}
