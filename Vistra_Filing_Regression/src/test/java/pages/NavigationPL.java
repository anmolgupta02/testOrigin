package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.DriverClass;

public class NavigationPL extends DriverClass{
	

	@FindBy(xpath = "//li[@id='layout_24']//a[contains(text(),'Shelf List')]")
	private WebElement shelfListLink;
	
	@FindBy(xpath = "//a[contains(text(),'Special Incorporation list')]")
	private WebElement SPIlink;
	
	@FindBy(xpath = "//a[contains(text(),'Annual License Fee')]")
	private WebElement ALFlink;
	
	@FindBy(xpath = "//a[contains(text(),'Sales and Technical Invoice')]")
	private WebElement STIlink;
	
	@FindBy(xpath = "//li[@id='layout_14']//a[contains(text(),'Shelf List')]")
	private WebElement shelfListSLink;
	
	@FindBy(xpath = "//li[@id='layout_14']//a[contains(text(),'Shelf List')]")
	private WebElement SINClink;
	
	@FindBy(xpath = "//a[contains(text(),'Technical Services')]")
	private WebElement TsLink;
	
	@FindBy(xpath = "//a[contains(text(),'My Company List')]")
	private WebElement MCLlink;
	
	//Getter methods for Calling WebElements

	public WebElement getMCLlink() {
		return MCLlink;
	}

	
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
