package chinpro;

public class mockque {
	public static void main(String[] args) {
		
	
	String str ="Samarthssss";
	String str1=str.toLowerCase();
	char[] str2 =str1.toCharArray();
	int count =0;
	for(int i =0; i<str2.length;i++){
	      count =1;
	for(int j=i+1;j<str2.length;j++){
	if(str2[i]==str2[j]) {
		count++;
	str2[j]='0';
	
	}
	}
	if(count>1 && str2[i]!='0'){
		System.out.println("count 0f duplicate elements: "+ str2[i] +": "+count);
		}

	
	

}
}
}