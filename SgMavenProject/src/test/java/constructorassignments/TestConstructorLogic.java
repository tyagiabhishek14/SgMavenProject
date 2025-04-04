package constructorassignments;

public class TestConstructorLogic {
	/**
	 * Create a method in the Rectangle class named "calculateArea" that returns the
	 * area of the rectangle (length * width).
	 */

	public static void main(String[] args) {
		
		System.out.println("-------- Person Class Data---------------");
		Person p = new Person("Abhishek", 45, 'M', 45.56);
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.gender);
		System.out.println(p.height);

		System.out.println("---------Rectangle Class Data------------");

		Rectangle r = new Rectangle();
		System.out.println(r.length);
		System.out.println(r.width);

		Rectangle r1 = new Rectangle(3.87, 4.99);
		double d = r1.calculateArea();
		System.out.println(d);
		
		System.out.println("-------------Employee Class Data--------------");

		Employee e = new Employee(12, "Abhisek", 123.45);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		
		e.setSaalry(5000, 10);
		System.out.println(e.getSalary());
		
		System.out.println("-----------Car Class Data------------");
		Car c = new Car();
		System.out.println(c.make);
		System.out.println(c.model);
		System.out.println(c.year);
		
		Car c1 = new Car("Mahindra" , "Thar 4*4" , 2023);
		System.out.println(c1.make);
		System.out.println(c1.model);
		System.out.println(c.year);
		
		System.out.println("----------Bank Acccount Class Data--------------");
		BankAccount ba = new BankAccount("12345678", 1000.99);
		double latestBalance = ba.deposit(15);
		System.out.println("Current Balance of account is "+latestBalance);
		latestBalance = ba.withdwar(15);
		System.out.println("Latest Balnce of acount is "+latestBalance);
		

	}

}
