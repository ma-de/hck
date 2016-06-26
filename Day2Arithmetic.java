import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Day2Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        // Calculation

        double taxValue = calculateTax(mealCost, taxPercent);
        double tipValue = calculateTip(mealCost, tipPercent);
        double totalValue = calculateTotal(mealCost, taxValue, tipValue);
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalValue);
      
        System.out.format("The total meal cost is %d dollars.", totalCost);
    }

    private static double calculateTax(double mealCost, int taxPercent){
        return (double) mealCost * (taxPercent / 100f);
    }

    private static double calculateTip(double mealCost, int tipPercent){
        return (double) mealCost * (tipPercent / 100f);
    }

    private static double calculateTotal(double mealCost, double taxValue, double tipValue){
        return mealCost + taxValue + tipValue;
    }

}
