package arrEx;

public class arr2d {
	static int[][] arr = {{1,2,3,4},{5,6,7,8},{1,2,3,4}};
    static int[][] arr1= {{2,3,4,5},{3,5,2,5},{5,6,2,6}};


public static void main(String[] args) {
	int temp =0;
    
     //single array sum
     for(int i=0;i<arr.length;i++) {
    	 for(int j=0;j<arr[i].length;j++) {
    		 int n =arr[i][j];
    		temp = temp+n;
    	 }
    	     }
     System.out.println("Total some of single array:"+ temp);
     System.out.println("*********************************************************");

     // double array addition
     int[][] arr2=new int[4][4];
     for(int i=0;i<arr.length;i++) {
    	 for(int j=0;j<arr[i].length;j++) {
    	
    		arr2[i][j] = arr[i][j]+arr1[i][j];
    		System.out.print(arr2[i][j]+ " ");
    	 }
    	 System.out.println();
    	     }
     System.out.println("*********************************************************");
     // double array addition of any row column
//     int[][] ar = {{1,2,3,4},{5,6,7,8},{1,2,3,4}};
//      int[][] ar1= {{2,4,5},{3,5},{5,6,6}};
//     int[][] ar2=new int[4][4];
//     for(int i=0;i<ar.length;i++) {
//    	 for(int j=0;j<ar[i].length;j++) {
//    		if(ar[i][j]== 0) {
//    			ar2[i][j] = ar1[i][j];
//        		
//    		}
//    		else if(ar1[i][j]) {
//    			ar2[i][j] = ar[i][j];
//        		
//    		}
//    		else {
//    			arr2[i][j] = arr[i][j]+arr1[i][j];
//        			}
//    		System.out.print(ar2[i][j]+ " ");
//    	 }
//    	 
//    	 System.out.println();
//    	     }
}
}
