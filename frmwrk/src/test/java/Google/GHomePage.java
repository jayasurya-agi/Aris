package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GHomePage {

	public WebDriver driver;

	public GHomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	By SeachText=By.name("q");
	By SeachButton=By.name("btnK");
	
	public WebElement FSeachText(){
		return driver.findElement(SeachText);
	}
	public WebElement FSeachButton(){
		return driver.findElement(SeachButton);
	}
	
	
}
