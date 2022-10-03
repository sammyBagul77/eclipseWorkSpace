package inher;
class fruits{
	fruits(){
		System.out.println("Fruit class const");
	}
	void taste() {
		System.out.println("taste is non stat method of parent class");
	}
}
class apple extends fruits{
	apple(){

		System.out.println("apple class const");
	}
	void shape() {
		System.out.println("shape is non stat method of child class");
	}
}
public class Ex2 {

	public static void main(String[] args) {
	 apple fr = new apple();
	 fr.taste();
	 fr.shape();

	}

}
