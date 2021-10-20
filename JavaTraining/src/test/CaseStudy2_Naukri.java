package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CaseStudy2_Naukri {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\eclipse\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
		// Load the website
		driver.get("http://www.naukri.com/");

		// It will return the parent window name as a String
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{
			String child_window=I1.next();


			if(!parent.equals(child_window))
			{
			driver.switchTo().window(child_window);

			System.out.println(driver.switchTo().window(child_window).getTitle());
			Thread.sleep(5000);
			driver.close();
			}
			}
		//switch to the parent window
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.close();
						
			
		}
	
}

