package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CaseStudy2 {

	public static void main(String[] args) throws InterruptedException {
			/*CASE STUDY:
			1. Navigate to Gmail.com
			2. CAPTURE TITLE and PRINT
			3. Click HELP
			2. CAPTURE TITLE and PRINT
			4. Close BROWSER*/
		
		System.setProperty("webdriver.edge.driver", "D:\\eclipse\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	   
	    driver.manage().window().maximize();
	    driver.get("https://www.gmail.com");
        System.out.println(driver.getTitle());
        
        driver.findElement(By.linkText("Help")).click();
        Thread.sleep(3000);

        //ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
        Set<String> tabs2=driver.getWindowHandles();
        //System.out.println(tabs2);
        Iterator<String> it= tabs2.iterator();
        
        String gmail=it.next();
        String help=it.next();
        
        
        //driver.switchTo().window(tabs2.get(1));
        //driver.close();
        //driver.switchTo().window(tabs2.get(0));
        
        driver.switchTo().window(help);
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        driver.quit();
		
			

	}

}
