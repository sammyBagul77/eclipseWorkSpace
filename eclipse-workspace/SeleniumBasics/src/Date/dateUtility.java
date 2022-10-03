package Date;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;


public class dateUtility {
public static void main(String[] args) {
	Calendar cal = Calendar.getInstance();
	cal.add(Calendar.DATE, 4);
	SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy");
	System.out.println(s.format(new Date(cal.getTimeInMillis())));
	
	SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-yyyy");
	System.out.println(s1.format(new Date(cal.getTimeInMillis())));
	
	SimpleDateFormat s2 = new SimpleDateFormat("dd MM yyyy");
	System.out.println(s2.format(new Date(cal.getTimeInMillis())));
	
	cal.add(Calendar.DATE, -5);
	SimpleDateFormat s3 = new SimpleDateFormat("dd MM yyyy HH:mm:ss");
	System.out.println(s3.format(new Date(cal.getTimeInMillis())));
	
	System.out.println(getValBasedonMonth("dd MM yyyy", 3));
	System.out.println(getValBasedonYear("dd MM yyyy", 7));
}
public static String getValBasedonMonth(String format, int noOfMonth){
	Calendar cal1 = Calendar.getInstance();
	cal1.add(Calendar.MONTH,noOfMonth);
	SimpleDateFormat s= new SimpleDateFormat(format);
	return s.format(new Date(cal1.getTimeInMillis()));
}

public static String getValBasedonYear(String format, int noOfYear){
	Calendar cal1 = Calendar.getInstance();
	cal1.add(Calendar.YEAR,noOfYear);
	SimpleDateFormat s= new SimpleDateFormat(format);
	return s.format(new Date(cal1.getTimeInMillis()));
}
}
