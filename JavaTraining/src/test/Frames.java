package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	public static String vText;

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", "D:\\eclipse\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	    WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
		
		
		driver.get("https://jqueryui.com/droppable/");
		vText=driver.findElement(By.className("entry-title")).getText();
		System.out.println("Text from Main Section : "+vText);
		
		int fSize=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total No of Frames :"+fSize);
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("name or ID");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		vText=driver.findElement(By.id("draggable")).getText();
		System.out.println("Text from Draggable Object : "+vText);
		
		WebElement dragEl=driver.findElement(By.id("draggable"));
		WebElement DropEl=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(dragEl, DropEl).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(DropEl, dragEl).build().perform();
		
		driver.switchTo().defaultContent();
		
		vText=driver.findElement(By.className("entry-title")).getText();
		System.out.println("Text from Main Section : "+vText);
			
		Thread.sleep(4000);
		driver.close();

	}

}
