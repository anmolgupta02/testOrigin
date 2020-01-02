package stepRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverClass;

public class NavigationTest extends DriverClass{

	@Given("^User is loggedIn$")
	public void login() {
		System.out.println("Loggin In");
	}
	
	@When("^User clicks on Important links$")
	public void ClickonLinks() {
		System.out.println("Clicks");
	}
	
	
	@Then("^System must navigate to important links\\.$")
	public void VerifyNavigation() {
		System.out.println("Verfies");
	}
	
	
	
	
	
}
