
import java.io.*;
import java.util.*;

public class StrToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int count = 0;

        s = s.trim();
        String[] tokens = s.split("[ !,?._'@]+");
        
        for(String token : tokens) {
            if(!token.isEmpty()) {
                count++;
            }
        }
        
        System.out.println(count);
        for(String token : tokens) {
            System.out.println(token);
        }
        
        scan.close();
    }
}