package Usman.Usman;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Maintest extends Basetest {
	
	@BeforeSuite
	public void setup()
	{
		launchURL("chrome");
	}
	/*
	@AfterSuite
	public void teardown()
	{
		driver.close();
	}*/
	
	@Test(priority=3)
	public void title() throws InterruptedException
	{
		Titlepage tp=new Titlepage(driver);
		tp.title();
	   String Actual=tp.title();
	   String Expected ="THIS IS DEMO SITE FOR   ";
		Assert.assertEquals(Actual, Expected);
		Thread.sleep(5000);
		

		}
	@Test(priority=4)
	public void Mobile() throws InterruptedException
	{
		MobilePage mp=new MobilePage(driver);
		mp.Mobile();
		mp.title1();
		String Actual=mp.title1();
		String Expected="MOBILE";
		Assert.assertEquals(Actual, Expected);
		Thread.sleep(5000);


	}
	@Test(priority=5)
	public void dropdown() throws InterruptedException
	{
		MobilePage mp=new MobilePage(driver);
		mp.SortBy();
		Thread.sleep(5000);

		}
	
	 @Test(priority=6)
	    public void dropdownTest() {
	        MobilePage homePage = new MobilePage(driver);
	        homePage.selectOptionFromDropdown(1);
	    }
	 @Test(priority=7)
	 public void mobilename()
	 {
	        MobilePage mp = new MobilePage(driver);
	        mp.mobilename();

	 }
	 @Test(priority=8)
	 public void mobilepricecompare() throws InterruptedException
	 {
		 listanddetailpricepage ld=new  listanddetailpricepage(driver);
		 ld.sonyprice();
		 
	 }
	
	@Test(priority=9)
	   public void navigateBack2() {
	        driver.navigate().back();
	    }
     @Test(priority=10)
	 public void addcarte() throws InterruptedException
	 {
		 Addcartepage ac=new Addcartepage(driver);
		 ac.addcarte();
		 
	 }	 
     @Test(priority=11)
	   public void navigateBack1() throws InterruptedException {
	        driver.navigate().back();
	        Thread.sleep(5000);
	        driver.navigate().back();
	        driver.navigate().back();

	    }
     @Test(priority=12)
	 public void compare() throws InterruptedException
	 {
		 Comparepage compare=new Comparepage(driver);
		 compare.compare();
		 
	 }	
     @Test(priority=0)
   	 public void creataccount() throws InterruptedException
   	 {
    	 Creataccountpage caccount=new  Creataccountpage(driver);
   		 caccount.creataccount();
   		 
   	 }	 
     @Test(priority=1)
   	 public void tv() throws InterruptedException
   	 {
    	 Tvpage tv=new  Tvpage(driver);
   		 tv.tv();
   		 
   		 
   	 }	
     @Test(priority=2)
	   public void navigateBack() {
	        driver.navigate().back();
	        driver.navigate().back();
	        driver.navigate().back();
	        driver.navigate().back();
	        driver.navigate().back();
	        driver.navigate().back();
  
	        
	         }

}
