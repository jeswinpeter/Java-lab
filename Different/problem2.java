/* 
 * Create 3 threads
 * 1st thread -> generates a random num greater than 1
 * 2nd thread -> if the generated num is odd prints the sum of odd numbers from 1 to that num
 * 3rd thread -> if the generated num is even prints the sum of even numbers from 1 to that num
 */

import java.util.Scanner;
import java.util.Random;

class IfEven extends Thread {
    int limit;
    int sum = 0;

    IfEven(int limit) {
        this.limit = limit;
    }

    public void run() {
        for(int i = 2; i < limit; i++) {
            if(i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of Even num b/n 1 and " + limit + " = " + sum);
    }
}

class IfOdd extends Thread {
    int limit;
    int sum = 0;

    IfOdd(int limit) {
        this.limit = limit;
    }
    
    public void run() {
        for(int i = 2; i < limit; i++) {
            if(i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Sum of Odd num b/n 1 and " + limit + " = " + sum);
    }
}

class Generator extends Thread {
    Random rand = new Random();
    int num;
    int times;

    Generator(int times) {
        this.times = times;
    }

    public void run() {
        for(int i = 0; i < times; i++) {
            try {
                num = rand.nextInt(2,25);
                System.out.println("Generated num = " + num);

                if (num % 2 == 0) {
                    IfEven even = new IfEven(num);
                    even.run();
                }
                else {
                    IfOdd odd = new IfOdd(num);
                    odd.run();
                }
                sleep(1000);
            }
            catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

public class problem2 {
    public static void main(String[] rgb) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many times do you want to generate random num: ");
        int times = scan.nextInt();

        Generator gen = new Generator(times);
        gen.run();
    }
}
