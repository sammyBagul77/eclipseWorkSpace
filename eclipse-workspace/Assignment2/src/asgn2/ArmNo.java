package asgn2;

public class ArmNo {
public static void main(String[] args) {
System.out.println(arm(8208));

}
static boolean arm(int num) {
int po=0,temp =num,rem =0;
double sum=0;
while(temp>0) {
	temp =temp/10;
	po++;
}
temp =num;
while(temp>0) {
	rem =temp%10;
	sum =sum+Math.pow(rem, po);
	temp = temp/10;
}
if(num == sum) {
	
	return true;
}
else {

	return false;
}

	}
}

