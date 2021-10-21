package AmznTestObj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPage {

	public WebDriver driver;

	public ResultPage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	By ResultText=By.xpath("//span[@class='a-color-state a-text-bold']");
	
	
	public WebElement ResultText()
	{
		return driver.findElement(ResultText);
	}

}
