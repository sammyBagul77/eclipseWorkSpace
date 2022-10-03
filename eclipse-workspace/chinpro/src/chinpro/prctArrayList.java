package chinpro;

import java.util.*;

public class prctArrayList {
	public static void main(String[] args) {
		
  ArrayList  arr = new ArrayList();
  arr.add(123);
  arr.add("Ruchika");
  arr.add("Stuti");
  arr.add("Virendra");
  arr.add(null);
  arr.add(12.34);
  arr.add(1.2f);
  System.out.println("The elements present in the array"+arr);
  arr.add(123);
  System.out.println("The elements present in the array"+arr);
  arr.add(1,null);
  System.out.println("The elements present in the array"+arr);
  arr.remove(0);
  System.out.println("Updated arrayList"+arr);
  arr.remove(null);
  System.out.println("Updated arrayList"+arr);
  arr.set(3, "Samarth");
  System.out.println("Updated arrayList"+arr);
  System.out.println(arr.indexOf("Samarth"));
  System.out.println(arr.get(5));
  System.out.println("Size of ArrayList: " +arr.size());
  System.out.println(arr.contains(null));
  System.out.println(arr.contains("Ruchika"));
  
  //ArrayList2
  
  ArrayList arr1= new ArrayList();
  arr1.add(13);
  arr1.add('D');
  arr1.add(0.34);
  arr1.add("java");
  
  arr.addAll(arr1);
  System.out.println(arr);
  arr.removeAll(arr1);
  System.out.println(arr);

}
}