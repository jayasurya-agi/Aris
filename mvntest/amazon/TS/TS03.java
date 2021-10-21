package TS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import AmznTestObj.HomePage;
import AmznTestObj.ResultPage;

public class TS03 {
	
	public static void main(String a[])
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		//wait
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//homepage
		HomePage AHP=new HomePage(driver);
		AHP.SearchBox().sendKeys("Samsung S21 Ultra");
		AHP.SearchButton().click();
		
		//resultpage
		ResultPage ARP=new ResultPage(driver);
		myprint(ARP.ResultText().getText());
		driver.close();
	}
	
	//print
	public static void myprint(String vText)
	{
		System.out.println(vText);
	}

}
