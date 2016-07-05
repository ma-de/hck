//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;


/**
Given names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
You will then be given an unknown number of names to query your phone book for; 
for each name queried, print the associated entry from your phone book (in the form name=phoneNumber) or 'Not found' if there is no entry for name. 
*/
class Day8AddressBook{

    private static Map<String, Integer> dictionary = new HashMap<String, Integer>();
    private final static String notFound = "Not found";

    public static void main(String []argh){
        System.out.print("Number of entries: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Name & phone(separated with space): ");
            String name = in.next();
            int phone = in.nextInt();
            dictionary.put(name, phone);
        }
        
        System.out.print("Who are you looking for: ");
        while(in.hasNext()){
            
            String name = in.next();            
            if(dictionary.containsKey(name))
                System.out.println(name + "=" + dictionary.get(name));
            else
                System.out.println(notFound);

            System.out.print("Who are you looking for: ");
        }
        in.close();
    }
}
