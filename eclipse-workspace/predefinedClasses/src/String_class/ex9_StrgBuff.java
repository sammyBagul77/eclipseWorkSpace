package String_class;

import java.util.Scanner;

public class ex9_StrgBuff {
	public static void main(String[] args) {
//		String buffer is only possible only using new keyword. it is mutable.
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println(sb);
		System.out.println("********************************************************");
		// adding string
		sb.append("Jalgaon");// --> will add the string in above string
		System.out.println(sb);
		System.out.println("Capacity of Sb: " + sb.length());// --> count the elements
		System.out.println("********************************************************");
		// Insert
		sb.insert(1, "yyy");
		System.out.println("string after using insert statement:" + sb);
		System.out.println("********************************************************");
		// replace
		sb.replace(1, 4, "12");
		System.out.println("string after using replace statement:" + sb);
		System.out.println("********************************************************");
		// remove
		sb.delete(1, 3);
		System.out.println("string after using delete statement:" + sb);
		System.out.println("********************************************************");
		// replace
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name: ");
		String s2 = sc.nextLine();
		sb.replace(6, 13, s2);
		System.out.println("string after using replace statement:" + sb);
		System.out.println("********************************************************");
		
	}

}
