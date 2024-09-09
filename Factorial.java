import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
	Scanner mc = new Scanner(System.in);
	System.out.println("Enter any number");
	int num = mc.nextInt();	//Number input by the user to find factorial
	int i;			//Variable incremented in for loop  
	int fact = 1;		//Initial value of factorial
	//Loop to find factorial
		for(i=1;i<=num;i++){
		fact = fact*i;
		}
	System.out.println("Factorial of " + num + " = " + fact);
	}
}
