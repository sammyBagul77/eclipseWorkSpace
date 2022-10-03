package Exception;

class NegativeValException extends Exception {

	@Override
	public String toString() {
		return "I am toString()";
	}

	public String getmessage() {
		return "I am get message";
	}

}

class cal {
	public static double area(int r) throws NegativeValException {

		if (r < 0) {

			throw new NegativeValException();
			
		}
		double areaOfCircle = Math.PI * r * r;
		return areaOfCircle;
	}
}

public class exThrows1 {
	public static void main(String[] args) {
		try {
			double d = cal.area(-2);
			System.out.println("The AreaOfCircle: " + d);
		} catch (NegativeValException n) {
			System.out.println("Exception!!!!!!!! "+ n.getmessage());
		}
	}

}
