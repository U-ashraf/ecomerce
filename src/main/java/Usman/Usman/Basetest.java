package Usman.Usman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basetest {

	 public static  WebDriver driver;
		
		public WebDriver launchURL(String browsername) {
			      
		
			
			if(browsername.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver_win32\\chromedriver.exe");
				 driver = new ChromeDriver();
			}
			else if(browsername.equals("FireFox"))
			{
				System.setProperty("webdriver.gecko.driver", "C:\\firefoxdriver\\geckodriver-v0.32.2-win64\\geckodriver.exe");
				 driver = new FirefoxDriver();
			}
			driver.get(" http://live.techpanda.org/index.php/");
			driver.manage().window().maximize();
			
			
			
	     return driver;
	}
	
	
	
}
