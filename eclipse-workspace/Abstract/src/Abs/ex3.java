package Abs;
abstract class value{
	public int meth(){
		return 13;
	}
	abstract void cal(int a , int b); 
}

class sum extends value{
	void cal(int a , int b) {
		System.out.println("the sum of two vars : " +(a+b));
	}
}

public class ex3 {

	public static void main(String[] args) {
	sum s1 =new sum();
    System.out.println(s1.meth());   
       s1.cal(12,13);

	}

}
