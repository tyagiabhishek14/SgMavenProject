package javaprogramspractise;

public class ReverseAString {

	public void reverseString(String str) {
		String strSplitArrray[] = str.split(" ");
		System.out.println("Original String = " +str);
		for(int i = (strSplitArrray.length-1) ; i >=0 ; i-- ) {
			System.out.print(strSplitArrray[i] + " ");
		}
	}

	public static void main(String[] args) {
		ReverseAString obj = new ReverseAString();
		obj.reverseString("My Name is ABhishek");
	}

}
