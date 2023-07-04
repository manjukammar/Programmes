package Program;

public class SumOfFirst3MaxNumbers {
	
	public static void main(String[] args) {
		
		int arr[] = {1,3,4,2,5,6};
		int sum =0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]<arr[j]){
					
					int temp = arr[i];
					arr [i] = arr [j];
					arr [j] = temp;
				}
			}
			
		}
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			if(i==3){
				break;
			}
			sum=sum+arr[i];
			
		}
		System.out.println(sum);
	}

}
