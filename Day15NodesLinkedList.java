import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}
/**
Linked list implementation
*/
public class Day15NodesLinkedList {

    public static Node insert(Node head,int data) {
    	Node node = new Node(data);
    	Node tail = head;        

		if(head != null){	        
	        while(tail.next != null) {
            	tail = tail.next;
	        }
	        tail.next = node;
    	}else{
    		head = node;	
    	}

    	return head;
    }

	public static void display(Node head) {
        Node start = head;        
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}