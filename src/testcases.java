import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testcases {
	
	@Test
	public void login()
	{
		System.out.println("logging up ");
	}
	
	@Test
	public void openpage()
	{
		System.out.println("Page opened up");
	}
	
	@BeforeMethod
	public void openbrowser()
	{
		System.out.println("Browser Opening");
	}
	
	@AfterMethod
	public void closebrowser()
	{
		System.out.println("Browser closing");
	}
	
	@BeforeTest
	public void opendb()
	{
		System.out.println("open DB connection");
	}
	
	@AfterTest
	public void closedb()
	{
		System.out.println("close DB connection");
	}

}
