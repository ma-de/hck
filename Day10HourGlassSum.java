import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
Test with = max sum is 19
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0


HourGlass example 
1 1 1
  1
1 1 1 
*/
public class Day10HourGlassSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int sumValuesArrray[] = new int[16]; //16 is maximum number of HourGlass in 6x6 array

        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        //calculate sum of all hour glass max 4 hour glass in each column and 4 row
        int k = 0;
        for(int i=0; i <= 3; i++){
            for(int j=0; j <= 3; j++){
                sumValuesArrray[k++] = sumHourGlass(arr, i, j);
            }
        }

        int maxSum = getMaxFromSumArray(sumValuesArrray);        
        System.out.println(maxSum);
    }

    /* Sorts the array of sums and returns last (greatest) element  */
    private static int getMaxFromSumArray(int sumValuesArrray[]){
    	Arrays.sort(sumValuesArrray);
        return sumValuesArrray[sumValuesArrray.length-1];
    }

	/* How to position hour glass stamp
	   a b c  0,0 0,1 0,2 
         d        1,1
       e f g  2,0 2,1 2,2 */
    private static int sumHourGlass(int arr[][], int i, int j){

	    int a = arr[i][j];
	    int b = arr[i][j+1];
	    int c = arr[i][j+2];
	    int d = arr[i+1][j+1];
	    int e = arr[i+2][j];
	    int f = arr[i+2][j+1];
	    int g = arr[i+2][j+2];
	    return a+b+c+d+e+f+g;
	}
}
