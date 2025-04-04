package encapsulationassignment;

public class Person {

	/**
	 * Objective: The objective of this assignment is to create a class that uses
	 * encapsulation to protect its data and provide getter and setter methods for
	 * accessing the data. Instructions: Create a class called "Person" with the
	 * following private attributes: name (String), age (int), and gender (String).
	 * Create getter and setter methods for each attribute. Write a method called
	 * "printInfo" that prints out the name, age, and gender of the person. Create
	 * an instance of the "Person" class and set its attributes using the setter
	 * methods. Call the "printInfo" method to verify that the data was set
	 * correctly.
	 */

	private String name;
	private int age;
	private String gender;

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void printInfo() {
		String name = getName();
		System.out.println("The name of the person is " + name);

		int age = getAge();
		System.out.println("The age of " + name + " is " + age);

		String gender = getGender();
		System.out.println("The gender of " + name + " is " + gender);

	}

}
