package javaprogramspractise;

public class SwapString {

	/**
	 * we take two strings as input and swap them without using third variable.
	 */
	
	//how to handle this use case using methods where i need to return two strings.

	public void swapStrings(String input1, String input2) {
		if (input1 == null || input2 == null) {
			System.out.println("You have entered a null sting");
		} else if (input1.isBlank() || input2.isBlank()) {
			System.out.println("The string you have entered is blank");
		} else if (input1.isEmpty() || input1.isEmpty()) {
			System.out.println("You have entered a empty string");
		}
		
		input1 = input1+" "+input2; //abhi tyagi
		String ar[] = input1.split(" ");
		input1 = ar[1];
		input2 = ar[0];
		System.out.println(input1);
		System.out.println(input2);
		
		
		
		
	}

	public static void main(String[] args) {
		SwapString obj = new SwapString();
		obj.swapStrings("jaba", "aaba");

	}

}
