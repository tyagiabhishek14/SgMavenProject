package javassignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FifthArray {
	/**
	 * WAP to delete a specific number from the given array. int p[] =
	 * {1,4,5,2,3,22,31,2}; Need to remove 22 from the p[] array. output should be:
	 * [1, 4, 5, 2, 3, 31, 2]
	 */

	public void deleteElement() {
		int[] a = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int b[] = new int[a.length - 1];
		int j = 0;
		for (int i = 0; i <= a.length - 1; i++) {
			if (a[i] != 22) {
				b[j] = a[i];
				j++;
			}

		}
		System.out.println(Arrays.toString(b));

	}

	/**
	 * Write a program to create a static Array, having following cricket data:
	 * name, age, team name, DOB, gender, Strike Rate Try to create multiple Object
	 * Arrays for different players  Try to print all the values of each player on
	 * the console
	 */

	public void cricketData() {
		Object obj[] = new Object[6];
		obj[0] = "Abhishek";
		obj[1] = 35;
		obj[2] = "India";
		obj[3] = "14-06-1991";
		obj[4] = 'M';
		obj[5] = 45.78;

		for (Object o : obj) {
			System.out.println(o);
		}
	}

	/**
	 * Write a Java program to create a new array list, which contains all color
	 * names.       add some colors (string)       and print out the colors list
	 * using loops. Then print element at particular index, then add an element at
	 * index. Remove element from a given index
	 */

	public void ArrayListMethodTest() {
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Green");
		ar.add("Blue");
		ar.add("Yellow");

		for (String e : ar) {
			System.out.println(e);
		}

		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		// Print entire array list
		// System.out.println(ar);

		// Print element at index = 2
		System.out.println(ar.get(2));

		// Add element at index = 0
		ar.add(0, "Red");
		System.out.println(ar);

		// Remove element from index = 2
		ar.remove(2);
		System.out.println(ar);
	}

	/**
	 * find a specific color in the array list and if it is found, break the loop;
	 */

	public void findColor() {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Red", "Blue", "Green", "Yellow"));
		boolean colorFound = false;
		String searchColor = "Black";
		for (String e : ar) {
			if (e.equals(searchColor)) {
				//System.out.println(searchColor + " Found, break the loop");
				colorFound = true;
				break;
			}
		}
		if (colorFound) {
			System.out.println("Color found " +searchColor);
		}else {
			System.out.println("Color not Found");
		}
	}

	/**
	 * 6. Reverse this array List:ArrayList<String> studentNames = new
	 * ArrayList<String>(); studentNames.add("Varun"); studentNames.add("Reena");
	 * studentNames.add("Naveen"); studentNames.add("Robin");
	 * studentNames.add("Peter");
	 */

	public void revrseAnArrayList() {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Varun", "Abhishek", "Jeet", "Tina"));
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
	}

	/**
	 * Write a Java program to extract a portion of an array list.
	 */

	public void extractPortion() {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Abhishek", "Tyagi", "Jeera"));
		ArrayList<String> portion = new ArrayList<String>(ar.subList(0, 1));
		System.out.println(portion);
	}

	/**
	 * Write a Java program to empty an array list.
	 */

	public void emptyList() {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Abhishek", "Tyagi", "Sita"));
		System.out.println(ar);
		ar.removeAll(ar);
		System.out.println(ar);
	}

	/**
	 * Write a Java program to trim the virtual capacity of an array list to the
	 * current list size.
	 */

	public void trimToSize() {
		ArrayList<Integer> ar = new ArrayList<Integer>(10); // vc=10
		ar.add(1);
		ar.add(2);
		ar.add(3);
		System.out.println(ar.size());
		ar.trimToSize();
		System.out.println(ar.size());
		System.out.println(ar);
	}

	/**
	 * Write a Java program to print all the elements of an ArrayList using the
	 * position of the elements.
	 */

	public void printListElements() {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Abhishek", "Tyagi", "Jeera"));
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(i + " " + ar.get(i));
		}
	}

	public static void main(String[] args) {
		FifthArray obj = new FifthArray();

		obj.deleteElement();

		System.out.println("------------------");

		obj.cricketData();

		System.out.println("------------------");

		obj.ArrayListMethodTest();

		System.out.println("------------------");

		obj.findColor();
//
//		System.out.println("------------------");
//
//		obj.revrseAnArrayList();
//
//		System.out.println("---------------------");
//
//		obj.extractPortion();
//
//		System.out.println("----------------------");
//
//		obj.emptyList();
//
//		System.out.println("-----------------------");
//
//		obj.trimToSize();
//
//		System.out.println("------------------------");
//
//		obj.printListElements();
//
	}

}
