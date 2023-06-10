package Usman.Usman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Titlepage extends Basetest {
	
	

	public Titlepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//div[@class='page-title']")
	WebElement Pagetitle;
	
	
	
	public String title()
	{
		return Pagetitle.getText();
	}

}
