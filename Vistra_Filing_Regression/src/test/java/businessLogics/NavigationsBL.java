package businessLogics;

import pages.NavigationPL;
import utils.DriverClass;
import utils.HelperMethods;

public class NavigationsBL extends DriverClass {

	HelperMethods hm = new HelperMethods();

	NavigationPL npl = new NavigationPL();

	public void NavigateToSheftList1() {
		hm.clickOnElement(npl.getShelfListLink());
	}

	public void NavigateToSpInList() {
		hm.clickOnElement(npl.getSPIlink());
	}

	public void NavigateToALF() {
		hm.clickOnElement(npl.getALFlink());
	}

	public void NavigateToSTI() {
		hm.clickOnElement(npl.getSTIlink());
	}

	public void NavigateToShelfList2() {
		hm.clickOnElement(npl.getShelfListSLink());
	}

	public void NavigateToSINC() {
		hm.clickOnElement(npl.getSINClink());
	}

	public void NavigateToTS() {
		hm.clickOnElement(npl.getTsLink());
	}
	
	public void NavigateToMyCompList() {
		hm.clickOnElement(npl.getMCLlink());
	}
	
	public void NavigationCaller() {
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToSheftList1();
		nbl.NavigateToSpInList();
		nbl.NavigateToALF();
		nbl.NavigateToSTI();
		nbl.NavigateToShelfList2();
		nbl.NavigateToSINC();
		nbl.NavigateToTS();
		nbl.NavigateToMyCompList();
	}
	
	

}
