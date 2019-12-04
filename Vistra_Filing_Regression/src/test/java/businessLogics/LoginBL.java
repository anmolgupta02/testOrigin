package businessLogics;

import org.openqa.selenium.support.PageFactory;

import pages.Login;
import utils.DriverClass;
import utils.HelperMethods;

public class LoginBL extends DriverClass{
	
	Login lp = PageFactory.initElements(ldriver, Login.class);
	
	HelperMethods hm = new HelperMethods(); 
	
	public void ValidLogin(String Username, String Password) {
		
		hm.writeText(lp.getLoginField(), Username);
		hm.writeText(lp.getPasswordField(), Password);
		hm.clickOnElement(lp.getSingInButton());
	
	}
	
	
	

}
