package com.inetbanking.testCases;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
//import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;
public class Baseclass {
	
	ReadConfig readconfig=new ReadConfig();

	public String BaseUrl=readconfig.getApplicationURL();
	public String Username=readconfig.getUserName();
	public String Password=readconfig.getpassword();
    WebDriver driver;
    public static final String Title="Guru99 Bank Manager HomPage";   
    public static Logger logger;
    
    @Parameters("browser")
    @BeforeClass    
    public void setup(String br)
    {
    	//System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"Drivers//chromedriver.exe");
        logger=Logger.getLogger("ebanking");
    	PropertyConfigurator.configure("log4j.properties");
    	if (br.equals("chrome")) {
    		System.setProperty("webdriver.chrome.driver",readconfig.getChromepath());
        	driver =new ChromeDriver();
        	driver.manage().window().maximize();
    	}
    	else if (br.equals("ie")) {
    		System.setProperty("webdriver.ie.driver",readconfig.getIepath());
        	driver =new EdgeDriver();
        	driver.manage().window().maximize();
    	}
    		
    	driver.get(BaseUrl);
    }
    
    @AfterClass 
    public void Teardown()
    {
    	driver.quit();
    }
    public void captureScreen(WebDriver driver,String tname) throws IOException{
    	TakesScreenshot ts=(TakesScreenshot) driver;
    	File source=ts.getScreenshotAs(OutputType.FILE);
    	File target =new File(System.getProperty("user.dir")+"/Screenshots/"+ tname + ".png");
    	FileUtils.copyFile(source, target);
    	System.out.println("Screenshot taken");
}
}
