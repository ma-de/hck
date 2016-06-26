import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;
public class Day3EvenOdd {
   
	/**
	Given an integer, n , perform the following conditional actions:

    If n is odd, print Weird
    If n is even and in the inclusive range of 2 to 5, print Not Weird
    If n is even and in the inclusive range of 6 to 20, print Weird
    If n is even and greater than 20, print Not Weird

	*/


   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt(); 
      scan.close();
      String ans="";
          
      // if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
      if(n%2==1){
         ans = "Weird";
      }
      else{  	 

         if(checkInRange(n, 2, 5)){
         	ans = "Not Weird";
         }else if(checkInRange(n, 6, 20)){
         	ans = "Weird";
         }else if(n>20){
			ans = "Not Weird";
         }
      }
      System.out.println(ans);
   }

   /* Check range inclusive numbers*/
	private static boolean checkInRange(int value, int low, int high){
		OptionalLong containsValue = LongStream.rangeClosed(low, high).filter(p -> p == value).findAny();
		return containsValue.isPresent();
	}   
}
