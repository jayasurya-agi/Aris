package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSel_4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\eclipse\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        
        int vSize=driver.findElements(By.tagName("a")).size();
        System.out.println("Total Links :"+vSize);
        for (int i=0;i<vSize;i++)
        {
            //String vLink=driver.findElements(By.tagName("a")).get(i).getAttribute("href");
            String vLinkText=driver.findElements(By.tagName("a")).get(i).getText();
            System.out.println(vLinkText);

           /* if(vLinkText.contains("Gmail"))
            {
                driver.findElements(By.tagName("a")).get(i).click();
                break;
            }*/

            if(vLinkText.equalsIgnoreCase("images"))
            {
                driver.findElements(By.tagName("a")).get(i).click();
                break;
            }
          
            
        }           
        Thread.sleep(4000);
        driver.close();

	}

}
