package Exception;

public class exExcpt {
	public static void main(String args[]) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (Exception e) {// if we write exception catch block first other catch blocks will show error.
			System.out.println("common task completed");
	}// catch (Arithmetic Exception e) {
//			System.out.println("task1 is completed");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("task 2 completed");
//		}
//		System.out.println("rest of the code...");
//	}
}
/**
* unreachable code: a block of code which never executes by JVM
*
*/
}
