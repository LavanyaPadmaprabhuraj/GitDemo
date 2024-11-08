package com.inetbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.AddCustomerPage;

import com.inetbanking.pageObjects.LoginPage;

public class AddCustomer_003 extends Baseclass{
	
	@Test
	public void  addNewcustomer()
	{
		LoginPage lp =new LoginPage(driver);
		lp.setUsername(Username);
		lp.setPassword(Password);
		lp.clickSubmit();
		
		AddCustomerPage CP=new AddCustomerPage(driver);
		CP.Newcustomerlink();
		
		CP.CustomerName("LP");
		CP.Fgender();
		CP.custdob("10", "08", "1995");
		CP.getAdresstext("Begur ,Bengaluru");
		
		CP.getCityName("Bangaluru");
		CP.getMobileNumber("97414245");
		CP.getPin("560068");
		CP.getStatetext("KA");
		
		String email=randomestring()+"gmail.com";
		CP.getEmailtext(email);
		CP.getPasswordtext("abcd1234");
		CP.custsubmitLink();
		
	}
		public String randomestring()
		{
			String generatedstring = RandomStringUtils.randomAlphanumeric(8);
			return (generatedstring);
		}
		
		
		
		
	}


