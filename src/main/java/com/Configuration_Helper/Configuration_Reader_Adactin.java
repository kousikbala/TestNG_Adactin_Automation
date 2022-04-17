package com.Configuration_Helper;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader_Adactin {
	
	public static Properties p;
	
	public Configuration_Reader_Adactin() throws IOException {
		
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\Maven_Project\\src\\main\\java\\com\\Testdata_properties\\Configuration_Adactin.properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	}

	public String get_config_url() {
		
		String value = p.getProperty("url");
		return value;
		
	}
	
	public String get_config_username() {
		
		String value = p.getProperty("username");
		return value;
		
	}
	
	public String get_confing_passwor() {
	 String value = p.getProperty("password");
	return value;
	  
	}
	
	
	
}
