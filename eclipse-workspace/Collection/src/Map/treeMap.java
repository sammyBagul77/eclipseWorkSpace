package Map;
//the main use of tree map to arrange the elements in sequential order on the basis of keys
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class treeMap {
public static void main(String[] args) {
	Map m1 = new TreeMap();
	m1.put(2, 'a');
	m1.put(5,'f');
	m1.put(1,'A');
	m1.put(3,'d');
	System.out.println("map elements: "+m1);
}
}
