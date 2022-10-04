package List;

import java.util.ArrayList;

public class ArrayListGen {

	public static void main(String[] args) {
		ArrayList<Integer> l1 = new ArrayList<Integer>();//-->generic
		l1.add(11);
		l1.add(12);
		l1.add(13);
		l1.add(14);
		l1.add(15);
		l1.add(16);
		System.out.println("List: " + l1);
		System.out.println("remove(Index): " + l1.remove(1));
		System.out.println("New List: " + l1);
		System.out.println("remove(Object): " + l1.remove((Integer) 11));
		System.out.println("New updated Listed: " + l1);
		System.out.println("*****************************************");
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(101);
		l2.add(102);
		l2.add(103);
		l2.add(104);
		System.out.println("list l2: " + l2);
		l1.addAll(l2);
		System.out.println("New updated Listed: " + l1);
		System.out.println("*****************************************");
		l1.removeAll(l2);
		System.out.println("New updated List after remove: " + l1);
		System.out.println("******************************************");
		if(l1.contains(14)) {
			l1.remove((Integer) 14);
		}
		
//		l1.removeIf(a2->a2.contain(14));
//		System.out.println(l1);
		System.out.println("******************************************");
		ArrayList<String> l3 = new ArrayList<String>();
		l3.add("Ram");
		l3.add("Sham");
		//lymda exp
		l3.removeIf(a1->a1.contains("Sham"));
		System.out.println("After invoking removeIf() method: " + l3);
		System.out.println("******************************************");
		l3.clear();
		System.out.println("Clear: "+ l3);
	}

}
