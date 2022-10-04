package Abs;
// 50% abs method
abstract class bike{
	abstract void run();
	void speed(int i) {
		System.out.println("the speed of this vehicle: " + i);
		}
	}

class shine extends bike{
	void run(){
		System.out.println("running saftly");
	}
	void speed(int spd) {
		System.out.println("Shine Avg speed: " + spd);
	}
	protected  void colour() {
		System.out.println(" colour : grey");
		}
}
public class ex2 {

	public static void main(String[] args) {
				shine s1 = new shine();
				s1.colour();
				s1.run();
				s1.speed(110);

	}

}
