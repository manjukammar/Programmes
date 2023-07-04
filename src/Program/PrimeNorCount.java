package Program;

import java.util.Scanner;

public class PrimeNorCount {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number ");
		int num = sc.nextInt();
		boolean isPrime = true;

		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Given Number is prime number " + num);
		} else {
			System.out.println("Given Number is not a prime number " + num);
		}

	}

}
