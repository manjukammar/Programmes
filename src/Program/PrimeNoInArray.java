package Program;

public class PrimeNoInArray {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		System.out.println(num);

		int a[] = { 4, 2, 7, 6, 11, 9, 8, 13 };
		int n = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			n = a[i];
			
			boolean flag=false;
			for (int j = 2; j < n; j++) {
				if (n % j == 0) {
					flag=true;
					break;
				}
			}
			if (flag==false) {
				count++;
				System.out.print(n+",");
			}		
		}
		System.out.println(" prime number count :"+count);
	}
}
