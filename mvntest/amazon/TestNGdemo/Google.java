package TestNGdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Google {
	
	@Test
	public static void main() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("amazon.in");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		
		
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div/div/div/div[1]/a/h3")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Mobiles")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro");
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		
	
		driver.close();
	}
	

@BeforeTest
public static void test1(){
	
	System.out.println("This is beforeTest text");
}



@AfterTest
public static void test(){
	System.out.println("This is afterTest text");
	
}
}