package com.inetbanking.testCases;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownwithoutSelect extends Baseclass {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver-win64/chromedriver.exe");
		  
	        //Instantiating driver object
	        WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).sendKeys("iphone");
		List<WebElement> auto=driver.findElements(By.xpath("//li[@class=\"AgOexi\"]"));
		
		for (WebElement e:auto)
		{
			System.out.println(e.getText());
		}
		
		

	}

}
