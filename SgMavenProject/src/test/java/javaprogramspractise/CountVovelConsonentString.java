package javaprogramspractise;

public class CountVovelConsonentString {

	/**
	 * count the number of vowel and consonants in a string.
	 */

	public void checkCount(String str) {
		str = str.toLowerCase();
		
		int vowelCount = 0, consonantCount = 0;
		for (int i = 0; i < str.length(); i++) {
			int c = str.charAt(i);
			//System.out.println(c);
			if ((int)c == 97 || (int)c == 101 || (int)c == 105 || (int)c == 111 || (int)c ==117) {
				vowelCount++;
			} else {
				consonantCount++;
			}
		}
		System.out.println("Totel vowel present in String " + str + " are " + vowelCount);
		System.out.println("Totel consonant present in String " + str + " are " + consonantCount);
	}
	
	public static void main(String are[]) {
		CountVovelConsonentString obj = new CountVovelConsonentString();
		obj.checkCount("Abhishek tyagi");
		
	}

}
