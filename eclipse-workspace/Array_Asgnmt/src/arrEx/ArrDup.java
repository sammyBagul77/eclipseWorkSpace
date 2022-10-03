package arrEx;

public class ArrDup {
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7,8};
	int[] arr1=arr.clone() ;
	for(int i =0; i<arr.length;i++){
		System.out.print(arr1[i] +" ");
	}
}
}
