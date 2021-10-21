package TestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amzn {
	@Test
	public static void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Mobiles")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		Thread.sleep(4000);
		driver.close();

	}

}
