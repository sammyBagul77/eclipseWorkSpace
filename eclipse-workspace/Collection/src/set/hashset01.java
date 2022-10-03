package set;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class hashset01 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		System.out.println("size:" + hs.size());
		hs.add("Raju");
		hs.add("Manish");
		hs.add("Vijay");
		hs.add("Manish");// Hashset will not store duplicate elements
		System.out.println("Hashset Elements:" + hs);
		System.out.println("Hashset size after update: " + hs.size());
		System.out.println("Hashset: " + hs.remove("Manish"));
		System.out.println("Hashset size after update: " + hs.size());

		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("Raj");
		hs1.add("Mahi");
		hs1.add("Vijay");
		hs1.add("Dinkar");

		// addAll
		hs.addAll(hs1);
		System.out.println("New elements using addAll" + hs);
		System.out.println("*************************************");
		Set<String> hs2 = new HashSet<String>();
		System.out.println(hs2.containsAll(hs1));
		System.out.println(hs2.containsAll(hs1));
		System.out.println(hs.containsAll(hs1));
		System.out.println("*************************************");

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
				};
				
				//removeAll
				System.out.println("removing elements of hs1 obj: "+ hs.removeAll(hs1));
				System.out.println(hs);
				hs1.removeIf(st -> st.contains("Mahi"));
				System.out.println(hs1);
				//clear
				hs.clear();
				System.out.println(hs);
	}
}
