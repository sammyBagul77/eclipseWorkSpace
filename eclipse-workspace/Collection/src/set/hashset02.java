package set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class hashset02 {

	public static void main(String[] args) {
		
		ArrayList<String> s1 =new ArrayList<String>();
		s1.add("aaa");
		s1.add("fff");
		s1.add("ccc");
		s1.add(null);
		System.out.println(s1);
		
		HashSet<String>s2 =new HashSet<String>(s1);
		s2.add(null);
		s2.add("ddd");
		System.out.println(s2);
		Iterator<String> itr =s2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		s2.forEach(str->{
			System.out.print(str+" ");
		});
		System.out.println("*************************************");
//		s1.removeIf(str1-> str1.contains("aaa"));
		System.out.println(s2);
		}

}
