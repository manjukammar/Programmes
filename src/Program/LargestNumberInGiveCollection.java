package Program;

import java.util.ArrayList;
import java.util.Collections;

public class LargestNumberInGiveCollection {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(8);
		al.add(5);
		System.out.println(al);
        Integer max = Collections.max(al);
        Integer min = Collections.min(al);
        System.out.println(max);
        System.out.println(min);
        
		for (int i = 0; i < al.size(); i++) {
			int n = 0;
			if(n<=i){
				System.out.println(n);
			}
			n++;
//			Integer s = al.get(i);
//			System.out.print(s);
		}
		
	
	}

}
