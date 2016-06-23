import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1DataTypes {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		
		/* Second integer, double, and String variables. */
        int secondInt = 0;
        double secondDouble = 0.0;
        String secondString = null;

        /* Read and save an integer, double, and String to your variables.*/

        secondInt = scan.nextInt();
        secondDouble = scan.nextDouble();
        
        /* Print the sum of both integer variables on a new line. */

        System.out.println(i+secondInt);

        /* Print the sum of the double variables on a new line. */
		
        System.out.println(d+secondDouble);

        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */

        StringBuffer b = new StringBuffer();
        while(scan.hasNext()){            
            b.append(scan.next());
            b.append(" ");
        }

        System.out.println(s+b.toString());

		scan.close();
    }
}