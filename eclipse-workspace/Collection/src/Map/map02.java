package Map;
import java.util.Map;
import java.util.HashMap;
public class map02 {
	/**
	 * to add any element in Map we need use put(key,value) 
	 * toString() is overrided here as well
	 * to get only keys from map use getKeys()
	 * to get only values from Map use values()
	 * if you want get a particular Key value dn use get(key)
	 */ 
	public static void main(String[] args) {

		Map<Integer,String>im=new HashMap<Integer,String>();
		im.put(1,"Sam");
		im.put(2,"Dinkar");
		im.put(3,"Addy");
		im.put(4,"John");
		im.put(null, "Joy");
		System.out.println(im);
		System.out.println("Get value: "+ im.get(3));
		System.out.println("all keys list: "+ im.keySet());
		System.out.println("map element count" + im.size());
		System.out.println("All values:"+im.values());
	}
	}