package List;

import java.util.ArrayList;

public class ArrayList3 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		System.out.println("IsEmpty: " + a1.isEmpty());// it checks index is empty or not
		System.out.println("size: " + a1.size());
		System.out.println("*****************************************");
		a1.add("Ram");
		a1.add("Sham");
		a1.add("Vijay");
		a1.add("Manish");
		a1.add("Sonu");
		a1.add("Tushar");
		System.out.println("List: " + a1.toString());
		a1.add(1, "Mangesh");
		System.out.println();
		System.out.println("List: " + a1.toString());
//		for (Object arr : a1) {
//			System.out.println(arr);
//		}
		System.out.println("*****************************************");

		ArrayList a2 = new ArrayList();
		a2.add("Vijay");
		a2.add("Tushar");
		a2.add("Hitesh");
		a2.add("Vaibhav");
		System.out.println("List1: " + a2);
		a1.addAll(a2);
		System.out.println();
		System.out.println("Updated list afteradiing a2 into a1: " + a1);
		System.out.println("**************************************************");
		ArrayList a3 = new ArrayList();
		a3.add("Deepak");
		a3.add("Ganesh");

		a1.addAll(1, a3);
		System.out.println("List 4: " + a1);
		System.out.println(a1.size());
		a1.add(13, "aaa");
		System.out.println("List Semifinal: " + a1);
		a1.set(13, "Nilesh");
		System.out.println("List final: " + a1);

	}
}
