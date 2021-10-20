package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestSel_5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "D:\\eclipse\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("https://www.amazon.in");
        System.out.println(driver.getTitle());
        Actions act = new Actions(driver);
        Select select = new Select(driver.findElement(By.id("searchDropdownBox")));
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByValue("search-alias=fashion");
        Thread.sleep(3000);
        select.selectByVisibleText("Amazon Devices");
        select.selectByIndex(0);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12 128gb");
        Thread.sleep(1000);
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//*[@id='p_n_specials_match/21618256031']/span/a/div/label/i")).click();
        Thread.sleep(4000);
        //driver.findElement(By.xpath("//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")).click();
        //Thread.sleep(4000);
        System.out.println(driver.getTitle());
        
        act.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.className("nav-action-inner")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);
        
        driver.close();

	}

}
