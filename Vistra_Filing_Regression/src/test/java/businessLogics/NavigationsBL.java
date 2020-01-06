package businessLogics;

import pages.NavigationPL;
import utils.ConfigReader;
import utils.DriverClass;
import utils.HelperMethods;

public class NavigationsBL extends DriverClass {

	HelperMethods hm = new HelperMethods();

	NavigationPL npl = new NavigationPL();
	
	
	ConfigReader reader;

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

	public boolean AuthenticateShelfListNav() throws Exception {

		reader = new ConfigReader();
		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToSheftList1();
		if (ldriver.getCurrentUrl().equalsIgnoreCase(reader.getLinkToSelfList1())) {
			flag = true;
		}
		return flag;
	}
	
	
	public boolean AuthenticateSpInListNav() throws Exception{
		reader = new ConfigReader();
		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToSpInList();
		if (ldriver.getCurrentUrl().equalsIgnoreCase(reader.getLinkToSpINList())) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateALFNav() throws Exception {
		reader = new ConfigReader();
		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToALF();
		if (ldriver.getCurrentUrl().equalsIgnoreCase(reader.getLinkToALF())) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateSTINav() throws Exception {
		reader = new ConfigReader();
		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToSTI();
		if (ldriver.getCurrentUrl().equalsIgnoreCase(reader.getLinkToSTI())) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateSL2Nav() throws Exception{

		reader = new ConfigReader();		
		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToShelfList2();
		if (ldriver.getCurrentUrl().equalsIgnoreCase(reader.getLinkToSelfList2())) {
			flag = true;
		}
		return flag;
	}
	
	
	public boolean AuthenticateSINCNav() throws Exception {
		
		reader = new ConfigReader();
		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToSINC();
		if (ldriver.getCurrentUrl().equalsIgnoreCase(reader.getLinkToSINC())) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateTSNav() throws Exception{
		reader = new ConfigReader();
		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToTS();
		if (ldriver.getCurrentUrl().equalsIgnoreCase(reader.getLinkToTS())) {
			flag = true;
		}
		return flag;
	}
	
	public boolean AuthenticateMYCLNav() throws Exception {
		reader = new ConfigReader();
		boolean flag = false;
		NavigationsBL nbl = new NavigationsBL();
		nbl.NavigateToMyCompList();
		if (ldriver.getCurrentUrl().equalsIgnoreCase(reader.getLinkToMyCompList())) {
			flag = true;
		}
		return flag;
	}
	
	public boolean Authenticator() throws Exception {
	
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
