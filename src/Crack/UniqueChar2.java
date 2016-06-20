package Crack;
import java.util.*;

/*
 * this program solves the unique character problem in cracking
 * code efficiently with a data structure
 * */
public class UniqueChar2 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		String input = "Casual";
		String output = "String contains unique Characters";
		
		for(int i =0; i<input.length(); i++){
			// means the was already an association for this key. This is a duplicate key
			if((map.put(input.charAt(i), 1)) != null ){
				output = "String doesn't contain unique Characters";
				break;
			}
		}
		System.out.println(output);
	}

}
