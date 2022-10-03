package arrEx;

public class ArrLeftRotate {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int n = 2;
		//printing all elements of array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// Actual logic
		for (int i = 0; i < n; i++) {
			int first = arr[0], j;
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
			System.out.println();
		}
		//printing all elements of array
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
	}
}