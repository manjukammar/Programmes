package Program;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		// 153, 370, 371
		n = sc.nextInt();
		int copy =n;
		int sum=0;
		while(n!=0){
			int rem=n%10;
			sum= sum+(rem*rem*rem);
			n=n/10;
		}
		
		if(sum==copy){
			System.out.println("It is Armstrong number "+ copy);
		}else {
			System.out.println("It is not a Armstrong number "+ copy);
		}
		
	}
}
