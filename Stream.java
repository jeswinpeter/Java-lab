package matrix;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Stream {
	public static void main(String[] ha) {
		try {
			FileInputStream fin = new FileInputStream("/home/csea2/Documents/Firstfile");
			InputStreamReader input = new InputStreamReader(System.in);
			FileOutputStream fout = new FileOutputStream("/home/csea2/Documents/SecondFile");
			BufferedReader binput = new BufferedReader(input);
		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
			e.getStackTrace();
		}
	}
}
