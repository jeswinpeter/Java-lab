//This Program implements the concept of interface 

import java.util.Scanner;

interface Human {
	final int b = 10;
	void learn(String expertise, int score);
	void work(int score);
}

interface Recruitment {
	void screening(int score);
}

//Implementing interfaces Human and Recruitment 
class Programmer implements Human,Recruitment {
	public void learn(String expertise, int score) {
		System.out.println("----- Placement Details -----");
		System.out.println("Your Trained area : " + expertise);
		System.out.println("Test Score : " + score);
	}
	
	public void work(int score) {
		if(score > 45) {
			System.out.println("Your Job id : 1050");
		}
	}
	
	public void screening(int score) {
		if(score > 45) {
			System.out.println("You are Selected to the role Employee");
		}
	}
}

public class Interface {
	public static void main(String[] abs) {
		Scanner scan = new Scanner(System.in);
		Programmer program = new Programmer();
		
		System.out.println("Enter your trained area -> ");
		String trained = scan.next();
		System.out.println("Enter test Score -> ");
		int testScore = scan.nextInt();
		scan.close();
		
		//Calling Implemented methods  
		program.learn(trained,testScore);
		program.screening(testScore);
		program.work(testScore);
	}
}
