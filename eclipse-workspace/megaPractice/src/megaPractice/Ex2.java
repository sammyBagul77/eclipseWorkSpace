package megaPractice;
class company{
	double salary =60000.0;
	void company1() {
		double salary =12344.0;
		System.out.println("This is company1 of class company");
		System.out.println("This is company 1 salary:" + salary);
		System.out.println("This is globle salary: "+this.salary );
	}
	void company1(double salary,int i) {
		System.out.println("This is company 1 salary for workers:" + salary);
		System.out.println("This is globle salary for workers: "+this.salary );
		this.salary =i;
		System.out.println("This is globle salary for workers: "+this.salary );
		this.company1();
	}
	company(){
		this(12);
		System.out.println("I am company const without params of class company");
		
	}
	company(int i){
		System.out.println("I am company const with params of class company");
	}
}
class Employee extends company {
	double salary = 1600.0;
	
	void company1() {
		super.company1();
		double salary =82345.0;
		
		System.out.println("This is company1 of class Employee");
		System.out.println("This is company 1 salary of class Employee:" + salary);
		System.out.println("This is globle salary of class Employee: "+this.salary );
		
	}
	void company1(double salary,int i ) {
	super.company1(13000.0, 19000);
	System.out.println("***********************S1********************************");
	System.out.println("This is company1 of class employee");
	System.out.println("*************************S2***********************************");
	this.company1();
	}
	Employee(){
		this(12);
		System.out.println("I am company const without params of class employee");
		
	}
	Employee(int i){
		super(12);
		System.out.println("I am company const with params of class employee");
	}
}
public class Ex2 {

	public static void main(String[] args) {
	company c1 = new company();
    c1.company1(10000.0, 12000);
    System.out.println("****************************************************************");
    Employee em1 = new Employee();
    System.out.println("****************************************************************");
    em1.company1(123.0, 12020);
    
	}

}
