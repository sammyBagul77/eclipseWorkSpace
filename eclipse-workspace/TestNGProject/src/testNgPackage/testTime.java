package testNgPackage;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class testTime {


		@Test
		public void function(){
			System.out.println("Functioning starts");
			int i = 1;
			System.out.println("Functioning Ends");
	}
		
		@Test(timeOut =1000)
		public void time() throws InterruptedException{
			Thread.sleep(2000);
		}
}
