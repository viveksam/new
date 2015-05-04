import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class testing2 {
	
	@BeforeSuite
	public void runselenium()
	{
		System.out.println("Start Selenium sever");
		
	}
	
	@AfterSuite
	public void stopselenium()
	{
		System.out.println("Stop Selenium Server");
	}
	
	@Test
	public void A()
	{
		System.out.println("selenium scripts 1");
	}

}
