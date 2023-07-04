package Program;

import java.util.Scanner;

public class LeafYearOrNot {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter yaer :");
		int n = sc.nextInt();
//		int num = 2011;
		
		if(n%400==0 && n%100!=0 || n%4==0 ){
			System.out.println("leap year");
		}else{
			System.out.println("not a leap year");
		}
	}

}
