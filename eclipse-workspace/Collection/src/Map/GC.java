package Map;

public class GC {
public static void main(String[] args) {
	GC g1 = new GC();
	System.out.println("Object representation of GC: "+g1);
	System.out.println("Address of GC:"+ g1.hashCode());
	g1 =null;
	System.gc();
	//g1.hashCode();
	System.out.println("Main method ends here");
}
@Override
protected void finalize() {
	System.out.println("I am finalize Method");
}
}
