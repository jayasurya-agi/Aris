package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSel_3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.linkedin.com");
		System.out.println(driver.getTitle());	
		driver.findElement(By.className("nav__button-secondary")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("jayasurya@gmail.com");
		driver.findElement(By.id("password")).sendKeys("1234511226");
		
		//driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"reset-password-submit-button\"]")).click();
		//driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		//driver.findElement(By.xpath("//button[text()='Sign in' and @aria-label='Sign in']")).click();
		//driver.findElement(By.xpath("//*[text()='Sign in' and @aria-label='Sign in']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Sign in']")).click();
		Thread.sleep(4000);
		String Error=driver.findElement(By.id("error-for-password")).getText();
		System.out.println(Error);
		
		driver.findElement(By.partialLinkText("password")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		driver.findElement(By.linkText("Join now")).click();
		System.out.println(driver.getTitle());
		Thread.sleep(4000);
		
		driver.findElement(By.id("email-or-phone")).sendKeys("122");
		driver.findElement(By.id("join-form-submit")).click();
		String Error1=driver.findElement(By.className("artdeco-inline-feedback__message")).getText();
		System.out.println(Error1);
		Thread.sleep(4000);
		driver.close();
	}

}
