package Program;

public class Fibonic {

	// public static void main(String[] args) {
	//
	// {
	// int a=0,b=1;
	// System.out.print(a+ " " +b+ " ");
	// for(int i=1;i<=10;i++)
	// {
	// int c=a + b;
	// System.out.print(c+ " ");
	// a=b;
	// b=c;
	// }
	// }
	// }
	//
	// }

	public static void main(String[] args) {
		{
			int a = 0, b = 1;
			System.out.print(a + " " + b + " ");
			int i = 1;
			while (i <= 10) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
				i++;
			}
		}
	}
}

// 0 1 2 3 5 8 13 21 34 55 89 144