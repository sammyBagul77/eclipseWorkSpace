package keyword;

public class thisStat {
           
	thisStat(){
		this(12);
		System.out.println("I am non params const");
	
	}
	
	thisStat(int a){
		System.out.println("I am params cont ");
	}
	
	
	
	public static void main(String[] args) {
		thisStat t = new thisStat();
		thisStat t1 = new thisStat(10);

	}

}
