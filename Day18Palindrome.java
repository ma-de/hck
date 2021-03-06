import java.io.*;
import java.util.*;


public class Day18Palindrome {

		private Stack<Character> stack = new Stack<Character>();
    	private Queue<Character> queue = new LinkedList<Character>();

    	// stack kayak ---->
    	// queue <---- kayak

		public void pushCharacter(char c){
			stack.push(c);
		}
		public void enqueueCharacter(char c){
			queue.add(c);
		}
		public char dequeueCharacter(){
			return (char)queue.remove();
		}
		public char popCharacter(){
			return (char)stack.pop();
		}


        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Day18Palindrome object:
        Day18Palindrome p = new Day18Palindrome();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}