package matrix;

import java.util.Scanner;

public class Matrix {
	public static void main(String[] args) {
		int A[][] = new int[6][6];
		Scanner Mat = new Scanner(System.in);
		System.out.println("Enter no.of rows of the matrix");
		int r1 = Mat.nextInt(); 
		System.out.println("Enter no.of columns of the matrix");
		int c1 = Mat.nextInt();
		
		System.out.println("Enter the Matrix ");
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				A[i][j] = Mat.nextInt();
			}
		}
		System.out.println("The matrix you have entered is:");
		for(int i = 0; i < r1; i++) {
			for(int j = 0; j < c1; j++) {
				System.out.print(A[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}
