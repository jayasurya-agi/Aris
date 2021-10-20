package test;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaseStudy3 {

	public static void main(String[] args) throws InterruptedException {
		/*
		  STEPS TO AUTOMATE
		1. OPEN MortgageCalculator
		2. Enter Home Value as 30000
		3. Enter Down Payment 3000
		4. Click on % Radio Button
		5. Enter Loan Term as 20 Years
		6. Select Loan Type as USDA
		6. Click Calculte
		7. Capture Total Monthly Payment and Print
		 */
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
		
		driver.get("https://www.mortgagecalculator.org/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("homeval")).sendKeys("30000");
		Thread.sleep(1000);
		
		driver.findElement(By.id("downpayment")).sendKeys("3000");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[2]/span/label[2]/input")).click();
		driver.findElement(By.id("loanterm")).sendKeys("20");
		Thread.sleep(1000);
		
		Select select = new Select(driver.findElement(By.name("param[milserve]")));
		select.selectByVisibleText("USDA");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[17]/input")).click();
		Thread.sleep(3000);
		
		//driver.switchTo().defaultContent();
		String out=driver.findElement(By.xpath("//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		System.out.println("Total Monthly Payment: "+out);
		Thread.sleep(3000);
		driver.close();
		

	}

}
