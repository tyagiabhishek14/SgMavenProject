package javassignments;

public class FourthLoops {

	/**
	 * WAP to print following output: I am Batman﻿ I am Batman﻿ I am Batman﻿ I am
	 * Batman I am Batman
	 */
	public void printBatman() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("I am Batman");

		}
	}

	/**
	 * WAP to print following output: I am Batman 1 I am Batman 2 I am Batman 3 I am
	 * Batman 4 I am Batman 5 I am Batman 6 I am Batman 7 I am Batman 8 I am Batman
	 * 9
	 */

	public void printBatmanNew() {
		for (int i = 1; i <= 9; i++) {
			System.out.println("I am Batman " + i);
		}
	}

	/**
	 * WAP to print 10 to 1 using for loop
	 */

	public void reverse() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}

	/**
	 * WAP to print 10 to 1 using while loop
	 */

	public void reverseWhile() {
		int count = 10;
		while (count >= 1) {
			System.out.println(count);
			count--;
		}
	}

	/**
	 * WAP to print 10 to 1 using do-while loop
	 */

	public void reverseDoWhile() {
		int count = 10;
		do {
			System.out.println(count);
			count--;
		} while (count >= 1);
	}

	/**
	 * Write a program in Java to print "Hello World" ten times using while loop
	 */

	public void printHello() {
		int count = 0;
		while (count <= 10) {
			System.out.println("Hello World");
			count++;
		}
	}

	/**
	 * Write a program in Java to print all the multiplication of 5 from 1 to 100
	 * using while /for/do-while loop
	 */

	public void multiplicationOfFive() {
		int num = 1;
		while (num <= 100) {
			if (num % 5 == 0) {
				System.out.println(num);
			}
			num++;

		}
	}

	/**
	 * 8. Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one
	 * using while and for loop.
	 */

	public void printAscioOfCapital() {
		for (int i = 65; i <= 90; i++) {
			char c = (char) i;
			System.out.println(c);
		}
	}

	/**
	 * Pint following series : 1.0 2.0 3.0  ...... 10.0 
	 */

	public void seriesOne() {
		for (double i = 1.0; i <= 10.0; i++) {
			System.out.println(i);
		}
	}

	/**
	 * Print following series : 0 9 18 27 36 …99
	 */

	public void seriesTwo() {
		for (int i = 0; i <= 99; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	/**
	 * Print only vowels (aeiou) using for. Start the loop from ‘a‘ to ‘z‘.
	 */

	public void vowelOnly() {
		int i, j;
		for (i = 'a', j = 'A'; i <= 'z' && j <= 'Z'; i++, j++) {
			// System.out.println(i);
			// System.out.println(j);

			if (i == 'a' || j == 'A') {
				System.out.println("A and a are vovel");
			} else if (i == 'e' || j == 'E') {
				System.out.println("E and e are voewel");
			} else if (i == 'i' || j == 'I') {
				System.out.println("I and i are vowel");
			} else if (i == 'o' || j == 'O') {
				System.out.println("O and o vowel");
			} else if (i == 'u' || j == 'U') {
				System.out.println("U and u vowel");
			}

		}

	}

	/**
	 * Print 1 to 10 and break the loop once you find the multiplication of 7 with a
	 * message "bye, see you tomorrow".
	 */

	public void multiplicationOfSever() {
		for (int i = 1; i <= 10; i++) {
			if (i % 7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;
			}

		}
	}

	public static void main(String[] args) {

		FourthLoops obj = new FourthLoops();
		obj.printBatman();

		System.out.println("------------------------------");

		obj.printBatmanNew();

		System.out.println("------------------------------");

		obj.reverse();

		System.out.println("------------------------------");

		obj.reverseWhile();

		System.out.println("------------------------------");

		obj.reverseDoWhile();

		System.out.println("------------------------------");

		obj.printHello();

		System.out.println("------------------------------");

		obj.multiplicationOfFive();

		System.out.println("------------------------------");

		obj.printAscioOfCapital();

		System.out.println("------------------------------");

		obj.seriesOne();

		System.out.println("------------------------------");

		obj.seriesTwo();

		System.out.println("------------------------------");

		obj.multiplicationOfSever();

		System.out.println("--------------11111111111----------------");

		obj.vowelOnly();

	}
}
