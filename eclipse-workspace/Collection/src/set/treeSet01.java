package set;
import java.util.TreeSet;
import java.util.Iterator;
public class treeSet01 {
public static void main(String[] args) {
	TreeSet<String> s1 = new TreeSet<String>();
	s1.add("Sam");
	s1.add("Dinkar");
	s1.add("Mahi");
	s1.add("Tina");
	System.out.println("******************************************");
	System.out.println("Elements of s1: "+ s1);
	Iterator<String> itr = s1.iterator();
	while(itr.hasNext()) {
		System.out.println("Using Iterator: "+itr.next());
	}
	System.out.println("******************************************");
	//descendig order
	Iterator<String> itr2 = s1.descendingIterator();
	while(itr2.hasNext()) {
		System.out.print(itr2.next()+" ");
	}
	System.out.println();
	System.out.println("******************************************");
	TreeSet<Integer> i = new TreeSet<Integer>();
	i.add(1111);
	i.add(222);
	i.add(33);
	i.add(4);
	System.out.println("Elements of i: "+ i);
	//poll last-> will remove last element
	System.out.println("Poll last: "+i.pollLast() );
	Iterator<Integer> itr3 = i.iterator();
	while(itr3.hasNext()) {
		System.out.print(itr3.next()+" ");
	}
	System.out.println();
	System.out.println("******************************************");

	//poll first-> will remove first element
		System.out.println("Poll first: "+i.pollFirst() );
		Iterator<Integer> itr4 = i.iterator();
		while(itr4.hasNext()) {
			System.out.print(itr4.next()+" ");
		}
		System.out.println();
		System.out.println("************************");
	TreeSet<String> s2 = new TreeSet<String>();
	s2.add("S");
	s2.add("D");
	s2.add("M");
	s2.add("G");
	s2.add("N");
	s2.add("T");
	s2.add("O");
	System.out.println("Elements of s2: "+ s2);
	System.out.println(s2.descendingSet());//--> used To print set in descOrd
	System.out.println("Headset: "+ s2.headSet("X"));//will print low to high element
	System.out.println("Headse: "+ s2.headSet("M", true));// It will take present alphabet also
	
	//subset
	System.out.println("subset: "+ s2.subSet("G", "S"));
	System.out.println("subset: "+ s2.subSet("G",false, "S",true));
	System.out.println("subset: "+ s2.subSet("G",false, "S",false));
	
	//tailset
	System.out.println("TaliSet: "+ s2.tailSet("N"));//will print high to low element
	System.out.println("Tailset: "+ s2.tailSet("O",true));
}
}
