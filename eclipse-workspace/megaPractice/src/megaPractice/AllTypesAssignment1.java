package megaPractice;
class Demo{
	static int num1;
	float num2;
	 static double result;
	//static block and initialization
	static{
		num1=45;
	}
	//Non static block and initialization
	{
		num2=72.5f;
	}
	
	 void calculate(int num1, float num2)
	{
		System.out.println("The Number1 is= " +num1);
	    System.out.println("This Number2 is= " +num2);
	    result=num1+num2;
	    //calculate(100,200,300f);
	    
	}
	 static void calculate(int num1,int  num2,float num3)
	{
		System.out.println("The Number1 is= " +num1);
	    System.out.println("This Number2 is= " +num2);
	    System.out.println("This Number3 is= " +num3);
	    double result2=num1+num2+num3;
	    System.out.println("The Result is for int,int and float type number=" +result2);
	 }
}
public class AllTypesAssignment1 {
	static int rollno;
	  char grade;
	{
		grade='A';
	}
	static {
		rollno=101;
	}
	 void display() {
		System.out.println("Student's Rollno =" +rollno);
		System.out.println("Student's grade =" +grade);
	
	}
	static void display(int m)
	{
		System.out.println(m);
	}
	public static void main(String[] args) {
		System.out.println("-----------Demo class data print with b object------------");
        Demo b=new Demo();
		System.out.println("-----------block value print------------");
        b.calculate(Demo.num1,b.num2);
		System.out.println("-----------parameter value print------------");
		b.calculate(80,40f);
        System.out.println("The Result is for int and float type number=" +b.result);
        Demo.calculate(89,90,100.5f);
        
        System.out.println("-----------AllTypeAssignment class data print with b object------------");
        AllTypesAssignment1 a=new AllTypesAssignment1();
        a.display();
        AllTypesAssignment1.display(1);
        }

}