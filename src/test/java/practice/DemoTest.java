package practice;

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void demo1Test() {
		System.out.println("---Demo 1 Test----");
	}

	@Test(groups = "regression")
	public void demo2Test() {
		System.out.println("---Demo 2 Test----");
	}

	@Test(groups = "regression")
	public void demo3Test() {
		System.out.println("---Demo 3 Test----");
	}

	@Test(groups = "smoke")
	public void demo4Test() {
		System.out.println("---Demo 4 Test----");
	}
}
