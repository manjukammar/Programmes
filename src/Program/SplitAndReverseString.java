package Program;

public class SplitAndReverseString {

	public static void main(String[] args) {

		String s = "TestYantra";
		String s1 = s.substring(4);
		String s2 = s.substring(0, 4);
		System.out.println(s2);
		System.out.println(s1);
		String rev = "";

		for (int i = s1.length() - 1; i >= 0; i--) {
			rev = rev + s1.charAt(i);
		}

		System.out.println(s2 + rev);
	}

}
