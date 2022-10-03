package arrEx;
import java.util.Arrays;
public class ArrLar3Num {
	public static void main(String[] args) {
		int val[]= {1,5,9,2,6,24,85,43,9,5,234,343,77,243,656};
Arrays.sort(val);
for(int i =0;i<val.length; i++){       
	System.out.print(val[i]+" ");
	}
System.out.println();
System.out.println("************************");
System.out.print("The 3rd largest Value : " + val[val.length-3]);
System.out.println();
System.out.print("The 2nd largest Value : " + val[val.length-2]);
	}
}
