//This Program is to perform method overloading and Inheritance
package matrix;

import java.util.Scanner;

//--------- Superclass Employee1 --------
class Employee1 {
	
	double salary;
	double DA;
	double HRA;
	
	Employee1(double salary, double DA, double HRA){
		this.salary = salary;
		this.DA = DA;
		this.HRA = HRA;
	}
	
	void display() {
		System.out.println("====== EMPLOYEE ======");
	}
	
	void calcSalary() {
		System.out.println( "Gross Salary = " + (salary + salary * (DA/100) + salary * (HRA/100)) );
		System.out.println("");
	}
}


//--------- Subclass Engineer ---------
class Engineer extends Employee1 {
	
	Engineer(double salary, double DA, double HRA) {
		super(salary, DA, HRA);
	}
	
	void display() {
		//Calling methods from Superclass
		super.display();
		super.calcSalary();
	}
	
	void calcSalary() {
		System.out.println("====== ENGINEER ======");
		System.out.println( "Gross Salary of Engineer = " + (2*(salary + salary * (DA/100) + salary * (HRA/100))) );
	}
}


public class Overriding {
	public static void main(String[] Over) {
		Scanner scan = new Scanner(System.in);
		
		//Getting data from user
		System.out.println("Enter Basic Salary of the Employee : ");
		double sal = scan.nextDouble();
		System.out.println("Input DA% of the Employee : ");
		double dearness_allowance = scan.nextDouble();
		System.out.println("input HRA% of the Employee : ");
		double hra = scan.nextDouble();
		
		//Creating object for Engineer class
		Engineer obj = new Engineer(sal, dearness_allowance, hra);
		
		//Calling methods from Subclass
		obj.display();
		obj.calcSalary();
		
		scan.close();
	}
}
