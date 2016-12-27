
import java.util.Scanner;

public class ReverseIt{
	public static void main(String[] args){
		
		Scanner user_input = new Scanner(System.in);
		
		String output = "";
		
		String word;
		System.out.print("Enter a word to reverse: ");
		word = user_input.next();
		
		String wordArray[] = word.split("");
		
		for(int i=word.length(); i>0; i--){
			output += wordArray[i];
		}
		
		System.out.println("Your new word is: " + output);
	}
}