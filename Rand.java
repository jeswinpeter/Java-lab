package matrix;

import java.util.Random;
import java.util.Scanner;

public class Rand {
	public static void main(String[] yai) {
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter limit for random num generation: ");
		int limit = scan.nextInt();
		
		System.out.println("How many times do want to generate: ");
		int times = scan.nextInt();
		
		for (int i = 0; i < times; i++) {
			number = rand.nextInt(limit);
			System.out.println("Random -> " + number);
			
			if((number % 2) == 0) {
				System.out.println("Square of " + number + "= " + number * number);
			}
			else {
				System.out.println("Cube of " + number + "= " + number * number * number);
			}
		}
		
	}
}
