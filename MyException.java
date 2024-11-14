//This program implements Exception handling 

import java.util.Scanner;

public class MyException {
	public static void main(String[] exp) {
		Scanner scan = new Scanner(System.in);
		System.out.println("----- MENU -----");
		System.out.println("1 -> Arithmetic operation");
		System.out.println("2 -> Array access");
		
		int[] index = {1,2,5,7};	
		int pos;
		int a;
		int b;
		char confirm;		//Do while condition
		int choice;			//Switch condition
		
		do {
			System.out.println("Enter your choice");
			choice = scan.nextInt();
			switch(choice) {
				case 1: 
					System.out.println("Enter number to be devided : ");
					a = scan.nextInt();
					System.out.println("Enter divisor : ");
					b = scan.nextInt();
					
					try {
						System.out.println("a/b = " + (a/b));
					}
					catch (ArithmeticException e) {
						System.out.println("Error : " + e.getMessage());
					}
					
					break;
				
				case 2:
					System.out.println("Enter index you want to acces: ");
					pos = scan.nextInt();
					try {
						System.out.println("The element at position " + pos + "= " + index[pos]);
					}
					catch (ArrayIndexOutOfBoundsException e) {
						System.out.println("Error : " + e.getMessage());
					}
					break;
			
				default :
					System.out.println("Read menu and try again");
			}
			System.out.println("Type 'N' to exit and 'Y' to run again");
			confirm = scan.next().charAt(0);
				
		}while(confirm == 'y' || confirm == 'Y');
	}
}
