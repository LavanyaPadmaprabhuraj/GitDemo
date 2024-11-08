package arrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
public class launchDrivers {

	public static void main(String[] args) throws InterruptedException {
		        
	        //Creating a driver object referencing WebDriver interface
	     
	        
	        //Setting the webdriver.chrome.driver property to its executable's location
	        System.setProperty("webdriver.chrome.driver", "C://Drivers/chromedriver-win64/chromedriver.exe");
	        //System.setProperty("webdriver.edge.driver", "C://Drivers/msedgedriver.exe");
	        //Instantiating driver object
	        ChromeDriver driver = new ChromeDriver();
	        
	        //Using get() method to open a webpage
	       // driver.get("https://www.amazon.in/");
	        Thread.sleep(2000);
	        //Closing the browser
	        //driver.quit();
		

	 
	    }

	}


