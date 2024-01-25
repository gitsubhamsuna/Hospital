package practice;

import org.testng.annotations.Test;

public class PracticeTest {
	@Test(groups = "smoke")
	public void practice1Test() {
		System.out.println("---Practice 1 Test----");
	}

	@Test(groups = "smoke")
	public void practice2Test() {
		System.out.println("---Practice 2 Test----");
	}

	@Test(groups = "regression")
	public void practice3Test() {
		System.out.println("---Practice 3 Test----");
	}

	@Test(groups = { "smoke", "regression" })
	public void practice4Test() {
		System.out.println("---Practice 4 Test----");
	}
}
