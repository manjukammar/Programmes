package Program;

public class AlphabetPyramid {

	public static void main(String[] args) {
		char a = 'a';
		// for (int i = 3; i >=0; i--) {
		//
		// for (int j = i; j <4; j++) {
		//
		// System.out.print(a++);
		// }
		//
		// System.out.println();
		// }

		for (int i = 3; i >= 0; i--) {
			
			for (int j = i; j <= 3; j++) {
               System.out.print(" ");
			}

			for (int k = 3; k>=i ; k++) {

				System.out.print(a++);
			}

			System.out.println();
		}
	}

}
