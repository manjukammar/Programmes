package Program;

public class SwapTwoNumber {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a);
		System.out.println(b);

		int c = 123;
		int rev = 0;

		while (c != 0) {

			int rem = c % 10;
			c = c / 10;
			rev = rev*10+rem;

		}
           System.out.println(rev);
           
           for (int i = 0; i<c; i++) {
			
        	   int rem = c % 10;
   			c = c / 10;
   			rev = rev*10+rem; 
		}
           System.out.println(rev);
	}

}
