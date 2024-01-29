import org.testng.annotations.Test;

public class DEMOTEST {
	@Test
	public void demotest() {
		String Browser=System.getProperty("browser");
		String ENV=System.getProperty("env");
		System.out.println(Browser+" : "+ENV);
	}
}
