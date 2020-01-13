package stepRunner;

import cucumber.api.java.en.And; 

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.ConfigReader;
import utils.DriverClass;
import utils.HelperMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import businessLogics.LoginBL;
import businessLogics.NavigationsBL;

public class loginTest extends DriverClass {

	WebDriver driver;
	HelperMethods hm;
	LoginBL loginBL;
	NavigationsBL naviObj;
	ConfigReader conRed;
	

	@Given("^Open Browser and Go to portal$")
	public void OpenBrowser()throws IOException {
		conRed = new ConfigReader();
		driver = startApplication(driver, conRed.getBrowser(), conRed.getURL());
				
	}

	@When("^User submits valid \"(.*)\" and \"(.*)\"$")
	public void enter_the_Username_and_Password(String uname, String pass) {
		loginBL=new LoginBL();
		loginBL.ValidLogin(uname, pass);
	}

	@Then("^user should be navigated to portal landing screen$")
	public void CheckNavigation() {
		hm = new HelperMethods();
		hm.waitForPageLoad(driver);

		try {
			WebElement tfaTextBox = driver.findElement(By.xpath("//span[text()='Passcode']/following::input"));

			if (tfaTextBox.isDisplayed()) {
				System.out.println("Login Successful, user navigated to Two Factor Authentication Page");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Unable to find element. Login might be not occured successfully ");

		}

	}
	
	@And("^User should be navigated to each link.$")
	public void Navigate() {
		naviObj = loginBL.Redirect(); //Page Object Calling.
		naviObj.NavigationCaller();
		
	}

	@And("^Application should be closed$")
	public void quit() {
		driver.close();
	}
}
