package Program;

public class PrimeNumInGivenArray {

	public static void main(String[] args) {

		int arr[] = { 10, 2, 7, 4, 9, 5 ,13,17,3,7,4,4,4};
		int primeno = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {

				if (arr[i] % j == 0) {
					count++;
				}

			}
			if (count == 2) {
				primeno++;
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println("Prime numbers " + primeno);
	}

}
