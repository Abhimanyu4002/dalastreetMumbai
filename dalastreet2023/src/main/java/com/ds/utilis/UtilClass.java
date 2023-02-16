package com.ds.utilis;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.ds.testbase.TestBase;

public class UtilClass extends TestBase{


	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String getWebPageUrl()
	{
		String url = driver.getCurrentUrl();
		return url ;
	}
	
	public static void  TakeScreenShots(String Filename) 
	{
		String path = "C:\\Users\\avish\\eclipse-workspace\\DalaStreet\\Screenshots\\ ";
		
		try 
		{

		      TakesScreenshot ts = (TakesScreenshot)driver ;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File desc = new File(path+Filename+".png");
			
			FileHandler.copy(src, desc);
			
		}
		 catch (IOException e) 
		{
		      System.out.println("file path not found ");
			e.printStackTrace();
		}		
		
	}
	
	
	
	
	
}
