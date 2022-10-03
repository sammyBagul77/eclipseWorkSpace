package chinpro;

class demo1{  //we can write this demo as demo extends Object
    void display(){
        System.out.println("I am the display method of demo");
    }
    @Override
    public String toString() {
      return "Ruchi";
      }
   

}

public class ex4 extends demo1 {
    static int Last_roll = 100;

    ex4() {
        int roll_no = Last_roll;
        Last_roll++;
    }
    @Override
    public int hashCode(){
    	return 143;
    }
    public static void main(String[] args) {
        demo1 d =new demo1();
        System.out.println("To String: "+ d.toString());
        System.out.println("HashCode: "+ d.hashCode());
        System.out.println("********************************************");
        ex4 e4 =new ex4();
        System.out.println("To String: "+ e4.toString());
        System.out.println("HashCode: "+ e4.hashCode());
        System.out.println(d.equals(e4));
        demo1 d4 = d;
        System.out.println(d4.equals(d));
        System.out.println("********************************************");
    }
}
