package Program;

public class StrongNumber {

	public static void main(String[] args) {

		// int n;
		// @SuppressWarnings("resource")
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter number : ");
		int n = 145;
		// n=sc.nextInt();
		int copy = n;

		int sum = 0;
		while (n != 0) {
			int fact = 1;
			int rem = n % 10;
			for (int i = rem; i >= 1; i--) {

				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;

		}
		if (copy == sum) {
			System.out.println("It is a strong number : " + copy);
		} else {
			System.out.println("It is not a strong number : " + copy);

		}
	}

}
