package constructorassignments;

public class Employee {

	/**
	 * Create a Java class named "Employee" with the following instance variables: id
	 * (int) name (String) salary (double) Create a constructor for the Employee
	 * class that takes in the id, name, and salary as parameters and initializes
	 * the instance variables. Create getter methods for each of the instance
	 * variables. Create a main method that creates an instance of the Employee
	 * class using the constructor, prints out the employee's information using the
	 * getter methods, and gives the employee a 10% raise using the setter method
	 * for the salary instance variable.
	 */

	//Created instance variables
	private int id;
	private String name;
	private double salary;

	//Created parameterized constructor which take id,name and salary as input
	 Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	//Created getter methods for all instance variables. 
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	//Created setter methods for all instance variables
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	//Setter method of salary designed to give hike to employee
	public void setSaalry(double salary, int percentHike) {
		this.salary = salary + (salary*percentHike)/100;
		
	}

}
