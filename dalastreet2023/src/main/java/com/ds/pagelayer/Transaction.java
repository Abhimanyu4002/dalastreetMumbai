package com.ds.pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transaction {

	public WebDriver driver ;
	
public Transaction(WebDriver driver)
{
	this.driver = driver ;
   PageFactory.initElements(driver, this);
}


@FindBy(xpath="//a[@class='nav-link dropdown-togglez arrow-none']")
public WebElement Trans_action ;


public void TransactionData()
{
	Trans_action.click();
}

public void TransDataTable()
{
	String mk =driver.findElement(By.xpath("//table/tbody/tr[2]/td[4]")).getText();
	System.out.println(mk);
}
public void getAllData()
{
	for(int i=1;i<=2;i++)
	{
		for(int j=1;j<=9;j++)
		{
			String alldata =driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+j+"]")).getText();
			System.out.print(alldata);
		}
		System.out.println();
	}
}
}
