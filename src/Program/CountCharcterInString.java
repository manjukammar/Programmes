package Program;

public class CountCharcterInString {

	public static void main(String[] args) {

		String s = "JavaJava".toLowerCase();
		char[] S = s.toCharArray();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int countCharcter = 0;
			for (int i = 0; i < S.length; i++) {
				if (ch == S[i]) {
					countCharcter++;
				}
			}
			if (countCharcter > 0) {
				System.out.println(ch + "=" + countCharcter);
			}
		}
	}
}
