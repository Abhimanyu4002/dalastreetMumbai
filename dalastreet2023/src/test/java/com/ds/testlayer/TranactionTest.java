package com.ds.testlayer;

import org.testng.annotations.Test;

import com.ds.testbase.TestBase;

public class TranactionTest extends TestBase{

	@Test
	public void getDataFromTransactionPage() throws InterruptedException
	{
		dash_obj.clickOnTranactionLink();
		tran_obj.getAllData();
	}
	
	
	
}
