package test.mvntest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    
		driver.get("https://demoqa.com/alerts");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("Test");
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		driver.close();


	}

}
