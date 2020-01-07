package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import gherkin.lexer.Tr;

public class DriverClass {

	public static WebDriver ldriver;
	
	public static DesiredCapabilities dcs;
	
	@SuppressWarnings("deprecation")
	public static WebDriver startApplication(WebDriver driver,String BrowserName, String URL) {
		
		dcs = new DesiredCapabilities();

		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			
			dcs= DesiredCapabilities.chrome();
			
			dcs.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\DriverUpdated\\chromedriver.exe");
			driver = new ChromeDriver(dcs);
			
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
		
		System.out.println("Initiated and Returning Driver");
		return driver;	
	}
	
	
}
