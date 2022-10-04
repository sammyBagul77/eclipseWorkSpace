package inher;
class Gfather{
	Gfather(){
		System.out.println("I am Gfather Const");
	}
	
	void Myhome() {
		System.out.println(" I am home of Grandfather");
	}
}
	class Father extends Gfather{
		Father(int i){
			System.out.println("I am father Const");
		}
		
		void Car() {
			System.out.println(" I am car of Father");
		}
	}	
		class Child extends Father{
			Child(double d){
				super(19);
		
				System.out.println("I am Child Const");
			}
			
			void bike() {
				System.out.println(" I am bike of child");
			}
	
}
public class ex4 {
	public static void main(String[] args) {
          Child c1 = new Child(21.9);
          	c1.Myhome();
          	c1.bike();
          	c1.Car();
          	System.out.println("******************************************");
         Father f1 =new Child(1.2) ;
         f1.Car();
         f1.Myhome();
         System.out.println("******************************************");
         Gfather g1 = c1;
         g1.Myhome();
         System.out.println("******************************************");
         Gfather g2 = new Child(12.9);
         g2.Myhome();
         
	}


}