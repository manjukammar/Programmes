package Program;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String s= "mom";
		String m="";
		for (int i = s.length()-1; i >=0 ; i--) {
			
			m=m+s.charAt(i);
			
		}
		if(s.equals(m)){
			System.out.println("It is a plendrome " +m );
		}else {
			System.out.println("It is not a plendrome :" +m );
		}
	}

}
