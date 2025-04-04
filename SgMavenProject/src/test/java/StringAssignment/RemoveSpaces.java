package StringAssignment;

public class RemoveSpaces {

	/**
	 * Remove all  spaces in a String .    For example  : “         Hello     
	 * Everyone       “ .     Expected result: “HelloEveryone”.
	 */
	
	public static String removeSpaces(String enteredString) {
		if (enteredString == null || enteredString.isEmpty() || enteredString.equals(" ")) {
			return "You have entered invalid String";
		} else if (enteredString.length() == 1) {
			return "The string lenth is 1 hence last part of this string cannot be printed";

		}
		String updatedEnteredString = enteredString.replace("", " ");
		return updatedEnteredString;
	}

	public static void main(String[] args) {
		String modifiedString = RemoveSpaces.removeSpaces("         Hello      Everyone       ");
		System.out.println(modifiedString);

	}

}
