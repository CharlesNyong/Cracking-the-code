package Crack;
import java.util.*;

public class RansomNote {
	
	
	public static void main(String[] args) {
		Scanner inputReader = new Scanner(System.in);
		int countFoundWordsInMagazine = 0;
		int lengthOfMagazine = inputReader.nextInt();
		int lengthOfNote = inputReader.nextInt();
		inputReader.nextLine(); // escape white space character 
		String Magazine = inputReader.nextLine();
		String RansomNote = inputReader.nextLine();
		StringTokenizer tokens = new StringTokenizer(RansomNote, " ");
		
		while(tokens.hasMoreTokens()){
			if(Magazine.indexOf(tokens.nextToken())!= -1){
				countFoundWordsInMagazine ++;
			}
		}
		
		if(countFoundWordsInMagazine != lengthOfNote){
			System.out.println("No");
		}
		else{
			System.out.println("Yes ");
		}
	}

}
