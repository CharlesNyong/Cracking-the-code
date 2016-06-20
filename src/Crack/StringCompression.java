package Crack;

import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		String Input = "aabcccccaaa";
		HashMap map = new HashMap();
		int CharCount =0;
		
		for(int k =0; k<Input.length(); k++){
			if( (map.containsKey(Input.charAt(k)))){
				CharCount = (int)map.get(Input.charAt(k));
				CharCount++;
				map.put(Input.charAt(k), CharCount);
			}
			else{
				map.put(Input.charAt(k), 1);
			}
		}
		
		Set set = map.entrySet();
		Iterator i = set.iterator();
		String Output = "";
		while(i.hasNext()){
			 Map.Entry pair = (Map.Entry) i.next();
			 Output += (char)pair.getKey() + "" + (int)pair.getValue(); 
		}
		if(Output.length() < Input.length()){
			System.out.println(Output);
		}
		else{
			System.out.println(Input);
		}
	}
	

}
