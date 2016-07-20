import java.util.*;
abstract class Book{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

class MyBook extends Book{
	int price;

	public MyBook(String title,String author, int price){
		super(title, author);
		this.price = price;
	}
	/**
	Title: $title
	Author: $author
	Price: $price
	*/
	void display(){
		System.out.printf("Title: %s %n", title);
		System.out.printf("Author: %s %n", author);		
		System.out.printf("Price: %d %n", price);
	}	
}

public class Day13SimpleInheritance
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}