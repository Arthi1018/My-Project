package com.properties;

import java.io.File;
import java.io.FileInputStream;                       //IO EXCEPTION
import java.io.FileNotFoundException;                 //FILE NOT FOUND EXCEPTION
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	
	public static Properties p;
	
	public ConfigurationReader() throws IOException {
		File f=new File("C:\\Users\\Arthiha\\eclipse-workspace\\Maven_TenAm\\src\\main\\java\\com\\properties\\Configuration.properties");
		
		FileInputStream fis=new FileInputStream(f);
		
		p =new Properties();  //Method p==local variable
		
		p.load(fis);
	}
	
	public String getUsername() {
    String username = p.getProperty("username");
    return username;
	}
	
	public String getPassword() {
    String password = p.getProperty("password");
    return password;
	}

}
