package Program;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementInGivenArray {
	
    public static void main(String[] args) {
    	
        int[] myArray = {1, 2, 3, 3, 4, 4, 5};
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < myArray.length; i++) {
            set.add(myArray[i]);
        }
        System.out.println(set);
        Integer[] newArray = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(newArray)); // Output: [1, 2, 3, 4, 5]
         
    }
    
}
