import java.io.*;
import java.util.*;

public class Day5Loops {

	/**
	Given an integer, N, print its first 10 multiples. 
	Each multiple N x i (where 1 < i < 10) should be printed on a new line in the form: N x i = result.
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i =1; i<=10 ;i++){
        	int result = i*n;
			System.out.format("%d x %d = %d%n", n, i, result);
        }
    }
}