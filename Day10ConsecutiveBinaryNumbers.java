import java.io.*;
import java.util.*;

/**
Given a base-10 integer, n, convert it to binary (base-2). 
Then find and print the base-10 integer denoting the maximum number of 
consecutive 1's in n's binary representation.
*/
public class Day10ConsecutiveBinaryNumbers {

	private final static int BINARY_BASE = 2;

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int number = sc.nextInt();
    	sc.close();

    	String binary = Integer.toString(number, BINARY_BASE);
    	System.out.println(binary);

    	int countMax = countMaximumNumberOfConsecutiveOnes(binary);
    	System.out.println(countMax);

    }

    private static int countMaximumNumberOfConsecutiveOnes(String binary){
    	int max = 0;
    	int count = 0;
    	for(char digit : binary.toCharArray()){
    		
    		if(digit == '1'){
    			count++;
    		}else{    			
    			count = 0;
    		}

			if(count>max){
				max = count;
			}

    	}
    	return max;
    }
}