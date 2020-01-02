package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverClass {

	public static WebDriver ldriver;
	
	public static WebDriver startApplication(WebDriver driver,String BrowserName, String URL) {
		

		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\DriverUpdated\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecho.driver", "E:\\jars\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
	
		else 
			System.out.println("Browser Not supported");
	
			
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		ldriver = driver;
		
		driver.get(URL);
		return driver;	
	}
	
	
}
