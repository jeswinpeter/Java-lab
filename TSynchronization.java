package matrix;

import java.util.Scanner;

class Table extends Thread {
	void printTable(int n) {
		synchronized(this) {
			for(int i = 0; i < n; i++) {
				System.out.println(n + " * " + i + " = " + n * i);
				try {
					Thread.sleep(3000);
				}
				catch (Exception e) {
					System.out.println("Error: " + e.getMessage()); 
				}
			}
		}
	}
}

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
		
		System.out.println("Enter number for 1st table: ");
		int num = scan.nextInt();
		MyTable1 tab1 = new MyTable1(num);
		System.out.println("Enter number for 2nd table: ");
		scan.nextInt();
		
	}
}
