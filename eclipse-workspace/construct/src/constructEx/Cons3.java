package constructEx;

public class Cons3 {
 int rollno =12;
 double salary =12345;
 // accsessing the non -static variable in constructor 
  Cons3(int r, double s){
	  rollno = r;
	  salary =s; 
  } 
  // accessing the const variables in non -static method directly
	  void display() {
		  System.out.println(rollno + " and " +salary);
	  }
  
	  public static void main(String[] args) {
		  Cons3 h = new Cons3(12,12.1);
		h.display();
		///Re-inatializing the non stat globle variable through const
		 Cons3 h1 = new Cons3(10,12.0);
		 h1.display(); 
	}
  
}
