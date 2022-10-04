package List;

import java.util.ArrayList;
import java.util.Collections;

public class arrayList02 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add("Mango");// auto-upcasting from String to Object class object
		list.add(123);// first boxing for int to Integer class object---> upcasting to object class
		list.add(11.345f);
		list.add('G');
		list.add("Banana");// duplicate element
		list.add("Apple");
		// Cheking the size of list
		System.out.println("Size of list: " + list.size());
		System.out.println("Elements in List: " + list.toString());// toString overrided in Collection OR we can write
																	// 'list' also

		System.out.println("*****************************************************");
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

					}
		System.out.println("**************************************************");
		// Sorting the list
		try {
		Collections.sort(list);
		System.out.println(list);
		}catch(Throwable e){
			System.out.println("Arrange same type of elements");
		}
		
		System.out.println("************************************************");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a->{//here we r using lymda exp
			System.out.println(a);
		});
		
	}
}
