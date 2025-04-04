package constructorassignments;

public class Car {

	/**
	 * Create a Java class named "Car" with the following instance variables: make
	 * (String) model (String) year (int) Create a constructor for the Car class
	 * that takes in the make, model, and year as parameters and initializes the
	 * instance variables. Create a default constructor for the Car class that sets
	 * the make, model, and year to "Unknown". Create a main method that creates
	 * three instances of the Car class using both constructors and prints out their
	 * information.
	 */

	String make;
	String model;
	int year;

	Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	Car() {
		//this.make = "";
		//this.model = "";
		//this.year = 0;
	}

}
