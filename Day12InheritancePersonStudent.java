import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;


	Student(String firstName, String lastName, int identification, int[] testScores){
		super(firstName,  lastName,  identification);
		this.testScores = testScores;
	}

	/**
	A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average
	*/
	protected String calculate(){
		int average = calculateAverageScore();
		String grade = "";
		if (90 <= average && average <= 100) 
			grade = "O";
		else if (80 <= average && average < 90) 
			grade = "E";
		else if (70 <= average && average < 80) 
			grade = "A";
		else if (55 <= average && average < 70) 
			grade = "P";
		else if (40 <= average && average < 50) 
			grade = "D";
		else if (average < 40) 
			grade = "T";
		return grade;
	}

	private int calculateAverageScore(){
		int sumOfScores = 0;
		int numberOfScores = testScores.length;
		for(int i=0;i<numberOfScores;i++){
			sumOfScores += testScores[i];
		}
		return Math.round(sumOfScores/numberOfScores);

	}
   
}

public class Day12InheritancePersonStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}