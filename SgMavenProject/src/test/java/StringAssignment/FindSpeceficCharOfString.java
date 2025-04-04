package StringAssignment;

public class FindSpeceficCharOfString {

	/**
	 * Write a program to get the 3rd  “ e “ of the string. Here we have to print
	 * the index where 3rd e is stored.
	 */

	public int findIndex(String inputString) {
		
		int index = 0;
		int count = 0;	
		for (int i = 0; i < inputString.length(); i++) {

			if (inputString.charAt(i) == 'e') {
				count++;
				if (count == 3) {
					index = i;
					return index;
				}
			}
		}
		return -1;

	}

	public static void main(String[] args) {

		FindSpeceficCharOfString obj = new FindSpeceficCharOfString();
		int index = obj.findIndex("sssessleneiuem");
		System.out.println(index);

	}

}
