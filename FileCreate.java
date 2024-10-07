package matrix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FileCreate {
	public static void main(String[] ha) {
		try {
			File file = new File("/home/csea2/Documents/test2.txt");
			if(file.createNewFile()) {
				System.out.println("File created");
			}
			else {
				System.out.println("File Already exists!!");
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
		}
	}
}
