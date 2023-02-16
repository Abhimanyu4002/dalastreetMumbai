package com.ds.testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import com.ds.pagelayer.Dashboard;
import com.ds.pagelayer.Exchanges;
import com.ds.pagelayer.LoginPage;
import com.ds.pagelayer.Transaction;
import com.ds.utilis.ExcelHandling;
import com.ds.utilis.ReadConfig;
import com.ds.utilis.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
    public static Logger logger ;
    public ExcelHandling excel_data;
	
public	LoginPage login_obj   ;
public	Dashboard dash_obj   ;
public  Exchanges exchange_obj   ;
public  Transaction tran_obj ;
public UtilClass util_obj ;	
//	@BeforeTest
//	public void start()
//	{
//		Logger logger = Logger.getLogger(TestBase.class);
//		PropertyConfigurator.configure("Log4jFile.properties");
//		logger.info("Framework execution start");
//	}
//	
//	@AfterTest
//	public void end()
//	{
//		logger.info("Framework execution end");	
//	}
//	
    @Parameters("browser")
	@BeforeMethod
	public void Setup( String br ) throws InterruptedException
	{
     
		if(br.equalsIgnoreCase("Chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("Edege"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		}
		else
		{
		System.out.println("plz provide correct broswer name");
		}
		 
		ReadConfig read_config= new ReadConfig();
		 
		driver.get(read_config.getApplicationurl());
		driver.get(read_config.getEmailAddress());
		driver.get(read_config.getPassword());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        logger.info("Browser launch,url,maximize");
		//-----object creation------------------
		
		login_obj =new LoginPage(driver);
		dash_obj = new Dashboard(driver);
	    exchange_obj = new Exchanges(driver);
		tran_obj = new Transaction(driver);
	     util_obj = new UtilClass();
	     excel_data =new ExcelHandling();
		logger.info("Object Creation ");
		
		//--------- login steps---------

//		login_obj.EnterUserId(read_config.getEmailAddress());
//		login_obj.EnterPasswordId(read_config.getPassword());
//		login_obj.ClickLoginButton();
//		Thread.sleep(3000);
	   logger.info("login to application");
	}
    
	
@AfterMethod
	public void teardown() 
	{
 //	driver.close();
	}

}
