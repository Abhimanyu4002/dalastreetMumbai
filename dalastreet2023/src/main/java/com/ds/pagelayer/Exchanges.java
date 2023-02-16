package com.ds.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Exchanges {

	
	public Exchanges(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Buy']")
	private WebElement buy_btn1;
	
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement quantity_txtbox;
	
	@FindBy(xpath="//button[text()='Buy']")
	private WebElement buy_btn2;
	
	@FindBy(xpath="//div[contains(text(),'Order Created')]")
	private WebElement status_smg;
	
	@FindBy(xpath="//label[text()='Intraday']")
	private WebElement intraday_btn;
	
	//------------ action methods -------------
	
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}
	
	public void enterQuanity(String count)
	{
		quantity_txtbox.click();
		quantity_txtbox.sendKeys(count);
	}
	
	public String getOrderStatus()
	{
		String msg = status_smg.getText();
		return msg;
	}

	public void clickOnIntraday() {
		intraday_btn.click();
	}
	
	
	
	
	
	
}
