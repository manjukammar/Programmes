package Program;

public class CountRepaetedWordInGivenString {
	
	public static void main(String[] args) {
		String s= "WE work to live and Live to be happy life".toLowerCase();
		String s1 []=s.split(" ");
		String word = "live";
		int count = 0;
		for (int i = 0; i < s1.length; i++) {
			if(word.equalsIgnoreCase(s1[i])){
				count++;
			}
		}
	System.out.println(count);
	}

}
