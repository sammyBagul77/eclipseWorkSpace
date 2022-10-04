package List;
import java.util.ArrayList;
import java.util.List;

class Book {
	int id;
	String name, author, publisher;
	int quantity;
	public Book(int i,String s,String a,String p,int q) {
		id =i;
		name= s;
		author= a;
		publisher=p;
		quantity =q;
		
	}
}
public class ArrUserObj {
	
	public static void main(String[] args) {
  List<Book>l1 =new ArrayList<Book>();		
 Book b1 = new Book(1,"AAA","AaAa","aaa",12);
 Book b2 = new Book(2,"BBB","BbBb","bbb",11);
 Book b3 = new Book(3,"CCC","CcCc","ccc",10);
 
 l1.add(b1);
 l1.add(b2);
 l1.add(b3); 
 
 System.out.println("List of Book class elements: "+l1.toString());//when we create object then it will give fully classified name@hex decmal add
	System.out.println(l1.get(0).name);
	
	for(Book b:l1) 
	{
		System.out.println(b.id + " "+ b.name + " "+b.author+ " "+b.publisher+ " "+b.quantity);
	}
	}

}
