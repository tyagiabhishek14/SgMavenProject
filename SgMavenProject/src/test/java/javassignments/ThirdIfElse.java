package javassignments;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ThirdIfElse {

	int t;

	/**
	 * Find out the greatest number out of four different given numbers: Input the
	 * 1st number: 25  Input the 2nd number: 78  Input the 3rd number: 87 Input the
	 * 4th number: 97
	 */

	public int highest() {
		int a = 100, b = 101, c = 0, d = 97;
		if (a > b && a > c && a > d) {
			return a;
		} else if (b > c && b > d) {
			return b;
		} else if (c > d) {
			return c;
		} else
			return d;
	}

	/**
	 * Write a Java program to test a number is positive or negative.
	 */
	public void negativePositive(int q) {
		if (q < 0) {
			System.out.println("Number is Negative : " + q);
		} else if (q == 0) {
			System.out.println("Number is zero");
		} else {
			System.out.println("Number is Positive " + q);
		}
	}

	/**
	 * WAP to check number is odd or even using If - Else
	 */
	public void evenOdd(int num) {
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("Given number is even: " + num);
			} else {
				System.out.println("Given number is odd: " + num);
			}
		} else {
			System.out.println("Please enter valid number : " + num);
		}
	}

	/**
	 * WAP to check given alphabet character is Vowel or Consonant using Switch -
	 * Case
	 */
	public void vovelCheck(char s) {
		switch (s) {
		case ' ':
			System.out.println("Space is not allowed");
			break;
		case 'a':
			System.out.println("A is vovel");
			break;
		case 'e':
			System.out.println("E is vovel");
		case 'i':
			System.out.println("I is vovel");
		case 'o':
			System.out.println("O is vovel");
		case 'u':
			System.out.println("U is vovel");
		default:
			System.out.println("Character is not a vovel");
		}

	}

	/**
	 * WAP to run your test cases in a specific environment like: QA, Stage, Dev,
	 * UAT, Prod using using Switch - Case
	 */
	public void environment(String s) {
		if (s.equals(null)) {
			System.out.println("Environment is null");
		} else {
			switch (s.toLowerCase()) {
			case "qa":
				System.out.println("Enviroment is QA");
				break;
			case "stage":
				System.out.println("Enviroment is Stage");
				break;
			case "dev":
				System.out.println("Enviroment is Dev");
				break;
			case "uat":
				System.out.println("Enviroment is UAT");
				break;
			case "prod":
				System.out.println("Enviroment is Prod");
				break;
			default:
				System.out.println("Not a correct envirenment");
			}

		}
	}

	/**
	 * WAP to book the specific type of car from the Uber app using Switch - Case.
	 * Car Type: Mini, Sedan, SUV, Premium
	 */

	public void carType(String car) {
		if (car.equals("")) {
			System.out.println("Car type passed in Blank");
		} else if (car.equals(" ")) {
			System.out.println("Car Type passed in space which is not a car type");
		} else if (car.equals("null")) {
			System.out.println("Car Type passed in null");
		} else {
			switch (car.toLowerCase()) {
			case "mini":
				System.out.println("Car booked in Mini");
				break;
			case "Sedan":
				System.out.println("Car booked in Sedan");
				break;
			case "SUV":
				System.out.println("Car booked in SUV");
				break;
			case "Premium":
				System.out.println("Car booked in Premium");
				break;
			default:
				System.out.println("No Car Booked");
			}
		}

	}

	/**
	 * WAP to define the interest rate on the basis of Loan type using Switch Case
	 * Loan Type: Car Loan, Housing Loan, Personal Loan, Education Loan For Housing
	 * Loan, if user’s salary is less than 35000 USD - print : NOT APPLICABLE FOR
	 * Housing Loan
	 */

	public void interestRate(String loan) {
		double interestRate;
		int salary = 44000;
		if (loan == null || loan == "" || loan == " ") {
			System.out.println("Null/empty/space is not allowed");
		} else {
			switch (loan.toLowerCase()) {
			case "car":
				interestRate = 6;
				System.out.println(interestRate);
				break;
			case "Housing":
				if (salary < 35000) {
					System.out.println("Not applicable for houseing loan");
				} else {
					interestRate = 7;
					System.out.println(interestRate);
				}
				break;
			case "Personal":
				interestRate = 8;
				System.out.println(interestRate);
				break;
			case "Education":
				interestRate = 9.7;
				System.out.println(interestRate);
				break;
			default:
				System.out.println("Loan type not submitted");
			}
		}

	}

	/**
	 * Main Method
	 */

	public static void main(String[] args) {
		ThirdIfElse obj = new ThirdIfElse();
		int f = obj.highest();
		System.out.println("greatest :﻿" + f);

		System.out.println("----------------------------------");

		obj.negativePositive(-2);

		System.out.println("----------------------------------");

		obj.evenOdd(33);

		System.out.println("----------------------------------");

		obj.vovelCheck(' ');

		System.out.println("----------------------------------");

		obj.environment("prod");

		System.out.println("----------------------------------");

		obj.carType("Mini");

		System.out.println("----------------------------------");

		obj.interestRate("Housing");
	}

}
