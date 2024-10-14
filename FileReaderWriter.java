package matrix;

import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException; 

public class FileReaderWriter {
	public static void main(String[] fin) {
		
		try {
			String content;
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your Keam rank: ");
			String rank = scan.nextLine();
			
			File file = new File("/home/csea2/Documents/Register1.txt");
			file.createNewFile();
			System.out.println("Register1 Created");
			
			FileWriter foutput = new FileWriter("/home/csea2/Documents/Register1.txt");
			foutput.write(rank);
			foutput.close();
			
			FileReader finput = new FileReader("/home/csea2/Documents/Register1.txt");
			BufferedReader br = new BufferedReader(finput);
			
			System.out.println("The contents in the file are:");
			while((content = br.readLine()) != null) {
				System.out.println(content);
			}
			
			br.close();
			scan.close();
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
		}
	}
}
