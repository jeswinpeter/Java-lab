/* 
 * This program promts the user to enter a string,
 * The string is then seperated into words using string tokenizer,
 * These words are written into a file,
 * Finally the contents of the file is printed using a fileReader */

import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.IOException;

public class StringToken {
    public static void main(String[] pqrs) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter words with a space between -> ");
        String words = scan.nextLine();
        String word;
        
        try {
            File file = new File("G:/string.txt");
            file.createNewFile();
            System.out.println("*** File created ***");

            FileWriter fin = new FileWriter("G:/string.txt");

            FileReader fout = new FileReader("G:/string.txt");
            BufferedReader bfr = new BufferedReader(fout);
            
            StringTokenizer tokns = new StringTokenizer(words);

            while (tokns.hasMoreTokens()) {
                word = tokns.nextToken();
                fin.append("\n" + word);
            }
            fin.close();

            while((word = bfr.readLine()) != null) {
                // word = bfr.readLine();
                System.out.println(word);
            }
            bfr.close();
            scan.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
