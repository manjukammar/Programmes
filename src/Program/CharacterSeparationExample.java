package Program;
import java.util.regex.Pattern;
import javax.swing.text.ChangedCharSetException;

	import java.util.regex.Matcher;
	import java.util.regex.Pattern;

	public class CharacterSeparationExample {
	    public static void main(String[] args) {
	        String input = "Manju@$_=%&_2223042";
	        for(int k=0;k<input.length();k++){
	        	 String ip = Character.toString(input.charAt(k));
	        	 if(Pattern.matches("[A-Za-z]", ip)){
	        		 System.out.println("Its a alphabet :"+ ip);
	        	 }else if(Pattern.matches("[0-9]", ip)){
	        		 System.out.println("Its a number :"+ ip);
	        	 }else{
	        		 System.out.println("its special charcter :"+ ip);
	        	 }
	        }
	        
	        String characters = "";
	        String numbers = "";
	        String specialCharacters = "";

	        // Regular expressions for character, number, and special character patterns
	        String characterPattern = "[a-zA-Z]";
	        String numberPattern = "\\d";
	        String specialCharacterPattern = "[^a-zA-Z0-9\\s]";
	        
	        Pattern pattern;
	        Matcher matcher;

	        // Separate characters, numbers, and special characters
	        for (int i = 0; i < input.length(); i++) {
	            String ch = String.valueOf(input.charAt(i));
	            pattern = Pattern.compile(characterPattern);
	            matcher = pattern.matcher(ch);
	            if (matcher.matches()) {
	                characters += ch;
	            }
	            
	            pattern = Pattern.compile(numberPattern);
	            matcher = pattern.matcher(ch);
	            if (matcher.matches()) {
	                numbers += ch;
	            }
	            
	            pattern = Pattern.compile(specialCharacterPattern);
	            matcher = pattern.matcher(ch);
	            if (matcher.matches()) {
	                specialCharacters += ch;
	            }
	        }

	        // Print the separated characters, numbers, and special characters
	        System.out.println("Characters: " + characters);
	        System.out.println("Numbers: " + numbers);
	        System.out.println("Special Characters: " + specialCharacters);
	    }
	    
	    public static void sepCharNumSpec(){
	    	 String input = "Manju@$_=%&_2223042";
	    	 String characters = " ";
		        String numbers = "";
		        String specialCharacters = "";
		        for (int i = 0; i < input.length(); i++) {
		        	char ch= input.charAt(i);
		        	if (ch>='a'&& ch<='z' || ch>='A' && ch<='Z') {
						characters = characters+ch;
					}else if (ch>='0' && ch<='9'){
						numbers = numbers + ch;
					}else{
						specialCharacters = specialCharacters + ch;
					}
										
				}
		        
		        System.out.println("Alphabets :"+characters);
		        System.out.println("Numbers :"+numbers );
		        System.out.println("Special Charcter :"+specialCharacters);
	    	 
	    }
	    
	 
	    
	}


