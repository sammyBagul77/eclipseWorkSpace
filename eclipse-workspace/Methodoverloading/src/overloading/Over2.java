package overloading;

public class Over2 {
 public static void Square() {
	 System.out.println("No parameters are called");
 }
 public static void Square(int s) {
	 int sq = s * s;
	 System.out.println("parameter is int s " +sq);
 }
 public static void Square(double s) {
	 double sq = s * s;
	 System.out.println("parameter is double s " +sq);

 }
	public static void main(String[] args) {
	Square();
	Square(1.2);
	Square(12);

	}

}
