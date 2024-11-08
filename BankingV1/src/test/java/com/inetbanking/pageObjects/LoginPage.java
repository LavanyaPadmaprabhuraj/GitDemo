package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver ldriver; 
	public LoginPage(WebDriver rdriver)// constructor created
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	//created with all element and action methods
	
	@FindBy(xpath="//input[@onkeyup=\"validateuserid();\"]")
	WebElement txtUsername;
	
	@FindBy(xpath="//input[@onkeyup=\"validatepassword();\"]")
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@value='LOGIN']")
	
	WebElement login;
	
	@FindBy(xpath="//input[@value='RESET']")
	WebElement resetlink;
	@FindBy(xpath="//a[contains(text(), 'Log out')]")
	WebElement logout;
	
	
	public void setUsername(String uname)
	{
		txtUsername.sendKeys(uname);
	}

	public void setPassword(String Upassword)
	{
		txtpassword.sendKeys(Upassword);
	}
	
	public void clickSubmit()
	{
		login.click();
	}
	public void clickLOGOUT()
	{
		logout.click();
	}
}
