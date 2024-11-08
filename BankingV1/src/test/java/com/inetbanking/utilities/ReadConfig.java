package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties pro; //object 
	public ReadConfig()  //created constructor
	{
		File src=new File("./Configuration/config.properties");
		try {
			FileInputStream fis=new FileInputStream(src); // read the data from config properties
			pro=new Properties();
			
// load the data from config properties during runtime
			pro.load(fis);  
		}catch (Exception e)
		{
			System.out.println("Execption is  "+e.getMessage());
		}
		
	}
	public String getApplicationURL()
	{
		String url=pro.getProperty("BaseUrl");
		return url;
	}
	
	public String getUserName()
	{
		String username=pro.getProperty("Username");
		return username;
	}
	
	public String getpassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	public String getChromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getIepath()
	{
		String Iepath=pro.getProperty("iepath");
		return Iepath;
	}


}
