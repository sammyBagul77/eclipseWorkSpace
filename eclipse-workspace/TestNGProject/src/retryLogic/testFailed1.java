package retryLogic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testFailed1 {
	@Test
	public void test1() {
		Assert.assertTrue(false);
	}
	@Test
	public void test2() {
		Assert.assertTrue(true);
	}
	@Test
	public void test3() {
		Assert.assertTrue(false);
	}
	@Test
	public void test4() {
		Assert.assertTrue(true);
	}
	@Test
	public void test5() {
		Assert.assertTrue(false);
	}
	@Test
	public void test6() {
		Assert.assertTrue(true);
	}

}

