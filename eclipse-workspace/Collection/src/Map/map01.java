package Map;
import java.util.Map;
import java.util.HashMap;
public class map01 {

	public static void main(String[] args) {

		HashMap<Integer,String>im=new HashMap<Integer,String>();
		im.put(1,"Sam");
		im.put(2,"Dinkar");
		im.put(3,"Addy");
		im.put(4,"John");
		im.put(5,"Ganesh");
		
		System.out.println("Map:"+ im);
		System.out.println("Key:"+im.get(2));
		for(Map.Entry m : im.entrySet()) {
		System.out.println(m.getKey()+ " "+m.getValue());	
		}
		System.out.println("**************************************************");
		HashMap<Integer,String>im1=new HashMap<Integer,String>();
		im1.put(11,"Viabhav");
		im1.put(22,"Jayesh");
		im1.put(33,"Aditya");
		im1.put(44,"Rohan");
		System.out.println("Map1 : "+ im1);
		System.out.println("**************************************************");
      im.putAll(im1);
      System.out.println("Updated Old Map:" + im);
      //putifabsent
      
      im1.putIfAbsent(43,"Deepak");
      System.out.println("After pushIfAbsent() :" + im1);
      
      im1.putIfAbsent(56,"Deepak");
      System.out.println("After pushIfAbsent() :" + im1);
      System.out.println("**************************************************");
      
      HashMap<Integer,String> im2 = new HashMap<Integer,String>();
      im2.put(101, "Dann");
      im2.put(102,"Joy");
      im2.put(103,"Karl");
      
      for(Map.Entry m1: im2.entrySet()) {
    	  System.out.println(m1.getKey()+" "+m1.getValue());
      }
      // key -based removal
        im1.remove(11);
      System.out.println(im1);
      
      //key -value removal
      im.remove(4, "John");
      System.out.println(im);
      
      //replace
      im2.replace(103, "Deepak");
      System.out.println(im2);
      
      im2.replace(102, "Joy","Fredy");
      System.out.println(im2);

	}

}
