package StringAssignment;

public class StringEquality {

	public static boolean checkStringEquality(String firstString, String secondString) {
		if(firstString == null || secondString == null) {
			return false;
		}else if(firstString.isEmpty() || secondString.isEmpty()) {
			return false;
		}
		if (firstString.equals(secondString))
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		boolean b = StringEquality.checkStringEquality("Abhishek Tyagi", "I love India");
		System.out.println(b);
		boolean b1 = StringEquality.checkStringEquality("Java Selenium", "Java Selenium");
		System.out.println(b1);
		
		

	}

}
