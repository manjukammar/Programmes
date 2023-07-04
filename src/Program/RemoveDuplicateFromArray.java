package Program;

import java.util.HashSet;

public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		String arr[]= {"shivu", "Abhi", "Manu","Abhi","Manu"};
		HashSet< String> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
				}				
			}
		}
	}
	
}
