package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ArrayGen1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Is ArrayList Empty: "+al.isEmpty());  
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		al.add("Hanumat");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		al2.add(new String("Pune"));
		System.out.println("al list elements: "+al);
		System.out.println("al2 list elements: "+al2);
		System.out.println("*******************************************");
		
		al.retainAll(al2);//it will give common elements from 2 arraylists
		System.out.println("Updated List: "+ al);
		System.out.println("*******************************************");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		List l1 = new ArrayList();
		l1.add("AAA");
		l1.add("BBB");
		System.out.println(l1);
		System.out.println(al);
	}

}
