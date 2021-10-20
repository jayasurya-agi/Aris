package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaseStudy1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("food")).sendKeys("100");
		driver.findElement(By.id("clothing")).sendKeys("75");
		driver.findElement(By.id("shelter")).sendKeys("160");
		
		driver.findElement(By.id("monthlyPay")).sendKeys("1000");
		driver.findElement(By.id("monthlyOther")).sendKeys("200");
		//Thread.sleep(2000);
		String Income=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		//String Expense=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String Expense=driver.findElement(By.xpath("//*[@id='totalMonthlyExpenses']")).getAttribute("value");
		
		System.out.println("Monthly Income is: " +Income);
		System.out.println("Monthly Expense is: " +Expense);
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
