package Program;

public class FindLengthOfMaxString {

	public static void main(String[] args) {

		String[] s = { "Shivya", "Manju", "Abhi", "Shivanand" };
		String maxength = s[0];

		for (int i = 1; i < s.length; i++) {
			if (maxength.length() < s[i].length()) {
				maxength = s[i];
			}
		}
		System.out.println(maxength);
		// for (int i = 0; i < s.length; i++) {
		// if (maxength.length() == s[i].length()) {
		// System.out.println(s[i]);
		// }
		// }
	}

}
