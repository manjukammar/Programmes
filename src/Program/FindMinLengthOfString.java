package Program;

public class FindMinLengthOfString {

	public static void main(String[] args) {
		String m [] = {"rocket","javaaaa","selenium","appium"};
		String minString = m[0];
		for (int i = 1; i < m.length; i++) {
			if(minString.length()>m[i].length()){
				minString=m[i];
			}
		}
        System.out.println(minString);
	}

}
