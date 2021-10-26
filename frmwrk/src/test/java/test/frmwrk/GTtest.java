package test.frmwrk;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import Google.GHomePage;
import Google.GResultPage;

public class GTtest extends test
{

	@Test
	public void TS001() throws InterruptedException, IOException{
		
		driver=BrowserCall();
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Thread.sleep(3000);
		
		GHomePage GHP = new GHomePage(driver);
		GHP.FSeachText().sendKeys("Arisglobal");
		Thread.sleep(3000);
		GHP.FSeachButton().click();
		
		GResultPage GRP= new GResultPage(driver);
		String res=GRP.FResult().getText();
		System.out.println(res);
		
		
		
		
				
	}
	
	@AfterTest
	public void test1(){
		driver.close();
	}
	}
