

import java.util.Arrays;
import java.util.Collection;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class testng_param {
	
	
	
	
	
	
	 @Test(dataProvider = "testDataProvider")
	  public void sum(int a , int b ,int c) {
		 
		 Assert.assertEquals(c,addition.add( a,  b));
		 
		
	  }
	
	@DataProvider(name = "testDataProvider")
	public  Object[][] getdata()
	{
		Object[][] data = new Object[][]{{2,3,6},{4,5,9},{3,5,8}};
		return data;
	}
	

}
