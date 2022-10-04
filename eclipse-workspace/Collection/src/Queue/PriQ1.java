package Queue;

import java.util.PriorityQueue;

//import java.util.Queue;
import java.util.Iterator;
public class PriQ1 {
	public static void main(String[] args) {
		PriorityQueue<Integer> p = new PriorityQueue<Integer>();
		System.out.println("elements preset int the queue: " + p);
		System.out.println("size: " + p.size());
//	System.out.println("Capacity: "+ p.capacity());--> will show the exception coz.. queue is not in the foe index
		p.add(123);
		p.add(12);
		p.add(0);
		p.add(11);
		p.add(43);
		p.add(75);
		System.out.println("The elements in the Queue: " + p);// will not print the elements in the sequence
		System.out.println("size: " + p.size());
		System.out.println("");
		System.out.println("***************************************************");
// element()
		System.out.println("Element method:" + p.element());// it will shows the head element of queue
		PriorityQueue<Integer> p1 = new PriorityQueue<Integer>();// empty queue
//	System.out.println("Element method:"+ p1.element());// If queue is empty dn element() will show NoSuchElementException

// peek()-->it will also shows the head element of queue
		System.out.println("peak method:" + p.peek());
		System.out.println("Element method:" + p1.peek());// If queue is empty dn peek() will show null
System.out.println("********************** ITERATOR**********************************");
		Iterator itr = p.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
		//for-each loop
		for(Integer i: p) {
			System.out.print(i+ " ");
			}
		System.out.println(" ");
		System.out.println("***************************************************");
		//remove()
		//p.remove(12);
		System.out.println("Removed element queue: " + p.remove());
		//System.out.println("no element:" + p1.remove());//--> will show NoSuchElementException
		System.out.println("The elements in the Queue: " + p);
		
		
		// poll()
		System.out.println("Removed element queue: " + p.poll());
		System.out.println("no element:" + p1.poll());//--> will show NoSuchElementException
		System.out.println("The elements in the Queue: " + p);
		Iterator itr2 = p.iterator();
		System.out.println("***************************************************");

		while(itr2.hasNext()) {
		System.out.println(itr2.next());
		}
		System.out.println("*************************Lymda Exp**************************");
          p.forEach(a-> {
        	  System.out.println(a);
          });
		
	}
}
