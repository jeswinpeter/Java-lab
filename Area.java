import java.util.Scanner;
public class Area{
	public static void main(String[] args){
	Scanner mv = new Scanner(System.in);
	System.out.println("Enter Lenth of the Rectangle");
		int l = mv.nextInt();		//Lenth of the rectangle
	System.out.println("Enter Breadth of the Rectangle");
		int b = mv.nextInt();	//breadth of the rectangle
	System.out.println("Area of the Rectangle = " + (l*b));
	}
}
