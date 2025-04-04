package javaprogramspractise;

public class SwapTwoNumbersUsingDivMul {

	/**
	 * Write a program to swap 2 numbers using multiplication and division //
	 * operators but without using a temp variable.
	 */
	
	public void swapTwoNumbers(int a, int b) {
		if(a<1 && b<1) {
			System.out.println("Both numbers should be 1 or greater than one");
		}
		a = a*b;
		b = a/b;
		a = a/b;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		SwapTwoNumbersUsingDivMul obj = new SwapTwoNumbersUsingDivMul();
		obj.swapTwoNumbers(-119,2);

	}

}
