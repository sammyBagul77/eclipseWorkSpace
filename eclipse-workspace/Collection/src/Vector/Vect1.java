package Vector;

import java.util.Vector;

public class Vect1 {
public static void main(String[] args) {
	Vector <Boolean> b = new Vector<Boolean>();
	System.out.println("Default size: "+ b.size());
	System.out.println("Default capcity: "+ b.capacity() );
	b.add(2/3==3/2);
	b.add(3>5);
	b.setSize(12);
	System.out.println("The capcity of vector after Update: "+ b.capacity());
	System.out.println("The elements present in the vector:" + b);
	System.out.println("Updated size:"+ b.size());
	
	
}
}
