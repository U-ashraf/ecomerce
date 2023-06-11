package Usman.Usman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Tvpage extends Basetest {
	
	public Tvpage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'TV')]")
	WebElement tv;
	@FindBy(xpath="//a[contains(text(),'Add to Wishlist')]")
	WebElement Addtowishlist;
	@FindBy(xpath="//button[@name='save_and_share']")
	WebElement sharewishlist;
	@FindBy(xpath="//textarea[@id='email_address']")
	WebElement emailaddresse;
	@FindBy(xpath="//textarea[@id='message']")
	WebElement message;
	@FindBy(xpath="//button[@class='button']")
	WebElement sharewishlist1;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/ul[1]/li[1]/ul[1]/li[1]")
	WebElement message1;
	public void tv()
	{
		tv.click();
		Addtowishlist.click();
		sharewishlist.click();
		emailaddresse.sendKeys("aiza@gmail.com");
		message.sendKeys("excellent");
		sharewishlist1.click();
	String	shareconfirmation=message1.getText();
	Assert.assertEquals(shareconfirmation, "Your Wishlist has been shared.");
	}	
	
	
	
	

}
