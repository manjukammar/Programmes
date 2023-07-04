package Program;

import java.util.HashMap;

public class FinalCountWords {

	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Statement :");
//		String Sentence = sc.nextLine();
		String Sentence = "sanju Baba sanju baba";		
		String[] word = Sentence.toLowerCase().split(" ");		
		HashMap<String, Integer> map =  new HashMap<>();
		
//		for(String s : word)
//		{
//			if(map.containsKey(s)){
//				int countw = map.get(s);
//				map.put(s, countw+1);
//			}
//			else {
//				map.put(s, 1);
//			}
//		}
//		
//		System.out.println(map);
		
		
		for (int i = 0; i < word.length; i++) {
			if(map.containsKey(word[i])){				
				int count = map.get(word[i]);
				map.put(word[i], count+1);
			}
			else{
				map.put(word[i], 1);
			}
		}
		
         System.out.println(map);
                
 		char[] ch= Sentence.trim().toLowerCase().toCharArray();
         HashMap<Character,Integer> mapc =  new HashMap<Character,Integer>();
         for (char c:ch) {
			if(mapc.containsKey(c)){
				mapc.put(c,mapc.get(c)+1);
			}else if(mapc.containsKey(" ")){
				
				
			}else{
				mapc.put(c, 1);
			}
		}
         System.out.println(mapc);
	}
}
