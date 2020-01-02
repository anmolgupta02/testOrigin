package businessLogics;

import org.openqa.selenium.WebElement;

import pages.NavigationPL;
import utils.DriverClass;
import utils.HelperMethods;

public class NavigationsBL extends DriverClass{
	
	HelperMethods hm = new HelperMethods();
	WebElement placeholder = null;
	NavigationPL npl;
	
	public void NavigateToSheftList() {
		hm.clickOnElement(placeholder);	
	}
	
	public void NavigateToSpInList() {
		hm.clickOnElement(placeholder);
	}
	
	public void NavigateToALF() {
		hm.clickOnElement(placeholder);
	}

	public void NavigateToSTI() {
		hm.clickOnElement(placeholder);
	}
	
	
	public void NavigateToShelfList() {
		hm.clickOnElement(placeholder);
	}
	
	public void NavigateToSINC() {
		hm.clickOnElement(placeholder);
	}
	
	public void NavigateToTS() {
		hm.clickOnElement(placeholder);
	}
	
}
