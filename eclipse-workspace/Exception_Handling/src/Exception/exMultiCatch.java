package Exception;

public class exMultiCatch {
	public static void main(String[] args) {
		try {
			int[] arr = new int[5];
			arr[5] = 12 / 0;//first it will perform operation, if it is not valid thn it will show ArithmeticException
                            // otherwise it will show ArrayIndexOutOfBondException
		} catch (ArrayIndexOutOfBoundsException obj) {
			System.out.println("Array Index Out Of Bounds Exception occurs: " + obj);
		} catch (ArithmeticException obj) {
			System.out.println("Arithmetic Exception occurs" + obj);
		} catch (Exception obj) {
			System.out.println("Exception occurs: " + obj);
		}
//		try {
//
//			int[] arr = new int[5];
//			arr[5] = 12 / 2;
//
//		} catch (ArrayIndexOutOfBoundsException obj) {
//			System.out.println("Array Index Out Of Bounds Exception occurs: " + obj);
//		} catch (ArithmeticException obj) {
//			System.out.println("Arithmetic Exception occurs" + obj);
//		} catch (Exception obj) {
//			System.out.println("Exception occurs: " + obj);
//		}
	}
}
