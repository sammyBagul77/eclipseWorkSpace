package Assignment;
//import java.util.Arrays;
public class Percentage {
	public static void main(String[] args) {
		int upr =0,num=0,low=0,spcl=0;
	
String s= "hpeAJ685#&!";
      char [] nw = s.toCharArray();
      for(int i = 0; i<s.length();i++){
    	  if(nw[i]>=65 && nw[i]<=90) {
    		  upr++;
    	  }
    	  else if(nw[i]>=48 && nw[i]<=57) {
    		  num++;
    	  }
    	  else if(nw[i]>=33 && nw[i]<=47 ||nw[i]>=58 && nw[i]<=64||nw[i]>=91 && nw[i]<=96||nw[i]>=123 && nw[i]<=126) {
    		  spcl++;
    	  }
    	  else if(nw[i]>=97 && nw[i]<=122) {
    		  low++;
    	  }
      }
      System.out.println("Percentage of upperCase letters: "+(upr*100.0/s.length())+"%");
      System.out.println("Percentage of Integers: "+(num*100.0/s.length())+"%");
      System.out.println("Percentage of Special characters: "+(spcl*100.0/s.length())+"%");
      System.out.println("Percentage of lowerCase letters: "+(low*100.0/s.length())+"%");
      
      double addition=((upr*100.0/s.length())+(num*100.0/s.length())+(spcl*100.0/s.length())+(low*100.0/s.length()));
      System.out.println(addition);
}
}