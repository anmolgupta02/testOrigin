package businessLogics;

import org.openqa.selenium.support.PageFactory;

import pages.LoginPL;
import utils.DriverClass;
import utils.HelperMethods;

public class LoginBL extends DriverClass{
	LoginPL lp;
	public LoginBL() {
		 lp = PageFactory.initElements(ldriver, LoginPL.class);
	}
	HelperMethods hm = new HelperMethods(); 
	
	public void ValidLogin(String Username, String Password) {
		
		hm.writeText(lp.getLoginField(), Username);
		hm.writeText(lp.getPasswordField(), Password);
		hm.clickOnElement(lp.getSingInButton());
	
	}
	

}
