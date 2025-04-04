package encapsulationassignment;

public class TestEncapsulation {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.setAge(45);
		p.setGender("Male");
		p.setName("Abhishek Tyagi");
		
		p.printInfo();
		
		System.out.println("---------------------");
		
		BankAccount ba = new BankAccount();
		ba.setAccountNumber("212234583933300222");
		ba.setBalance(1000);
		ba.setOwner("Abhishek Tyagi");
		
		ba.printStatement();
		
		
		System.out.println("---------------------");
		ba.deposit(2000.98);
		ba.printStatement();
		
		System.out.println("---------------------");
		ba.widthdraw(99.99);
		ba.printStatement();

	}

}
