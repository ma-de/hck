    
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Job_MostPopularDestination {

private static Map<String,Integer> mapSearchCount;

public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int _count = Integer.parseInt(in.nextLine());
        
        OutputMostPopularDestination(_count, in);
}

        private static void OutputMostPopularDestination(int count, Scanner in) {
        	mapSearchCount = new HashMap<String, Integer>(count);

        	for (int i=0; i<count; i++) {        		
        		mapSearchCount(in.next());        		
        	}

        	System.out.println("My searchList values: " + mapSearchCount);
        	System.out.println("My searchList values: " + findMaxValue());

        }

        private static void mapSearchCount(String search){
        	int value = 1;
        	if(mapSearchCount.containsKey(search)){
        		value += mapSearchCount.get(search);        		
        	}
        	mapSearchCount.put(search, value);	        	
        }

        private static String findMaxValue(){
        	Map.Entry<String,Integer> maxEntry = null;
			for (Map.Entry<String,Integer> entry : mapSearchCount.entrySet()){
			    if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0){
			        maxEntry = entry;
			    }
			}
			return maxEntry.getKey();
        }



        
}