package Program;

public class PrintNoInAscendingOrder {

	public static void main(String[] args) {
		
		int [] arr= {3,8,7,10,12,14,1};
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				//arr[i]<arr[j]-----> descending
				
				if(arr[i]>arr[j]){
					
					int temp= arr[i];
					arr[i]= arr[j];
					arr[j]=temp;
				}			
			} 		
		}		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
}
