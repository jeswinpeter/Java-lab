// package matrix;

import java.util.Scanner;

class Table extends Thread {
	void printTable(int n) {
		synchronized(this) {
			// Print Multiplication table
			for(int i = 1; i <= 10; i++) {
				System.out.println(n + " * " + i + " = " + n * i);
			}

			// To add a delay after each Thread
			try {
				Thread.sleep(3000);
			}
			catch (Exception e) {
				System.out.println("Error: " + e.getMessage()); 
			}
		}
	}
}

// --- First Thread --- //
class MyTable1 extends Thread {
	Table t;
	int num;
	
	MyTable1(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(num);
	}
}

// --- Second Thread --- //
class MyTable2 extends Thread {
	Table t;
	int num;
	
	MyTable2(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.printTable(num);
	}
}

public class TSynchronization {
	public static void main(String[] sos) {
		Scanner scan = new Scanner(System.in);
		Table t1 = new Table();
		MyTable1 tab1 = new MyTable1(t1);
		MyTable2 tab2 = new MyTable2(t1);

		System.out.println("Enter number for 1st table: ");
		tab1.num = scan.nextInt();
		System.out.println("Enter number for 2nd table: ");
		tab2.num = scan.nextInt();
		
		tab1.start();
		tab2.start();

		scan.close();
	}
}
