package javassignments;

import java.math.BigInteger;

public class SixthMethods {

	/**
	 * WAP to print the circumference and area of a circle of radius entered by user
	 * by defining your own method. 
	 */

	public static double circumferenceOfCircle(double raduis) {
		double circumference = 2 * 3.14 * raduis;
		return circumference;
	}

	public static double area(double r) {
		double area = 3.14 * r * r;
		return area;

	}

	/**
	 * Define two methods to print the maximum and the minimum number respectively
	 * among three numbers entered by user.
	 */

	public static void greatest(int a, int b, int c) {
		int greatestNumber = 0;
		if (a > b && a > c) {
			greatestNumber = a;
		} else if (b > c) {
			greatestNumber = b;
		} else {
			greatestNumber = c;
		}
		System.out.println("First Number entered by user = " + a);
		System.out.println("Second Number entered by user = " + b);
		System.out.println("Third Number entered by user  = " + c);
		System.out.println("Greated number = " + greatestNumber);
	}

	public static void smallest(int a, int b, int c) {
		int smallestNumber = 0;
		if (a < b && a < c) { // a is not smaller than b but smaller than c
			smallestNumber = a;
		} else if (b < c) { //
			smallestNumber = b;
		} else {
			smallestNumber = c;
		}
		System.out.println("Smallest number = " + smallestNumber);
	}

	/**
	 * Def﻿ine a program to find out whether a given number is even or odd - return
	 * true/false.
	 */

	public static boolean evenOdd(int num) {
		if (num % 2 == 0)
			return true;
		else
			return false;
	}

	/**
	 * A person is eligible to vote if his/her age is greater than or equal to 18.
	 *  Define a method to find out if he/she is eligible to﻿ vote. - return
	 * true/false
	 */

	public static boolean vote(int age) {
		if (age < 18)
			return false;
		else
			return true;
	}

	/**
	 * Write a program which will ask the user to enter his/her marks (out of 100).
	 * Define a method that will display grades according to the marks entered as
	 * below: Marks        Grade 91-100         AA 81-90          AB 71-80         
	 * BB﻿ 61-70          BC 51-60          CD 41-50          DD <=40          Fail
	 */

	public static String grade(int marks) {
		String grade = null;
		if (marks >= 91 && marks <= 100) {
			grade = "AA";
		} else if (marks >= 81 && marks <= 90) {
			grade = "Ab";
		} else if (marks >= 71 && marks <= 80) {
			grade = "BB";
		} else if (marks >= 61 && marks <= 70) {
			grade = "BC";
		} else if (marks >= 51 && marks <= 60) {
			grade = "CD";
		} else if (marks >= 41 && marks <= 50) {
			grade = "DD";
		} else if (marks <= 40) {
			grade = "Fail";
		} else if (marks > 100) {
			System.out.println("Invalid Marks entered");
		}
		return grade;
	}

	/**
	 * Write a program to print the factorial of a number by defining a method named
	 * 'Factorial'. Factorial of any number n is represented by n!
	 */

	// We have to use BigInteger here as factor of even 50 will give 0 if use int or
	// double data type.
	public static BigInteger factorial(int num) {
		if (num < 0) {
			return BigInteger.valueOf(-1);
		}

		else if (num == 0) {
			return BigInteger.valueOf(1);
		} else {
			BigInteger result = BigInteger.valueOf(1);
			for (int i = 1; i <= num; i++) {
				result = result.multiply(BigInteger.valueOf(i));
			}

			return result;
		}
	}

	public static void main(String[] args) {

		double d = SixthMethods.circumferenceOfCircle(4);
		System.out.println("Circumference of circle is " + d);

		System.out.println("----------------------");

		double area = SixthMethods.area(3.5);
		System.out.println("Area of circle = " + area);

		System.out.println("----------------------");

		SixthMethods.greatest(10, 50, -34);

		System.out.println("---------------------");

		SixthMethods.smallest(2, 100, 10);

		System.out.println("---------------------");

		boolean b = SixthMethods.evenOdd(19);
		System.out.println(b);

		System.out.println("--------------------");

		boolean c = SixthMethods.vote(1);
		System.out.println(c);

		System.out.println("----------------------");

		String s = SixthMethods.grade(66);
		if (s == null) {
			System.out.println("No grade for these marks");
		} else {
			System.out.println(s);
		}
		System.out.println("-----------------------");

		BigInteger i = SixthMethods.factorial(-9);
		// int j = i.intValue();
		if (i.intValue() < 0) {
			System.out.println("Factorial for negative number is undefined");
		} else {
			System.out.println(i);
		}
	}

}
