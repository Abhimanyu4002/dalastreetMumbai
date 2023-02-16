package com.ds.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
	
@FindBy(xpath="//input[@name='email'] ")
private WebElement User_id ;

@FindBy(xpath="//input[@name='password'] ")
private WebElement Pass_id ;

@FindBy(xpath="//div[@class='mt-3 d-grid'] ")
private WebElement Login_Button ;


public void EnterUserId(String userid)
{
	User_id.sendKeys(userid);
}

public void EnterPasswordId(String Passwordid)
{
	Pass_id.sendKeys(Passwordid);
}
public void ClickLoginButton()
{
	Login_Button.click();
}
}
