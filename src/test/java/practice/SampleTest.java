package practice;

import org.testng.annotations.Test;

public class SampleTest {
	@Test(groups = "smoke")
	public void sample1Test() {
		System.out.println("---Sample 1 Test----");
	}
	@Test(groups = "smoke")
	public void sample2Test() {
		System.out.println("---Sample 2 Test----");
	}
	@Test(groups = "regression")
	public void sample3Test() {
		System.out.println("---Sample 3 Test----");
	}
	@Test(groups = "regression")
	public void sample4Test() {
		System.out.println("---Sample 4 Test----");
	}
}
