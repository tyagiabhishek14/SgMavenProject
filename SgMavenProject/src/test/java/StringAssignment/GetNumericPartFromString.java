package StringAssignment;

public class GetNumericPartFromString {

	/**
	 * get only numeric part from this String: String s = "your transaction id is:
	 * 12345 and reference id is 34567";
	 */

	public void getNumericValue(String inputString) {

		for (int i = 0; i < inputString.length(); i++) {
			char c = inputString.charAt(i);
			if ((int) c >= 48 && (int) c < 57) {
				System.out.println(c);
			}
		}

	}

	public static void main(String[] args) {
		GetNumericPartFromString obj = new GetNumericPartFromString();
		obj.getNumericValue("your transaction id is: 12345 and reference id is 34567");

	}

}
