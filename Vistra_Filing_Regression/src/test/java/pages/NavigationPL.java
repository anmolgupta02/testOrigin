package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.DriverClass;

public class NavigationPL extends DriverClass{
	

	@FindBy(xpath = "")
	private WebElement shelfListLink;
	
	@FindBy(xpath = "")
	private WebElement SPIlink;
	
	@FindBy(xpath = "")
	private WebElement ALFlink;
	
	@FindBy(xpath = "")
	private WebElement STIlink;
	
	@FindBy(xpath = "")
	private WebElement shelfListSLink;
	
	@FindBy(xpath = "")
	private WebElement SINClink;
	
	
	//Getter methods for Calling WebElements
	public WebElement getMCLlink() {
		return MCLlink;
	}

	@FindBy(xpath = "")
	private WebElement TsLink;
	
	@FindBy(xpath = "")
	private WebElement MCLlink;
	

	public WebElement getShelfListLink() {
		return shelfListLink;
	}

	public WebElement getSPIlink() {
		return SPIlink;
	}

	public WebElement getALFlink() {
		return ALFlink;
	}

	public WebElement getSTIlink() {
		return STIlink;
	}

	public WebElement getShelfListSLink() {
		return shelfListSLink;
	}

	public WebElement getSINClink() {
		return SINClink;
	}

	public WebElement getTsLink() {
		return TsLink;
	}
}
