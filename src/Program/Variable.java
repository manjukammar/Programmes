package Program;

public class Variable {
	private static int i;
	public static void main(String[] args) {
//		int i=1, b=10,c = 0,d;
//		int a = i+c;
		 System.out.println(i);
		 System.out.println(Variable.i);
		 vowels();
	}
	
	private static void vowels(){
		String s = "Manju";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(ch =='a' || ch=='e' || ch=='0' || ch=='i' ||ch=='u'){
				count++;
				System.out.print(ch+" ");
			}
		}
		
		System.out.println(count);
	}
}
