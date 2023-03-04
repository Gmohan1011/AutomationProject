package com.actitime.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.qa.Base.TestBase;

public class Loginpage extends TestBase {
	@FindBy(id="username")
	public WebElement username;
	
	
	@FindBy(name="pwd")
	public WebElement password;
	
	@FindBy(xpath="//a[@id='loginButton']")
	public WebElement loginbutton;
	
	
	public Loginpage()
	{
		//super();
		PageFactory.initElements(driver,this);
	}
	
	public void login()
	{
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbutton.click();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
		
	}


}
