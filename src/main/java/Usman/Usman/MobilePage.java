package Usman.Usman;

import org.openqa.selenium.By;
import org.testng.Assert;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MobilePage extends Basetest {
	
	
	public MobilePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Mobile')]")
	WebElement Mobile;
	
	@FindBy(xpath="//h1[contains(text(),'Mobile')]")
	WebElement title;
	
	@FindBy(xpath="//select[@title='Sort By']")
    WebElement dropdownElement;

	@FindBy(xpath="//a[contains(text(),'IPhone')]")
	WebElement iphone;
	
	@FindBy(xpath="//a[contains(text(),'Samsung Galaxy')]")
	WebElement Samsung;
	
	@FindBy(xpath="//a[contains(text(),'Sony Xperia')]")
	WebElement Sony;
	
	public void Mobile()
	{
		Mobile.click();

	}
	public String title1()
	{
		return title.getText();
	}
   public void SortBy()
    {
	dropdownElement.click();
	}
    public void selectOptionFromDropdown(int a)
    {
    Select dropdown = new Select(dropdownElement);
    dropdown.selectByIndex(1);
    }
   public void mobilename()
    {
	 iphone.getText();
	 String  ip=iphone.getText();
	 Assert.assertEquals(ip, "IPHONE");
	 
	 Samsung.getText();
	 String sa=Samsung.getText();
	 Assert.assertEquals(sa, "SAMSUNG GALAXY");
	 
	 Sony.getText();
	 String so=	 Sony.getText();
	 Assert.assertEquals(so, "SONY XPERIA");

	
	
    }

}
