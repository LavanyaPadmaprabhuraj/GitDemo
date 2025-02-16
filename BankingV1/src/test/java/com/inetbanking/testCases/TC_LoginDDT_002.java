package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

import junit.framework.Assert;

public class TC_LoginDDT_002 extends Baseclass {
	
	@Test(dataProvider = "LoginData")
	public void loginDDt(String user,String pwd)
	{
		LoginPage lp=new LoginPage(driver);
		
		lp.setUsername(user);
		logger.info("username provided");
		lp.setPassword(pwd);
		logger.info("pwd provided");
		lp.clickSubmit();
		logger.info("successfuly logged in");
		if(isAlertPresent()==true)
		{
			driver.switchTo().alert().accept(); //close alert
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.info("uLogin failed");
		}
		else
		{
			Assert.assertTrue(true);
			lp.clickLOGOUT();
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			logger.info("Login pass");
			
		}
		
	}
	
	public boolean isAlertPresent()  //user defined method created to check alert is present or not
	{
		try
		{
			driver.switchTo().alert();
			return  true;
		}catch (Exception e) {
			return false;
		}
	}
	
	
	@DataProvider(name="LoginData")
	String[][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		int cocount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][cocount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<cocount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);//1 0
			}
				
		}
		return logindata;
	}

}
