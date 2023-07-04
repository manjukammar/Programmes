package Program;

import java.util.Scanner;

import org.testng.annotations.Test;

public class DimondShapePatern {

	@Test
//	public static void main(String args[]) {
	public static void demo(){
		int row, i, j, space = 1;
		System.out.print("Enter the number of rows you want to print: ");
		Scanner sc = new Scanner(System.in);
		row = sc.nextInt();
		sc.close();
		space = row - 1;
		//Iterating rows
		for (j = 1; j <= row; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space--;
			for (i = 1; i <= 2 * j - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		space = 1;
		for (j = 1; j <= row - 1; j++) {
			for (i = 1; i <= space; i++) {
				System.out.print(" ");
			}
			space++;
			for (i = 1; i <= 2 * (row - j) - 1; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
