
import java.util.Scanner;

public class ReverseIt{
	public static void main(String[] args){
		//Creates a new scanner object?
		Scanner user_input = new Scanner(System.in);
		
		//Initialize output variable
		String output = "";
		
		//Initialize input string
		String word;
		System.out.print("Enter a word to reverse: ");
		word = user_input.next();
		
		//Makes an array from input string so I can use indexes in the for loop
		String wordArray[] = word.split("");
		
		//I messed something up at this point. No clue what. Throws an exception at runtime.
		for(int i=word.length(); i>0; i--){
			output += wordArray[i];
		}
		
		//Haven't gotten this far
		System.out.println("Your new word is: " + output);
	}
}