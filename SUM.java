import java.lang.Math;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.lang.Math;
public class SUM{
	public static void main(String[] args){
		int n = 6;
		int i = 1;
        Biginteger fact = 1;
        while(i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println(fact); 
	}
}
