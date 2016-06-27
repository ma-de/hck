import java.io.*;
import java.util.*;


public class Day4Person {
    private int age;	
  
	public Day4Person(int initialAge) {
  		boolean valid = validateAge(initialAge);
  		age = valid ? initialAge : 0;
	}

	private boolean validateAge(int initialAge){
		boolean valid = true;
		if(initialAge < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			valid = false;
		}
		return valid;
	}


	/**
	If age<13, print You are young..
    If age>13 and age<18 , print You are a teenager..
    Otherwise, print You are old..
	*/
	public void amIOld() {
  		// Code determining if this person's age is old and print the correct statement:
  		if(age<13){
  			System.out.println("You are young.");
  		}else if(age>=13 && age <18){
			System.out.println("You are a teenager.");
  		}else{
  			System.out.println("You are old.");
  		}
        
	}

	public void yearPasses() {
  		age++;
	}


	public static void main(String[] args) {
		System.out.print("How many People: ");
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			System.out.print("age: ");
			int age = sc.nextInt();
			Day4Person p = new Day4Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {				
				p.yearPasses();
			}
			System.out.print("In three years: "); p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}