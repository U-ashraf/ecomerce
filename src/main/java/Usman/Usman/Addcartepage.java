package Usman.Usman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Addcartepage {
	
	

	private WebDriver driver;

	public Addcartepage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//span[contains(text(),'Add to Cart')]")
	WebElement Addtocarte;
	
	@FindBy(xpath="//input[@title='Qty']")
	WebElement QTY;
	
	@FindBy(xpath="//tbody/tr[1]/td[4]/button[1]")
	WebElement update;
	
	@FindBy(xpath="//p[contains(text(),'* The maximum quantity allowed for purchase is 500')]")
	WebElement errormessage;
	@FindBy(xpath="//span[contains(text(),'Empty Cart')]")
	WebElement emptycarte;
	@FindBy(xpath="//h1[contains(text(),'Shopping Cart is Empty')]")
	WebElement message;
	
	public void addcarte() throws InterruptedException
	{
		
		Addtocarte.click();
		Thread.sleep(5000);
		
		QTY.click();
		QTY.clear();
		QTY.sendKeys("1000");
		Thread.sleep(5000);

		update.click();
		Thread.sleep(5000);
	
	    String	Actualmessage=errormessage.getText();
		Assert.assertEquals(Actualmessage, "* The maximum quantity allowed for purchase is 500.");
		emptycarte.click();
		message.getText();
		String m= message.getText();
		Assert.assertEquals(m, "SHOPPING CART IS EMPTY");

	}
	
	

}
