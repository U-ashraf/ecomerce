package Usman.Usman;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class listanddetailpricepage extends Basetest {
	
	

	public listanddetailpricepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[contains(text(),'$100.00')]")
	WebElement price;
	
	@FindBy(xpath="//a[contains(text(),'Sony Xperia')]")
	WebElement sonyxperia;
	
	@FindBy(xpath="//span[@class='price']")
	WebElement price1;
	
   @FindBy(xpath="//span[contains(text(),'Add to Cart')]")	
   WebElement Addtocarte;
   @FindBy(id="qty")
   WebElement qty;
   
	public void sonyprice() throws InterruptedException
	{
		price.getText();
	   String	p=price.getText();
	  // int price = Integer.parseInt(p);
	   
       sonyxperia.click();
       Thread.sleep(5000);
       price1.getText();
       String p1= price1.getText();
      // int price1=Integer.parseInt(p1);
  
        Assert.assertEquals(p1, p);;

		
		
	}
	
	

}
