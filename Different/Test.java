import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class Test {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scan.nextLine();
        StringBuilder eninput = new StringBuilder();
        StringBuilder deinput = new StringBuilder();
        int len = input.length();
        char letter = 'a';

        /* ----- Encryption ----- */
        for(int i = 0; i < len; i++) {
            if(input.charAt(i) == 'Y') {
                eninput.append("A");
                // System.out.print("A");
            }
            else if(input.charAt(i) == 'Z') {
                eninput.append("B");
                // System.out.print("B");
            }
            else if(input.charAt(i) == 'z') {
                eninput.append("b");
                // System.out.print("b");
            }
            else if(input.charAt(i) == 'y') {
                eninput.append("a");
                // System.out.print("a");
            }
            else {
                letter = input.charAt(i);
                letter += 2;
                eninput.append(letter); 
            }
        }
        System.out.print("Encrypted input: " + eninput);
        System.out.println();
        
        try {
            File file = new File("G:/encryption.txt");
            file.createNewFile();
            System.out.println("\n*** File Created ***\n");

            FileWriter fin = new FileWriter("G:/encryption.txt");
            FileReader fout = new FileReader("G:/encryption.txt");
            BufferedReader bfr = new BufferedReader(fout);

            fin.write(eninput.toString());
            fin.close();

            String todecrypt = bfr.readLine();
            bfr.close();
            scan.close();

            System.out.println("Contents of file : " + todecrypt);
            
            /* ----- Decryption ----- */
            for(int i = 0; i < len; i++) {
                if(todecrypt.charAt(i) == 'A') {
                    deinput.append('Y');
                    // System.out.print("Y");
                }
                else if(todecrypt.charAt(i) == 'B') {
                    deinput.append('Z');
                    //System.out.print("Z");
                }
                else if(todecrypt.charAt(i) == 'b') {
                    deinput.append('z');
                    // System.out.print("z");
                }
                else if(todecrypt.charAt(i) == 'a') {
                    deinput.append('y');
                    //System.out.print("y");
                }
                else {
                    letter = todecrypt.charAt(i);
                    letter -= 2;
                    deinput.append(letter); 
                }
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.print("\nDecrypted contents of File : " + deinput);
    }
}
