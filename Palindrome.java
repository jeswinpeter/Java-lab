import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args){
		Scanner pal = new Scanner(System.in);
		int flag = 0;	//Indicator that shows the entered string is a palindrome 
		int i;		//Variable used as increment for loop 
		System.out.println("Enter a word ");
		String str = pal.nextLine();	//String entered by the user
		int strLen = str.length();	//variabe that stores the length of the string entered
		pal.close();

		//For loop to check if the entered string is a palindrome
		for(i = 0; i < strLen/2; i++) {
			if(str.charAt(i) != str.charAt(strLen - i - 1)) {
				flag = 1;	
			}
		}

		if(flag == 0){
			System.out.println(str + " is a palindrome");	
		}			
		else{
			System.out.println(str + " is not a palindrome");
		}
	} 
}
