
public class simint {

	public static float Interest(float p, float r,float t) {
	float Result = ((p*r*t)/100.0f);
	return Result;
	}
	
	public static void Interest1(float p, float r, float t) {
		float Result = (p*r*t)/100.0f;
	System.out.println("Your SI : " + Result);
	
	}
	
	public static void main(String[] args) {
	//float a = Interest(12000.0f, 2.5f, 1.0f);
	//System.out.println("Your SI : " + a);
   Interest1(12000.0f, 2.5f, 1.0f);

      	}

}
