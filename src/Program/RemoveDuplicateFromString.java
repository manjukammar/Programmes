package Program;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {

		String s = "Manjappa";
		char c[] = s.toCharArray();
		String s1 = "";
       
		for (int i = 0; i < s.length(); i++) {
			if (s1.indexOf(c[i]) == -1) {
				s1 = s1 + c[i];
			}

		}
		System.out.println(s1);
		
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j]){
					System.out.print(c[j]);
					break;
				}
			}
			
		}
	}

}
