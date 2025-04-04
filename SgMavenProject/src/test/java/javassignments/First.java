package javassignments;

import java.nio.file.spi.FileSystemProvider;

public class First {

	/*
	 * Write a Java program to add two strings: String a = “Hello“; String b =
	 * “Naveen K“ Expected Output : Hello Naveen K
	 */
	public String addString() {
		String a = "Abhishek", b = "Tyagi Ji";
		String c = a + b;
		return c;
	}

	/*
	 * Write a Java program to print the sum of two numbers. Test Data:?.  74 + 36
	 * Expected Output: 110
	 */
	public int add() {
		int a = 10, b = 20;
		int c = a + b;
		return c;
	}

	/*
	 * Write a Java program to print the division of two numbers. k = 50/3 Expected
	 * Output = 16
	 */
	public int div() {
		int a = 50, b = 3;
		int c = a / b;
		return c;
	}

	/*
	 * Write a Java program to compute the specified expressions and print the
	 * output Test Data: =((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))  Expected
	 * Output2.138888888888889
	 */
	public double expressions() {
		double d = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		return d;
	}

	/* Try to concat "Hello Selenium" with a character 't'. */
	public String concateStr() {
		String s = "Hello Selenium";
		char c = 't';
		String ft = s + c;
		return ft;
	}

	/*
	 * Create three int variables having values like : 100, 200, 3400. Add them and
	 * concatenate and generate this output String : "Your Total amount is. 3700".
	 */
	public int sumOfThreeNumber() {
		int a = 100, b = 200, c = 3400;
		int d = a + b + c;
		return d;
	}

	/* Print the ASCII value of the character 'h'. */
	public char printAsciiCode() {
		char f = 'h';
		return f;
	}

	/*
	 * WAP to add 3 to the ASCII value of the character 'd' and print the equivalent
	 * character.
	 */
	public char findCharFromAscii() {
		int f = 'd' + 3;
		return (char) f;
	}

	/* WAP to find the square of the number 3.9. */
	public double squareOfNum() {
		double d = 3.9 * 3.9;
		return d;

	}

	public static void main(String[] args) {
		First obj = new First();

		String h = obj.addString();
		System.out.println(h);

		int g = obj.add();
		System.out.println(g);

		int i = obj.div();
		System.out.println(i);

		double d = obj.expressions();
		System.out.println(d);

		String s = obj.concateStr();
		System.out.println(s);

		int j = obj.sumOfThreeNumber();
		System.out.println("Your Total amount is. " + j);

		char l = obj.printAsciiCode();
		System.out.println((int) l);

		System.out.println(obj.findCharFromAscii());

		double dw = obj.squareOfNum();
		System.out.println(dw);

	}

}
