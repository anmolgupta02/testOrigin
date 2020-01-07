package businessLogics;

import java.io.IOException;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPL;
import utils.ConfigReader;
import utils.DriverClass;
import utils.HelperMethods;

public class LoginBL extends DriverClass{
	LoginPL lp;
	public LoginBL() {
		 lp = PageFactory.initElements(ldriver, LoginPL.class);
	}
	HelperMethods hm = new HelperMethods(); 
	ConfigReader config; 
	
	public void ValidLogin(String Username, String Password) {
		
		hm.writeText(lp.getLoginField(), Username);
		hm.writeText(lp.getPasswordField(), Password);
		hm.clickOnElement(lp.getSingInButton());
	
	}
	
	
	public void loginWith2FA(String Username, String Password) throws IOException, InterruptedException {
		config = new ConfigReader();
		hm.writeText(lp.getLoginField(), Username);
		hm.writeText(lp.getPasswordField(), Password);
		hm.clickOnElement(lp.getSingInButton());
		hm.waitForPageLoad(ldriver);
		hm.writeText(lp.getTwoFATextBox(), config.getPasscode());
		Thread.sleep(2000);
		hm.HandleClickAction(lp.getTwoFASignIn(), ldriver);
	}

}
