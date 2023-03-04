package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.Base.TestBase;

public class Homepage extends TestBase {
	@FindBy(xpath="//div[@id='container_users']/parent::a")
	public WebElement userscontainer;
	
	@FindBy(id="logo_aT")
	public WebElement logo;
	
	public Homepage()
	{
	    PageFactory.initElements(driver, this);
	}
	
	
	public boolean actilogo()
	{
		boolean flag = logo.isDisplayed();
		return flag;
	}
	
	public void Userscontainer()
	{
		userscontainer.click();
	}
	
	public String getTitle()
	{
		 return driver.getTitle();
	}

}
