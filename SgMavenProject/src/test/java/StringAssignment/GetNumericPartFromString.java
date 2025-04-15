package StringAssignment;

public class GetNumericPartFromString {

	/**
	 * get only numeric part from this String: String s = "your transaction id is:
	 * 12345 and reference id is 34567";
	 */

	public void getNumericValue(String inputString) {
		inputString = inputString.toLowerCase();
		// int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if ((int) c >= 97 && (int) c <= 122) { // c/y = 121

				System.out.print(c);
				// count++;

			} else if ((i > 0) && !((int) c >= 48 && (int) c <= 57) // i > 0 why ? control comes in this block

			// only when c is not an

			// integer in the first if condition

					&& ((int) inputString.charAt(i - 1) >= 48

							&& (int) inputString.charAt(i - 1) <= 57)) {

				System.out.print(" ");

			}
		}
	}

	public static void main(String[] args) {
		GetNumericPartFromString obj = new GetNumericPartFromString();
		obj.getNumericValue("your transaction id is: 12345 and reference id is 34567");

	}

}
