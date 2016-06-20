package Crack;
/*a program to check if a given string has all unique characters*/
public class UniqueChar {

	public static void main(String[] args) {
		
		int i, j;
		String input = "Answer";
		String output = "String contains unique Characters";
		
		for(i=0; i<input.length(); i++){
			  if(i == (input.length()-1)){
				 break; 
			  }
			for(j=i+1; j<input.length(); j++){
			 
				if(input.charAt(i) == input.charAt(j)){
				output = "String doesn't contain unique Characters";
				break;
				}
				
			}
		}
		
		System.out.println(" " + output);
	}
}
