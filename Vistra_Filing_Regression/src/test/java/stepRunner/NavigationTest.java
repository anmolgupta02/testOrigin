package stepRunner;

import org.openqa.selenium.WebDriver;

import businessLogics.LoginBL;
import businessLogics.NavigationsBL;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.ConfigReader;
import utils.DriverClass;
import utils.HelperMethods;

public class NavigationTest extends DriverClass{

	WebDriver driver;
	LoginBL lbl;
	ConfigReader cr;
	NavigationsBL nbl;
	HelperMethods hm;
	
	@Given("^User is loggedIn$")
	public void login() throws Exception {
		cr = new ConfigReader();
		lbl = new LoginBL();
		
		driver = startApplication(driver, cr.getBrowser(), cr.getURL());
		hm.waitForPageLoad(driver);
		lbl.ValidLogin(cr.getUsername(), cr.getPassword());
	}
	
	@When("^User clicks on Important links$")
	public void ClickonLinks() {
		nbl = new NavigationsBL();
		nbl.NavigationCaller();
	}
	
	
	@Then("^System must navigate to important links\\.$")
	public void VerifyNavigation() throws Exception {
		nbl = new NavigationsBL();
		boolean res = nbl.Authenticator();
		if(res) {
			System.out.println("Navigation to all pages went successfully");
		}else {
			System.out.println("Either some pages could not be visited or some error occured");
		}
	}
	
	
	
	
	
}
