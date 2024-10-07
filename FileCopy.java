package matrix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] ha) {
		try {
			FileInputStream input = new FileInputStream("/home/csea2/Documents/test1.txt");
			FileOutputStream output = new FileOutputStream("/home/csea2/Documents/test2.txt"); 
			
			int i;
			while((i = input.read()) != -1) {
				output.write(i);
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
		}
	}
}