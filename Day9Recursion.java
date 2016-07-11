import java.io.*;
import java.util.*;

public class Day9Recursion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextInt()));        
    }

    private static int factorial(int number){
    	return number<=1 ? 1 : number * factorial(number-1);
    }
}