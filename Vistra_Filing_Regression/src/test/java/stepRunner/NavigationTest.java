package stepRunner;

import org.openqa.selenium.WebDriver; 
import businessLogics.NavigationsBL;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.ConfigReader;
import utils.DriverClass;
import utils.HelperMethods;

public class NavigationTest extends DriverClass{

	WebDriver driver = null;
	ConfigReader cr;
	NavigationsBL nbl;
	HelperMethods hm;
	
	@Given("^User is loggedIn$")
	public void login() throws Exception {		
		cr = new ConfigReader();
		driver = startApplication(driver, cr.getBrowser(), cr.getURL());
		
		nbl = new NavigationsBL();
	
		try {
		hm.waitForPageLoad(ldriver);
		}catch(NullPointerException e) {
			System.out.println("Caught a null pointer");
		}finally {
			Thread.sleep(5000);
			nbl.loginSimple(cr.getUsername(),cr.getPassword());
			}
	}
	
	@When("^User clicks on Important links$")
	public void ClickonLinks() {
	System.out.println("Clicks on Link");
	
		nbl = new NavigationsBL();
		nbl.NavigationCaller();
	}
	
	
	@Then("^System must navigate to important links\\.$")
	public void VerifyNavigation() throws Exception {

		System.out.println("Verfied");
		nbl = new NavigationsBL();
		boolean res = nbl.Authenticator();
		if(res) {
			System.out.println("Navigation to all pages went successfully");
		}else {
			System.out.println("Either some pages could not be visited or some error occured");
		}
	}

	@And("^The browser should be closed$")
	public void the_browser_should_be_closed() throws Throwable {
		System.out.println("Closing Browser Now");
		driver.quit();
	}

}
