package com.ds.testlayer;




import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pagelayer.Dashboard;
import com.ds.pagelayer.Exchanges;
import com.ds.pagelayer.LoginPage;
import com.ds.testbase.TestBase;

public class BuyFunctionality extends TestBase {

	
@Test
public void verifyBuyFunctionalityWithLongTermMarket() throws InterruptedException
{

	String expected_result = "Order Created successfully";
	//-----------------
	
	dash_obj.enterCompanyName("wipro");
	dash_obj.clickOnOption();
	logger.info("exchanges");
	Thread.sleep(3000);
	exchange_obj.clickOnBuyButton1();
	exchange_obj.enterQuanity("2");
	exchange_obj.clickOnBuyButton2();
	Thread.sleep(3000);
	logger.info("Order created succesfully");
	String actaul_result = exchange_obj.getOrderStatus();
	Assert.assertEquals(actaul_result, expected_result);
	
}
	

@Test
public void verifyBuyFunctionalityWithIntradayAndMarket() throws InterruptedException
{
	String expected_result = "Order Created Successfully";
	//------------------------------------------------
	dash_obj.enterCompanyName("Wipro");
	dash_obj.clickOnOption();
	Thread.sleep(3000);
	exchange_obj.clickOnBuyButton1();
	exchange_obj.clickOnIntraday();
	exchange_obj.enterQuanity("2");
	exchange_obj.clickOnBuyButton2();
	Thread.sleep(3000);
	String actaul_result = exchange_obj.getOrderStatus();
	Assert.assertEquals(actaul_result, expected_result);
}
}

