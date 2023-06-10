package Usman.Usman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Comparepage extends Basetest {
	
	
	public Comparepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/ul[1]/li[3]/div[1]/div[3]/ul[1]/li[2]/a[1]")
	WebElement Addtocompare;
	
	@FindBy(xpath="//a[contains(text(),'Add to Compare')]")
	WebElement Addtocompare1;
	
	@FindBy(xpath="//button[@class='button']")
	WebElement compare;
	
	public void compare() throws InterruptedException
	{
		Addtocompare.click();
		Addtocompare1.click();
		
		String originalWindow = driver.getWindowHandle();

		compare.click();
		Thread.sleep(5000);
		for (String windowHandle : driver.getWindowHandles()) //for loop iterates windows and return new window to windowhandle and then focus set to new 
			                                                  //window and perform actions
		{
		    if (!windowHandle.equals(originalWindow)) {       //if new window is not equal to original window then focus on new window
		        driver.switchTo().window(windowHandle);
		        break;
		    }

		}
     String  comparemessageactual= driver.findElement(By.xpath("//h1[contains(text(),'Compare Products')]")).getText();

		Assert.assertEquals(comparemessageactual, "COMPARE PRODUCTS");
		Thread.sleep(5000);
		driver.close();
        driver.switchTo().window(originalWindow);

	
	}
	
	
	
	
	
	
	

}
