package chinpro;

import java.util.ArrayList;
import java.util.*;
public class arrlstpr {
	public static void main(String[] args) {
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		i1.add(12);
		i1.add(13);
		i1.add(5);
		i1.add(20);
		ArrayList<Integer> i2 = new ArrayList<Integer>();
		i2.add(33);
		i2.add(3);
		i2.add(00);
		i2.add(null);
		System.out.println("size of arrayList: "+ i1.size());
		System.out.println(i1);
		System.out.println(i2);
		i1.addAll(i2);
		System.out.println("Updated List: "+ i1);

		if(i1.contains(12)) {
			i1.remove((Integer)12);
		}
		System.out.println(i1);
		System.out.println("********************************************");
		for(Integer i :i1) {
			System.out.println(i);
		} 
		System.out.println("********************************************");
		i1.forEach(a->{
			System.out.print(a + " ");
		});
		System.out.println();
		System.out.println("********************************************");
	
	}

}
