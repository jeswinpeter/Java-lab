package matrix;

import java.util.Random;
import java.util.Scanner;

class EvenNum extends Thread {
	public int a;
	
	public EvenNum(int a) {
		this.a = a;
	}
	
	public void run() {
		System.out.println(a + "is Even. Square of " + a + "= " + a * a);
	}
}	

class OddNum implements Runnable {
	public int a;
	
	public OddNum(int a){
		this.a = a;
	}
	
	public void run() {
		System.out.println(a + "is Odd. Cube of " + a + "= " + a * a * a);
	}
}

class RandomGen extends Thread {
	Random rand = new Random();
	
	int limit;
	int times;
	int random;
	
	RandomGen(int limit, int times){
		this.limit = limit;
		this.times = times;
	}
	
	public void run() {
		try {
			for (int i = 0; i < times; i++) {
				random = rand.nextInt(limit);
				System.out.println("Random -> " + random );
				
				if((random % 2) == 0) {
					EvenNum Even = new EvenNum(random); 
					Thread t1 = new Thread(Even);
					t1.start();
				}
				else {
					OddNum Odd = new OddNum(random); 
					Thread t2 = new Thread(Odd);
					t2.start();
				}
			}
		}
		catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
	}
}

public class Multi {
	public static void main(String[] zzz) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter limit for random num generation: ");
		int limit = scan.nextInt();
		
		System.out.println("How many times do want to generate: ");
		int times = scan.nextInt();
		
		RandomGen Rand_gen = new RandomGen(limit, times);
		Rand_gen.start();
	}
}


