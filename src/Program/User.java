package Program;

public class User{

	public static void main(String[] args) throws Userdefined_exception {
		
		int age = 18;
		if(age<=20){
			throw new Userdefined_exception("Eligible to vote");		
		}else {
			System.out.println("Not eligible to vote");
		}
	}

}	
 	class Userdefined_exception extends Exception{
		public Userdefined_exception(String msg){
			System.out.println(msg);
		}
	
	}

