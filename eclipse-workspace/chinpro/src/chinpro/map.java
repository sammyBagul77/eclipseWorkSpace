package chinpro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map {
public static void main(String[] args) {
	
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(1,"Ram");
	map.put(2,"Sham");
	map.put(3,"Ganesh");
	map.put(4,"Arjun");
	System.out.println(map.get(2));
	
	for(Map.Entry<Integer, String> s :map.entrySet()) {
		System.out.println(s.getKey()+": "+s.getValue());
	}
	
	System.out.println("******************************************");
	
	Iterator<Map.Entry<Integer,String>>itr = map.entrySet().iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
