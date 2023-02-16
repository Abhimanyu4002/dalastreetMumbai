package com.ds.utilis;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;



public class ReadConfig {

	public static Properties pro ;
	
public ReadConfig()
{
	String path = "C:\\Users\\avish\\eclipse-workspace\\DalaStreet\\src\\test\\resource\\configs\\Config.properties";
	
	
	
	try {

		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		
		 pro = new Properties();
		
		
		pro.load(fis);
	} 
	
	catch (IOException e)
	{
		
		e.printStackTrace();
	}
}
	@Test
	public String getApplicationurl()
	{
		String url = pro.getProperty("url");
		return url ;
	}
	public String getEmailAddress()
	{
		String email = pro.getProperty("email");
		return email ;
	}
	public String getPassword()
	{
		String password = pro.getProperty("password");
		return password;
	}
	
}
