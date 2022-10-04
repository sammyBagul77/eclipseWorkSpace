package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * List element: [Banana, Dates, Grapes, Mango] Iterator is a Interface in
 * collection, which is used to iterate collection elements Iterator interface
 * has following method to iterate collection elements 1. hasNext() ---> boolean
 * --> true next element is present, false no next element 2. next() ---> Object
 * --> it will return next element from collection 3. remove() --> void -->
 * element deletion Iterator object can be use to iterate a collection only
 * once, for 2nd iteration create new Iterator object
 */
public class ArrlistIter {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Banana");
		list.add("Dates");
		list.add("Mango");
		list.add("Grapes");

		// foreach new
		list.forEach(a -> {
			System.out.print(a + " ");
		});
		System.out.println(" ");

		System.out.println("******************************************");
		// printing all elements in asc ord
		Collections.sort(list);
		System.out.println("Asc Order: " + list);
		System.out.println();
		// iterater
		Iterator itr = list.iterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		// System.out.println(itr.next());--> will give NoSuchElementsException...coz no
		// extra element is present
		System.out.println("******************************************");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//
		System.out.println("*********with used Iterator Object**********");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*******with new Iterator Object************");
		Iterator itr2 = list.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}
}