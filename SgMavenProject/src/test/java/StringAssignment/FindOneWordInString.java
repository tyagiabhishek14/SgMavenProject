package StringAssignment;

public class FindOneWordInString {

	/**
	 * Assume that a string consists of 3 words, print out the middle one. Abhishek
	 * tyagi boy
	 */
	
	// TBD - giving AIOFB with " "

	public String middleWord(String inputString) {
		int middleWord = 0;
		String words[] = inputString.split(" ");
		if (inputString == null || inputString.length() == 0 || inputString.isBlank() || inputString.isEmpty()) {
			System.out.println("You have entered a invalid String");
		} else {
			middleWord = words.length / 2;

		}
		return words[middleWord];
	}

	public static void main(String[] args) {
		FindOneWordInString obj = new FindOneWordInString();
		String middelWord = obj.middleWord("Abhishek Tyagi is a good Boy");
		System.out.println(middelWord);
		
	}

}
