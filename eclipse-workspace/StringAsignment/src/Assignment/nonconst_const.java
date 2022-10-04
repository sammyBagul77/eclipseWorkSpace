package Assignment;

import java.util.*;

public class nonconst_const {
	public static void main(String[] args) {

		String n1 = new String("Javaa");
	String n2 = n1.intern();
		String s3 ="Javaa";
		
		System.out.println(s3==n2);
		

	}
}
