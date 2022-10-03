package Vector;
import java.util.Vector;
public class vect {
     public static void main(String[] args) {
		Vector v1 = new Vector();
		System.out.println("Actual size: "+v1.size());//->will shows the actual size of arr
		System.out.println("Default Capcity:"+v1.capacity());//->will shows actual capacity.
		v1.add("Ganesh");
		v1.add("Addy");
		v1.add(123);
		v1.add((12==13));
		System.out.println("Vector List: "+ v1);
		v1.add(2,343);
		System.out.println("Updated Vector List: "+ v1);
		v1.addElement(1211);
		System.out.println("Updated Vector List After addelement : "+ v1);
		System.out.println("*****************************************");
		Vector v2 =new Vector();
		v2.add(111);
		v2.add(144);
		v1.addAll(1, v2);
		System.out.println("v1 list after addAll:"+ v1);
		System.out.println("*****************************************");
		//getmethod
		System.out.println(	v1.get(4));
		//setmethod -is use to replace element
		v1.set(0, null);
		System.out.println("List After get Method: "+v1);
		System.out.println("********************Printing Elements using forEach loop**************************");
		for(Object e : v1) {
		System.out.print(e+ " ");
		}
	
		
	}
}