/* This code takes integers as a string and makes it tokens and converts them to int
  	and calculates the sum of the entered integers */

import java.util.StringTokenizer;
import java.util.Scanner;

public class Tokenizing {
	public static void main(String[] Ted) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int sum = 0;

		System.out.println("Enter the integers with one space gap: ");
		String value = scan.nextLine();
		
		StringTokenizer tkns = new StringTokenizer(value);

		// Tokenizing and iteger conversion
		while(tkns.hasMoreTokens()) {
			n = Integer.parseInt(tkns.nextToken());
			System.out.println("Num -> " + n);
			sum += n;
		}
		
		System.out.println("Sum of the integers = " + sum);
		scan.close();
	}
}
