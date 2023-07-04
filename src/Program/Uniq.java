package Program;

public class Uniq {
	public static void main(String[] args) {

		String s = "javajavajavadevdevdev";
		String s1 = "";
		s1=s.substring(0, 4);
		String s2 = s.substring(12, 15);
		System.out.println(s1);
		System.out.println(s2);
		System.out.print(s1+s2);
		
	/*	for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if(s1.indexOf(c)==-1){
				s1=s1+c;
			}

		}*/

	}

}
