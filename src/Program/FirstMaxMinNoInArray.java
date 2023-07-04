package Program;

public class FirstMaxMinNoInArray {

	public static void main(String[] args) {

		int arr[] = { 10, 34, 50, 40, 5 };
		int max = arr[0];
		int min = arr[0];
		
		//First maximum value
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

		//FIrs minimum value
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
