package com.inetbanking.testCases;
import java.io.IOException;
//import java.sql.Driver;
//import java.util.logging.Logger;

import org.testng.annotations.Test;
//import org.testng.*;
import com.inetbanking.pageObjects.LoginPage;
import junit.framework.Assert;

public class Test_Login_page_001 extends Baseclass {
    
	@Test
	public void loginTest() throws IOException
	{
		driver.get(BaseUrl);
	    logger.info("URL openened");
		LoginPage lp =new LoginPage(driver);
		
		lp.setUsername(Username);
		logger.info("Entered username");
		lp.setPassword(Password);
		logger.info("Entered password");
		lp.clickSubmit();
		logger.info("Successfully logged in");
		System.out.println(driver.getTitle());
		
		if(driver.getTitle().equals(Title))
			                       //Guru99 Bank Manager HomePage
      	{
		    Assert.assertTrue(true);
			logger.info("Login test passed");
	
		}
		else {
			captureScreen(driver,"loginTest");
			Assert.assertTrue(false);
			logger.info("login test failed");
		}}

	}

