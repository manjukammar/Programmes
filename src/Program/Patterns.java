package Program;

import java.util.Scanner;

public class Patterns {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number :");
		int no = sc.nextInt();
       sc.close();
		// Right Triangle Star Pattern
		
		for (int i = 0; i < no; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	
	//Left Triangle Star Pattern
		
	for (int i = 0; i < no; i++) {

		for (int j = no-1; j >= i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	//top Triangle Star Pattern
	for (int i = no-1; i >= 0; i--) {

		for (int j = 0; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	for (int i = 0; i <no; i++) {

		for (int j = 0; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

}
