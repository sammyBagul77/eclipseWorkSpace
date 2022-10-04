package constructEx;

public class ConsOv {
	int a;
	double s;
	ConsOv(){
		System.out.println("I am cons without params");
	}
	ConsOv(int a){
		System.out.println("I am cons with single int :" + a);
	}
	ConsOv(int a, int b){
		System.out.println("I am cons with two int : " + a +" " + b);
	}
	ConsOv(double a, double b){
		System.out.println("I am cons with two Double : " + a +" " + b);
		}
	public static void main(String[] args) {
		 ConsOv c1 =new ConsOv();
		 ConsOv c2 =new ConsOv(12,13);
		 ConsOv c3 =new ConsOv(13);
		 ConsOv c4 =new ConsOv(4.5,1.2);
	// Accessing Non-Static Variable	 
		 System.out.println(c1.a);
		 System.out.println(c1.s);
		
 
 

}

}
