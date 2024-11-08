package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)// constructor created
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(xpath="//a[@href=\"addcustomerpage.php\"]")
	WebElement addcustomerpage;
	
	@FindBy(xpath="//input[@onblur='validatecustomername();']")
	WebElement CustomerName;
	
	@FindBy(xpath="//input[@type='radio' and @value='m']")
	WebElement MGender ;
	
	@FindBy(xpath="//input[@type='radio' and @value='f']")
	WebElement FGender ;
	
	@FindBy(xpath="//input[@onblur='validatedob();']")
	WebElement DOB;
	
	@FindBy(xpath="//textarea[@onblur='validateAddress();']")
	WebElement Adress;
	//label[contains(text(), 'City Field must not be blank')]
	@FindBy(xpath="//input[@onblur='validateCity();']")
	WebElement City;
    
	@FindBy(xpath="//input[@onblur='validateState();']")
	WebElement State;
	
	@FindBy(xpath="//input[@onblur='validatePIN();']")
	WebElement PIN;
	
	@FindBy(xpath="//input[@onblur='validateTelephone();']")
	WebElement telephone;
	
	@FindBy(xpath="//input[@onblur='validateEmail();']")
	WebElement Email;
	
	@FindBy(xpath="//input[@onblur='validatepassword();']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Submit']")
	WebElement Submit;
	
	@FindBy(xpath="//input[@value='Reset']")
	WebElement reset;
	
	public void Newcustomerlink()
	{
		addcustomerpage.click();
	}
	 
	public void CustomerName(String CName)
	{
		CustomerName.sendKeys(CName);
	}
	public void getAdresstext(String address)
	{
		Adress.sendKeys(address);
	}	
	public void getCityName(String city)
	{
		City.sendKeys(city);
	}
	public void getStatetext(String state)
	{
		State.sendKeys(state);
	}
	public void getPin(String pin)
	{
		PIN.sendKeys(pin);
	}
	public void getMobileNumber(String PhNumber)
	{
		telephone.sendKeys(PhNumber);
	}
	public void getEmailtext(String emailid)
	{
		CustomerName.sendKeys(emailid);
	}
	public void getPasswordtext(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void custdob(String mm,String dd,String yy)
	{
		DOB.sendKeys(mm);
		DOB.sendKeys(dd);
		DOB.sendKeys(yy);
		}
	public void custsubmitLink()
	{
		Submit.click();
	}
	public void Mgender()
	{
		MGender.click();
	}
	public void Fgender()
	{
		FGender.click();
	}
}
