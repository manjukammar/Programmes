package Program;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args)
	{
	int n ;
	@SuppressWarnings("resource")
	Scanner sc = new Scanner ( System .in ) ;
	System.out.println("Enter the number : ");
	n = sc . nextInt ( ) ;
	int fact=1;
	for(int i=n; i >=1;i--)
	{
	fact=fact* i ;
	}
	System.out.println("Factorial of a number : " + fact);
	}

}
