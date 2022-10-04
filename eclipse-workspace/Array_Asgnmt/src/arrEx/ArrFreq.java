package arrEx;

public class ArrFreq {
public static void main(String[] args) {
	int val[] = {10,20,10,30};
	int[] freq =new int[val.length];
	int visited =-1;
 	for(int i=0;i<val.length;i++) {
		int count =1;
		for(int j =i+1;j<val.length;j++) {
			if(val[i]==val[j]) {
			count++;
			freq[j]=visited;
			}
			if(freq[j]!=visited) {
				freq[i]=count;
			}
					}
		}
		System.out.println("****************************");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=visited) {
				System.out.println(val[i]+" : "+freq[i]);
			}
	}
			
		}
} 