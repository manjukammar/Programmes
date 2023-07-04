package Program;

public class CountVowles {

	public static void main(String[] args) {
		
		String  arr= "Shivanand sindagimath oxford university";
		String [] s = arr.split(" ");
		
		for (int i = 0; i < s.length; i++) {
			
			int count =0;
			String s1=s[i];
			
			for (int j = 0; j < s1.length(); j++) {
				
				char ch = s1.charAt(j);
				
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//					System.out.println(s[i]+ch);
					count++;
				}
				
			}
			System.out.println(s[i]+" = "+count);
			
		}
	}
}
