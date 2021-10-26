package Google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GResultPage {
	public WebDriver driver;

	public GResultPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	By Text=By.id("result-stats");
	
	
	public WebElement FResult(){
		return driver.findElement(Text);
	}
}
