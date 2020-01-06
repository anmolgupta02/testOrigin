package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop;

	public ConfigReader() throws FileNotFoundException, IOException {
		String FilePath = System.getProperty("user.dir") + "/Congif/config.properties";
		File file = new File(FilePath);
		FileInputStream fis = new FileInputStream(file);

		prop = new Properties();
		prop.load(fis);

	}

	public String getNav() {

		return prop.getProperty("");
	}

}
