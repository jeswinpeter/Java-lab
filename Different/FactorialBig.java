import java.util.Scanner;
import java.math.BigInteger;

public class FactorialBig {

    public static BigInteger calculateFactorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number less than 100: ");
        int number = scan.nextInt();
        BigInteger factorial = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
        scan.close();
    }
}

