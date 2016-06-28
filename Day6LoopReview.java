import java.io.*;
import java.util.*;

public class Day6LoopReview {

	/**
	The first line contains an integer, T (the number of test cases).
	Each line i of the T subsequent lines contain a String, S. 
	*/
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for(int i=0;i<cases;i++){
        	String[] strArray = sc.next().split("");

        	String odd = "";
        	String even = "";
        	
        	for(int j=1;j<strArray.length;j++){
        		if(j%2==0){
					even += strArray[j];
        		}else{
        			odd += strArray[j];
        		}
        		
        	}
        	
        	System.out.println(odd + " " + even);
        }
    }
}