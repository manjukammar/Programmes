package Program;

import java.util.Scanner;

public class Primenumber {
	public static void main(String[] args) {

		//int n;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		boolean flag = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				flag = false;
				break;
			}

		}
		if (flag == true) {
			System.out.println("It is a prime number" + n);

		} else {
			System.out.println("It is not a prime number" + n);

		}
	}

}

