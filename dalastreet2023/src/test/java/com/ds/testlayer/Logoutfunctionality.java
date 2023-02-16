package com.ds.testlayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.testbase.TestBase;

public class Logoutfunctionality extends TestBase {

	@Test
	public void verifyLogoutFunctionality() throws InterruptedException
	{
		String expected_result = "https://www.apps.dalalstreet.ai/logout";
	
		dash_obj.clickOnProfileDropdown();
		dash_obj.clickOnPowerOff();
		
		String actual_result = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_result, expected_result);
	}	
	
	
	
}
