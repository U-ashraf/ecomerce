package Usman.Usman;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Creataccountpage extends Basetest {
	
	
	public  Creataccountpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//header/div[1]/div[2]/div[1]/a[1]/span[2]")
	WebElement account;
	
	@FindBy(xpath="//a[contains(text(),'My Account')]")
	WebElement myaccount;
	@FindBy(xpath="//a[@class='button']")
	WebElement creataccount;
	@FindBy(xpath="//input[@id='firstname']")
	WebElement firstname;
	@FindBy(xpath="//input[@id='lastname']")
	WebElement lastname;
	@FindBy(xpath="//input[@id='email_address']")
	WebElement email;
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	@FindBy(xpath="//input[@id='confirmation']")
	WebElement reconfirmpassword;
	@FindBy(xpath="//span[contains(text(),'Register')]")
	WebElement register;
	@FindBy(xpath="//p[contains(text(),'Welcome, umn ash!')]")
	WebElement welcome;
	@FindBy(xpath="//input[@id='email']")
	WebElement loginemail;
	@FindBy(xpath="//input[@id='pass']")
	WebElement  loginpass;
	@FindBy(xpath="//button[@id='send2']")
	WebElement loginbutton;
	
	public void creataccount()
	{
	account.click();
    myaccount.click();
    
  /*  creataccount.click();
		firstname.sendKeys("umn");
		lastname.sendKeys("ash");
		email.sendKeys("usman@yahoo.com");
		password.sendKeys("123456");
		reconfirmpassword.sendKeys("123456");
		register.click();
	String	welcomemessage=welcome.getText();
	Assert.assertEquals(welcomemessage, "Welcome, umn ash! ");*/
    loginemail.sendKeys("usman@yahoo.com");
    loginpass.sendKeys("123456");
    loginbutton.click();
		
	}
	
	

}
