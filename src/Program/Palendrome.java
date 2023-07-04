package Program;

public class Palendrome {
	
	public static void main(String[] args) {
		
		String s= "Iam from gadag";
		String[] s1 = s.split(" ");
		
		for(int i=0; i<s1.length; i++){
			
			palendrome(s1[i]);
		}
		
	}
	
	public static void palendrome(String s1){
		
		String p= s1;
		String pal="";
		System.out.println(s1);
		for (int i = p.length()-1; i >= 0; i--) {
			
			pal =pal+ p.charAt(i);
			
		}
		System.out.println(pal);
		if(s1.equals(pal)){
			System.out.println("String is palendrome "+ pal);
		}else{
			
			System.out.println("String is not a palendrome "+ pal);
	}
	}
}
