package wrapper_class;
//Unboxing
public class example3 {
	public static void main(String[] args) {
		
	
	Float f =new Float(12.3f);//explicit boxing
	System.out.println("value of f: "+ f);
	float f1 = f.floatValue();//unboxing f
	System.out.println("value of f1: "+ f1);
	Double doubleObj=25.2566;//
	System.out.println("doubleObj: "+doubleObj);

	double salary=doubleObj.doubleValue();// 
	System.out.println(salary);
	System.out.println(doubleObj==salary);//
	
	Boolean b=true;//
	boolean b1=b.booleanValue();//
	
	Character c1=new Character('a');//
	char c2=c1.charValue();//
	
	Integer i=25;
	double d=i.intValue();
	

}
}
