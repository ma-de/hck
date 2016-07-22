import java.util.*;
import java.io.*;

class Calculator{

	public int power(int n, int p){

		if(n < 0)
			throw new NumberFormatException("n and p should be non-negative");

		if(p < 0)
			throw new NumberFormatException("n and p should be non-negative");

		return (int)Math.pow(n, p);
	}

}

class Day17CalculatorExceptions{

    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int T=in.nextInt();
        while(T-->0)
        {
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try
            {
                int ans=myCalculator.power(n,p);
                System.out.println(ans);
                
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
            }
        }

    }
}