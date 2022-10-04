package keyword;

public class Ex1 {
static int age=111;
int  empid =101;
      void display(){
    	  int empid =12;
    	  System.out.println("Th value of non stat empid : " + empid);
    System.out.println("The glo non - stat var : " + this.empid);
      }
      
      public static void main(String[] args) {
    	  int age = 10;
    	  System.out.println("age: " + age);
    	  System.out.println("SGV age: " +Ex1.age );
      }
}
