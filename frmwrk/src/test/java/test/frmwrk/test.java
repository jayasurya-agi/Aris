package test.frmwrk;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class test {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream fis;
	
	
	public String vBrowser;
	
	@Test
	public WebDriver BrowserCall() throws IOException
	{
		prop=new Properties();
		fis=new FileInputStream("C:\\Users\\00004814\\workspace\\frmwrk\\test.properties");
		prop.load(fis);
		vBrowser=prop.getProperty("Browser");
		
		if(vBrowser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(vBrowser.equalsIgnoreCase("Edge"))
		{
			System.setProperty("webdriver.edge.driver", "D:\\eclipse\\Selenium\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
		}
		
		else
		{
			System.out.println("Invalid Browser");
		}
		return driver;
		
		
		
		
	}
	
	
}
