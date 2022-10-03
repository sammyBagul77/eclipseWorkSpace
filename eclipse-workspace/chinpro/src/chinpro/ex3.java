package chinpro;

class demo{  //we can write this demo as demo extends Object
    void display(){
        System.out.println("I am the display method of demo");
    }
}

public class ex3 extends demo {
    static int Last_roll =100;
    ex3(){
        int roll_no=Last_roll;
        Last_roll++;
    }

    public static void main(String[] args) {
        demo d1 = new demo();
        System.out.println(d1);//or d1.toString()//com.poly.ObjClass.demo@1b6d3586 -->it will shows the name of Object before @ sign i.e. demo
        System.out.println("HashCode: " + d1.hashCode());
        System.out.println("**************************************************");
        demo d2 =new demo();//if we are creating diff. odj for same class then it will show different hexadecimal address
        System.out.println(d2);
        System.out.println(d2.toString());//d2 OR d2.toString will show same hexadecimal address
        System.out.println("HashCode: " + d2.hashCode()) ;
        System.out.println("**************************************************");
        ex3 E =new ex3();//-->com.poly.ObjClass.ex1@74a14482--- it will shows the name of Object before @ sign i.e. ex1
        System.out.println(E);//or d1.tostring()
        System.out.println("**************************************************");
        d1 = new ex3();//--Upcasting
        ex3 e2 =(ex3)d1;//Downcasting
        System.out.println(d1);
        System.out.println(e2);
        System.out.println("HashCode: " + e2.hashCode());
        System.out.println("**************************************************");
    }
}
