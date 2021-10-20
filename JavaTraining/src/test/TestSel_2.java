package test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestSel_2 {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  
	    System.out.println("Enter Browser");
	    String Browser = myObj.nextLine(); 
	    
	    if(Browser.equalsIgnoreCase("Chrome")){
	    	
	    System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Selenium\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		String title = driver.getTitle();
		System.out.println("the title is: "+title);
		driver.close();
	    }

	    else if(Browser.equalsIgnoreCase("Edge")){
	    	System.setProperty("webdriver.edge.driver", "D:\\eclipse\\Selenium\\edgedriver_win64\\msedgedriver.exe");
		    WebDriver driver1=new EdgeDriver();
		    driver1.get("https://www.youtube.com");
			String title = driver1.getTitle();
			System.out.println("the title is: "+title);
			driver1.close();
	    	
	    }
	    
	    else{
	    	System.out.println("Invalid Browser");
	    }
	    }
	}

