package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPL {
	
	
	@FindBy(xpath="//input[@id='_com_liferay_login_web_portlet_LoginPortlet_login']")
	private WebElement loginField; 
	
	@FindBy(xpath="//input[@id='_com_liferay_login_web_portlet_LoginPortlet_password']")
	private WebElement passwordField;
	
	@FindBy(xpath = "//span[text()='Sign in']")
	private WebElement SingInButton;
	
	@FindBy(xpath = "//span[text()='Passcode']/following::input")
	private WebElement twoFATextBox;

	@FindBy(xpath = "//span[text()='Submit' or text()='\u63d0\u4ea4']")
	private WebElement twoFASignIn;
		
	public WebElement getLoginField() {
		return loginField;
	}

	public WebElement getPasswordField() {
		return passwordField;
	}

	public WebElement getSingInButton() {
		return SingInButton;
	}

	public WebElement getTwoFATextBox() {
		return twoFATextBox;
	}
	
	public WebElement getTwoFASignIn() {
		return twoFASignIn;
	}

}
