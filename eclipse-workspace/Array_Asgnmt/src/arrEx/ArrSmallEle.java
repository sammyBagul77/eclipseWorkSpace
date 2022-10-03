package arrEx;

class small{
	static void sml(int arr1[]) {
		int min= arr1[0];
		for(int i=0;i<arr1.length;i++) {
			if(min>arr1[i]) {
				min=arr1[i];
			}
					}
		System.out.println(min);
	}
}
public class ArrSmallEle {
public static void main(String[] args) {
	int arr[] = {4,5,10,3,5,12};
	small.sml(arr);
}
}
