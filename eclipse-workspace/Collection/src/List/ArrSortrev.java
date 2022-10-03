package List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrSortrev {

	public static void main(String[] args) {
ArrayList<Integer>al =new ArrayList<Integer>();
al.add(11);
al.add(2);
al.add(23);
al.add(14);

Collections.sort(al);
System.out.println("List in Asc Order:" + al);

Collections.reverse(al);
System.out.println("Reverse Order: "+al);

	}

}
