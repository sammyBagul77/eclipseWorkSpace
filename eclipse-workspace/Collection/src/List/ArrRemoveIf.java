package List;
import java.util.ArrayList;
import java.util.List;
public class ArrRemoveIf {
	public static void main(String[] args) {
		
	
	ArrayList <Integer> a1 =new ArrayList<Integer>();
	a1.add(1);
	a1.add(2);
	a1.add(3);
	a1.add(4);
	System.out.println("List elements: "+ a1);
	a1.removeIf(n-> n%2==0);
	System.out.println("List element:"+a1);
	}
}
