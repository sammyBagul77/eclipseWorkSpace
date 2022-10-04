package inher;

class Aa {

	Aa() {
		System.out.println("A");
	}

	void aw() {
		System.out.println("i am small a");
	}
}

class Bb extends Aa {
	Bb() {

		System.out.println("B");
	}

	void aw() {
		System.out.println("i am small b");
	}
}

public class overriding {
	public static void main(String[] args) {
		Aa a1 = new Aa();
		a1.aw();
		Bb b1 = new Bb();
		b1.aw();
		Aa a2 = b1;
		// Method of Aa is override
		a2.aw();
	}

}
