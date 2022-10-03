package arrEx;
class large{
	static void lar(int arr1[]) {
		int max = arr1[0];
		for(int i=0;i<arr1.length;i++) {
			if(max<arr1[i]) {
				max=arr1[i];
			}
					}
		System.out.println(max);
	}
}
public class ArrLarEle {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5,10,3,5,12,1};
	large.lar(arr);
}
}
