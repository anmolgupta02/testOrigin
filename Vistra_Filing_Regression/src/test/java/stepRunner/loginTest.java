package stepRunner;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.ro.Si;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginTest {

    WebDriver driver;
    @Given("^Open Browser and Go to portal$")
    public void OpenBrowser(){
       System.setProperty("webdriver.chrome.driver", "E:\\jars\\chromedriver.exe");
       driver = new ChromeDriver();
       driver.get("https://uat.myformations.vistra.com/");
    }

    @When("^User submits valid username and password$")
    public void enter_the_Username_and_Password()
    {
    	WebElement loginField = driver.findElement(By.xpath("//input[@id='_com_liferay_login_web_portlet_LoginPortlet_login']"));
    	loginField.clear();
    	loginField.sendKeys("aman.patwal@rsk-bsl.com");
    	

		WebElement passwordField = driver.findElement(By.xpath("//input[@id='_com_liferay_login_web_portlet_LoginPortlet_password']"));
		passwordField.clear();
		passwordField.sendKeys("Vistra123");
    	//System.out.println("This step enter the Username and Password on the login page.");
		
		WebElement SignInButton = driver.findElement(By.xpath("//span[text()='Sign in']"));
		SignInButton.click();
    }

    @Then("^user should be navigated to portal landing screen$")
    public void CheckNavigation()
    {
        System.out.println("User is navigated to the screen");
    }
    
    @And("^Application should be closed$")
    public void quit() {
    	driver.close();
    }
}
