import java.util.Scanner;

public class LabProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string :");
        String input = scan.nextLine();
        int len = input.length();
        int len2;
        int flag = 0;
        char check;
        int count;
        int present = 0;
        StringBuilder checked = new StringBuilder();

        for(int i = 0; i < len; i++ ) {
            if(input.charAt(i) != input.charAt(len-i -1)) {
                flag = 1;
                break;
            }
        }
        if(flag != 0) {
            System.out.println(input + " is not a palindrome");
        }
        else {
            System.out.println(input + " is a palindrome");
        }
        
        for(int i = 0; i < len; i++) {
            count = 0;
            present = 0;
            check = input.charAt(i);
            len2 = checked.length();
            for(int j = 0; j < len2; j++) {
                if(check == checked.charAt(j)) {
                    present = 1;
                    break;
                }
            }
            if (present == 0) {
                for(int j = 0; j < len; j++) {
                    if(check == input.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(check + " -> " + count);
            }
            checked.append(check);
        }
    }
}
