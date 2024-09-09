//This program takes a string and a character from the user and counts the no of times the character is present in the string
import java.util.Scanner;
public class Lfrequency{
	public static void main(String[] args){
	Scanner Fre = new Scanner(System.in);
	int i;		//Variable used as increment in for loop 
	
	System.out.print("Enter a word -> ");
	String word = Fre.nextLine();		//Takes sting to be checked from the user
	
	System.out.print("Enter a character -> ");
	char letter = Fre.nextLine().charAt(0);	//Takes charachter 
	int strLen = word.length();	//Stores length of the string entered
	int count = 0;			//Stores the number of occurance of the letter
	String wordUpper = word.toUpperCase();
	char letterUpper = letter.toUpperCase();
	
	//for loop to count the frequncy of the character in the string
		for(i = 0; i < strLen; i++ ){
			if(wordUpper.charAt(i) == letterUpper){
				count++;
			}
		}
	System.out.print(letter + " repeats " + count + " times");
	}
}
