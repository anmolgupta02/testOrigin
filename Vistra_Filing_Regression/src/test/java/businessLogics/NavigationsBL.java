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

	public boolean AuthenticateShelfListNav() {

		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToSheftList1();
		if (ldriver.getCurrentUrl().equalsIgnoreCase("Insert text here")) {
			flag = true;
		}
		return flag;
	}
	
	
	public boolean AuthenticateSpInListNav() {

		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToSpInList();
		if (ldriver.getCurrentUrl().equalsIgnoreCase("Insert text here")) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateALFNav() {

		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToALF();
		if (ldriver.getCurrentUrl().equalsIgnoreCase("Insert text here")) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateSTINav() {

		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToSTI();
		if (ldriver.getCurrentUrl().equalsIgnoreCase("Insert text here")) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateSL2Nav() {

				
		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToShelfList2();
		if (ldriver.getCurrentUrl().equalsIgnoreCase("Insert text here")) {
			flag = true;
		}
		return flag;
	}
	
	
	public boolean AuthenticateSINCNav() {

		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToSINC();
		if (ldriver.getCurrentUrl().equalsIgnoreCase("Insert text here")) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateTSNav() {

		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToTS();
		if (ldriver.getCurrentUrl().equalsIgnoreCase("Insert text here")) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateMYCLNav() {

		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToMyCompList();
		if (ldriver.getCurrentUrl().equalsIgnoreCase("Insert text here")) {
			flag = true;
		}
		return flag;
	}
	
	public boolean Authenticator() {
	
		NavigationsBL nbl = new NavigationsBL();
		boolean flag = true;
		boolean authNavShelfList, authSpInList, authALF, authSTI, authShelfList2, authSinc, authTS, authMyComp;
		
		authNavShelfList = nbl.AuthenticateShelfListNav();
		authSpInList = nbl.AuthenticateSpInListNav();
		authALF = nbl.AuthenticateALFNav();
		authSTI = nbl.AuthenticateSTINav();
		authShelfList2 = nbl.AuthenticateSL2Nav();
		authSinc = nbl.AuthenticateSINCNav();
		authTS = nbl.AuthenticateTSNav();
		authMyComp = nbl.AuthenticateMYCLNav();
		
		if(authNavShelfList && authSpInList && authALF && authSTI && authShelfList2 && authSinc && authTS && authMyComp) {
			flag = true;
		}
		
		return flag;
	}
	
	
}
