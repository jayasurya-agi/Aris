package test;
		
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSel {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		String title = driver.getTitle();
		System.out.println("the title is: "+title);
		driver.close();
	}

}
