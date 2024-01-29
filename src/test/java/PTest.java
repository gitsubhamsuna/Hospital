import org.testng.annotations.Test;

public class PTest {
	@Test
	public void test() {
//		throw new NullPointerException("Java");
		System.out.println("throw");
	}
	@Test(groups = "smoke")
	public void log() {
		System.out.println("New test anf run for paticular class");
	}
}
