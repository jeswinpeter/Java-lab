package matrix;

import java.util.Scanner;

public class MatrixMultiple {
	public static void main(String[] args) {
		Scanner Fre = new Scanner(System.in);
		int i,j,k;
		int A[][] = new int[8][8];
		int B[][] = new int[8][8];
		int C[][] = new int[8][8];
		int permission;
		System.out.println("Disclaimer: Matrix multiplication is only possible if no.of columns of the 1st matrix is equal to the no.of rows of the 2nd matrix");
		
		int l = 1;
		
		while(l == 1) {
			System.out.println("Enter no.of rows of the 1st matrix -> ");
			int r1 = Fre.nextInt();
			System.out.println("Enter no.of columns of the 1st matrix -> ");
			int c1 = Fre.nextInt();
			System.out.println("Enter no.of rows of the 2nd matrix -> ");
			int r2 = Fre.nextInt();
			System.out.println("Enter no.of columns of the 2nd matrix -> ");
			int c2 = Fre.nextInt();
			
			//Checking condition for matrix multiplication 
			if(c1 != r2) {
				permission = 0;	//indicates condition for matrix multiplication is not met
			}
			else {
				permission = 1;
			}
			
			switch(permission) {
				case 1:	//if the condition for matrix multiplication is satisfied case 1 performs matrix multiplication
					System.out.println("Enter 1st Matrix ");
					//loop to get 1st matrix
					for(i = 0; i < r1; i++) {
						for(j = 0; j < c1; j++) {
							A[i][j] = Fre.nextInt();
						}
					}
					
					System.out.println("Enter 2nd Matrix ");
					//loop to get 2nd matrix()
					for(i = 0; i < r2; i++) {
						for(j = 0; j < c2; j++) {
							B[i][j] = Fre.nextInt();
						}
					}
					
					//loop to perform matrix multiplication
					for(i = 0; i < r1; i++) {
						for(j = 0; j < c2; j++) {
							C[i][j] = 0;
							for(k = 0; k < c1; k++) {
								C[i][j] += A[i][k] * B[k][j]; 
							}
						}
					}
					
					System.out.println("The resultant matrix is: ");
					//loop to print resultant matrix
					for(i = 0; i < r1; i++) {
						for(j = 0; j < c2; j++) {
							System.out.print(C[i][j]+"\t");
						}
						System.out.println();
					}
					l = 2;
					break;
					
				default:	//if the condition for matrix multiplication is not met default condition is executed again
					System.out.println("Read the disclaimer and try again");
			}
		}
	}
}
