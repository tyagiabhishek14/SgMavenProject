package constructorassignments;

public class Rectangle {

	/**
	 * Create a Java class named "Rectangle" with the following instance variables:
	 * length (double) width (double) Create a default constructor for the Rectangle
	 * class that sets both the length and width to 0.0. Create a constructor for
	 * the Rectangle class that takes in the length and width as parameters and
	 * initializes the instance variables. Create a method in the Rectangle class
	 * named "calculateArea" that returns the area of the rectangle (length *
	 * width). Create a main method that creates two instances of the Rectangle
	 * class using both constructors, calculates and prints out their respective
	 * areas.
	 */
	
	//Created instance variables.
	double length;
	double width;

	//Created default constructor and assigned 0.0 to instance variables.
	public Rectangle() {
		this.length = 0;
		this.width = 0;
	}
	
	//Created a parameterized constructor which take length and width as input
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {
		double area = length * width;
		return area;
	}

}
