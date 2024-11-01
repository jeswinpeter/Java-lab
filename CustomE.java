// package matrix;

import java.util.Scanner;

class AgeException extends Exception {
	public AgeException(String message) {
		super(message);
	}
}

public class CustomE {
	
	public static void validateAge(int age) throws AgeException{
		if(age < 18) {
			throw new AgeException("Age must be atleast 18");
		}
		System.out.println("Eligible to Vote.");
	}
	
	public static void main(String[] ex) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Eligibility test for Election Voting");
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		try {
			validateAge(age);
		}
		catch (AgeException e){
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			System.out.println("I am Finally block ... I am always Excecuted");
		}
		scan.close();
	}
}
