package matrix;

import java.util.Scanner;

class Calculation {
	double area(double radius) {
		return (3.14*radius*radius);
	}
	
	int area(int leng, int width) {
		return (leng * width);
	}
	
	double area(double base, double height) {
		return (.5 * base * height);
	}
}

public class Overloading {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calculation calc = new Calculation();
		
		//Area of circle is calculated when 1 parameter of double type is given to area method 
		System.out.println("Enter radius of the Circle: ");
		double rad = scan.nextDouble();
		System.out.println("The area of the circle with radius " + rad + " = " + calc.area(rad));
		
		//Area of Rectangle is calculated when 2 parameters of int type is given to area method 
		System.out.println("Enter Length and Breadth of the Rectangle -> ");
		int len = scan.nextInt();
		int wid = scan.nextInt();
		System.out.println("The area of the Rectangle = " + calc.area(len,wid));
		
		//Area of Triangle is calculated when 2 parameters of Double type is given to area method 
		System.out.println("Enter Base and height of the Triangle -> ");
		double bas = scan.nextDouble();
		double height = scan.nextDouble();
		System.out.println("The area of the Triangle = " + calc.area(bas,height));		
		
	}

}
