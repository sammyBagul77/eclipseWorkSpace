package List;

import java.util.ArrayList;

public class arrayList01 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();

		list.add("Mango");// auto-upcasting from String to Object class object
		list.add(123);// first boxing for int to Integer class object---> upcasting to object class
		list.add("Banana");
		list.add(null);
		list.add(true);
		list.add(12.46);
		list.add(11.345f);
		list.add('G');
		list.add("Apple");// duplicate element
		//Cheking the size of list
		System.out.println("Size of list: "+ list.size());
		System.out.println("Elements in List: "+list.toString());//toString overrided in Collection OR we can write 'list' also
		
		System.out.println("*****************************************************");
		System.out.println("Traversing list through for loop:");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("*****************************************************");
		System.out.println("Traversing list through for each loop:");
		for(Object fruit: list) {
			System.out.println(fruit);
		}
		System.out.println("*****************************************************");
		// to get or access specific element
		System.out.println(list.get(2));
		
		// changing/update existing object
		list.set(1,"4211");
		System.out.println("Updated Size: "+ list.size());
		System.out.println("Updated list: "+ list);
		

	}
}
