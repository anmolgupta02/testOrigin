package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() throws FileNotFoundException, IOException {
		String FilePath = System.getProperty("user.dir") + "/Config/config.properties";
		File file = new File(FilePath);
		FileInputStream fis = new FileInputStream(file);

		prop = new Properties();
		prop.load(fis);

	}

	public String getUsername() {
		return prop.getProperty("username");
	}

	public String getPassword() {
		return prop.getProperty("password");
	}
	
	
	
	public String getURL() {
		return prop.getProperty("url");
	}

	public String getBrowser() {
		return prop.getProperty("browser");
	}
	
	
	
	public String getLinkToSelfList1() {
		return prop.getProperty("linktoSelfList1");
	}
	
	public String getLinkToMyCompList() {
		return prop.getProperty("linktoMyCompanyList");
	}
	
	public String getLinkToTS() {
		return prop.getProperty("linktoTS");
	}
	
	public String getLinkToSTI() {
		return prop.getProperty("linktoSTI");
	}
	
	public String getLinkToSelfList2() {
		return prop.getProperty("linktoSelfList2");
	}
	
	public String getLinkToALF() {
		return prop.getProperty("linktoALF");
	}
	
	public String getLinkToSINC() {
		return prop.getProperty("linktoSINC");
	}
	
	public String getLinkToSpINList() {
		return prop.getProperty("linktoSpInList");
	}

	public String getPasscode() {
		return prop.getProperty("Passcode");
	}
}
