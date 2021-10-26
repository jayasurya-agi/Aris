package test.frmwrk;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class GTtest2 extends test{

	@Test
	public void ts02() throws IOException
	{
		driver=BrowserCall();
		driver.get(prop.getProperty("URL"));
		Assert.assertEquals(driver.getTitle(),prop.getProperty("ExpectedTitle"));
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}

