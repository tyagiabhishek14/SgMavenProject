package javaprogramspractise;

public class FindFirstRepeatingCharacter {

	/**
	 * Find the first repeating character Input: "aabbcde" → Output: "c"
	 * 
	 * @param args
	 */

	public void repeatingCharacter(String sampleString) {
//		char c = 0;
//		for (int i = 1; i < inputString.toLowerCase().length() - 1; i++) {
//			
//			for(int j ; j.)
//			if (inputString.charAt(i) == inputString.charAt(i - 1)) {
//				c = inputString.charAt(i);
//				break;
//			}
//		}
//		System.out.println(c);

		for (int i = 0; i < (sampleString.length() - 1); i++) {//i=2

			char searchCharacter = sampleString.charAt(i);

			for (int j = i + 1; j <= sampleString.length() - 1; j++) {//Searchc =2    j=5

				if (sampleString.charAt(i) == sampleString.charAt(j)) {

					System.out.println(sampleString.charAt(i));
				}
			}
		}

	}

	public static void main(String[] args) {
		FindFirstRepeatingCharacter obj = new FindFirstRepeatingCharacter();
		obj.repeatingCharacter("acfdsfbbcfdef");
	}
	
	// couter logic need to be checed

}
