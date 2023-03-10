package com.ds.pagelayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {

	
public Dashboard(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
	
@FindBy(xpath="//input[@class='form-control']")
private WebElement search_txtbox ;

@FindBy(xpath="(//div[@class='m-4 card'])[2] ")
private WebElement select_option ;


@FindBy(xpath="//button[@id='page-header-user-dropdown']")
private WebElement profile_dropdown;

@FindBy(xpath="//span[text()='Power Off']")
private WebElement power_off_btn;

@FindBy(xpath="//a[text()='Transactions']")
private WebElement tranaction_link;



public void enterCompanyName(String Share)
{
	
	search_txtbox.sendKeys(Share);
	
}
public void clickOnOption()
{
	select_option.click();;
}

public void clickOnProfileDropdown()
{
	profile_dropdown.click();;
}

public void clickOnPowerOff()
{
	power_off_btn.click();;
}

public void clickOnTranactionLink()
{
	tranaction_link.click();;
}
}


