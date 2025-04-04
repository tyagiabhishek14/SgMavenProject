package javassignments;

public class Second {

	public static void main(String[] args) {

		// What will be the output of following code:
		int i = 11;
		i = i++ + ++i;
		System.out.println(i);

		System.out.println("-----------------------------------");

		// What will be the output of following code:
		int a = 11, b = 22, c;
		c = a + b + a++ + b++ + ++a + ++b;
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);

		System.out.println("-----------------------------------");

		int e = 0;
		e = e++ - --e + ++e - e--;
		System.out.println(e);

		System.out.println("-----------------------------------");

		// What will be the output of following code:

		int q = 1, j = 2, k = 3;
		int m = q-- - j-- - k--;
		System.out.println("q=" + q);
		System.out.println("j=" + j);
		System.out.println("k=" + k);
		System.out.println("m=" + m);

		System.out.println("-----------------------------------");

		int w = 1, r = 2;
		System.out.println(--r - ++w + ++r - --w);

		
	}

}
