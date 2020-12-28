package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserEngine {
	
	public static WebDriver driver;
	
	public static WebDriver getBrowser()
	
	{
	 System.setProperty("webdriver.chrome.driver", testData.cpath);
	 
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 
	 return driver;
	 
		
	}

}
