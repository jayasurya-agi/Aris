package AmznTestObj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public WebDriver driver;

	public HomePage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	//DEFINE ALL THE WEB ELEMENT PROPERTIES
	By SearchBox=By.id("twotabsearchtextbox");
	By SearchButton=By.id("nav-search-submit-button");
	
	
	
	public WebElement SearchBox()
	{
		return driver.findElement(SearchBox);
	}
	
	
	public WebElement SearchButton()
	{
		return driver.findElement(SearchButton);
	}

}
