package Program;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 1, 2, 3, 4 };
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] == a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					flag = true;
				}
			}
		}

		if (flag == true) {
			System.out.println("Duplicates are present ");

		} else {
			System.out.println("Duplicates are not present");
		}
	}

}
