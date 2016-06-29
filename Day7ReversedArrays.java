import java.io.*;
import java.util.*;

/**
Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers. 
*/
public class Day7ReversedArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();            
        }

        StringBuilder sb = new StringBuilder();

        for(int i=n-1; i >= 0 ;i--){
        	sb.append(arr[i]);
        	sb.append(" ");        	
        }
        System.out.print(sb.toString());

        in.close();
    }
}
