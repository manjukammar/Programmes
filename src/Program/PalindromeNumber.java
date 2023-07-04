package Program;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		int n ;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner ( System .in ) ;
		System.out.println("Enter the number : ");
		n = sc . nextInt ( ) ;
		int copy=n;
	    int num=0;
	    
//	    for (int i =0; i<n; i++){
//	    	int rem=n%10;
//	    	num=num*10+rem;
//			n=n/10;
//		}
//	    
//	    if(copy==num){
//			System.out.println("Number is palindrome "+ num);	
//		}
//		else {
//			System.out.println("Number is not palindrome "+ num);
//		}
//		System.out.println(num);
		
		
	    
		while(n!=0){
			int rem= n%10;
			num=num*10+rem;
			n=n/10;
		}
		if(copy==num){
			System.out.println("Number is palendrome "+ num);	
		}
		else {
			System.out.println("Number is not palendrome "+ num);
		}
		System.out.println(num);
	}
	
	}


