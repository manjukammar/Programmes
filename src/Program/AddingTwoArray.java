package Program;

public class AddingTwoArray {
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4};
		int brr[]={3,4,5,6};
		int sum;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j <=i; j++) {
				 sum= arr[i]+brr[j];
				 System.out.print(sum+",");
			}
		}			
	}

}
