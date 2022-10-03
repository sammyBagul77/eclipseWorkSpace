package retryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;
// if we have limited testcases then we will use IretryAnalyzer
public class testFailed {
	@Test(retryAnalyzer = retryLogic.RetryAnalyzer.class)
	public void test1() {
		Assert.assertTrue(false);
	}
	@Test(retryAnalyzer = retryLogic.RetryAnalyzer.class)
	public void test2() {
		Assert.assertTrue(true);
	}
}
