package Program;

public class CountVowelsInStr {
 
	public static void main(String[] args) {
		
		String str = "Abhishek guruji";		
		 str = str.toLowerCase();
		 int count =0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || ch=='u'){
				count++;
				System.out.print(str.charAt(i));
			}
		}
		System.out.println(count);
		
		
		String s="apple banana";
		String[] s1 = s.split(" ");
		
		for (int i = 0; i < s1.length; i++) {
			int count1=0;			
			String ss=s1[i];
			
			for (int j = 0; j < ss.length(); j++) {	
				
				char a=ss.charAt(j);
				
				if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u') {
					//System.out.println(s1[i].charAt(i));
					count1++;
				}
			}
			System.out.println(s1[i]+" = "+count1);
		}
	}

	
}
