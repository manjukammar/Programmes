package Program;

public class Program100 {

	public static void main(String[] args) throws InterruptedException {
		String s = "manju nath is a good boy";
		String[] spl = s.split(" ");
		
		for (int i = 0; i < spl.length; i++) {
			System.out.println(spl[i].length());

		}
	}
}
