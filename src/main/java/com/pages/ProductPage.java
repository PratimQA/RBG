package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

	
	private WebDriver driver;
	
	
	    // 1. By Locators: OR
		private By settings_icon = By.cssSelector(".btn.buttonHeaderIcons");
		private By products = By.xpath("//a[normalize-space()='Products']");
 		private By add_product_btn = By.xpath("//button[@class='creatUserBtn']");
		private By categ_field = By.xpath("//input[@placeholder='Enter a product category']");
		private By add_categ_btn = By.xpath("//button[normalize-space()='Add Category']");
//		private By phone_number = By.xpath("//input[@placeholder='Eg. 5552234454']");
//		private By contact_email = By.xpath("//input[@placeholder='Ex. admin@fitbit.come']");
//		private By save_gym_details = By.xpath("//button[normalize-space()='Save']");
//		private By cancel = By.xpath("//button[normalize-space()='Cancel']");
//		private By select_file = By.xpath("//input[@type='file']");
		
		//private By add_prd_btn = By.xpath("//button[@class='creatUserBtn']");
		private By prod_categ = By.xpath("//select[@name='category']");
		private By prod_name = By.xpath("//input[@placeholder='Ex: Jujutsu program']");
		private By prod_pic = By.xpath("//input[@type='file']");
		private By prod_price = By.xpath("//input[@placeholder='Ex: 99']");
		private By sales_tax = By.xpath("//input[@name='saleTax']");
		private By prod_save = By.xpath("//button[@name='save']");
		


		//2. page class constructor
	    public ProductPage(WebDriver pdriver) {
		 this.driver = pdriver;
		 }
	    
	    
	    //3.page methods
	    public void click_settings_icon()
	    {	
			driver.findElement(settings_icon).click();
	     //  JavascriptExecutor  js = (JavascriptExecutor)driver;
	    //	 js.executeScript("arguments[0].click();", settings_icon);
	    }
		
		
		public String getProdpageTitle() {
			return driver.getTitle();
		}
		
		
		public void clickProductslabel() {
			driver.findElement(products).click();
		}
		
		
		public void enterCategory() {
			driver.findElement(categ_field).sendKeys("category supreme");
		}
		
		
		public void clickcategorybtn() {
			driver.findElement(add_categ_btn).click();
		}
	
		
		public void clickaddproduct() {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(add_product_btn)).click();
			//driver.findElement(add_product_btn).click();
		}
	
		
		public void enterproddetails() throws InterruptedException {
		    //Selecting product category//
			driver.findElement(prod_categ).click();
		    Thread.sleep(10000);
		    Select obj_prodcateg = new Select(driver.findElement(prod_categ));
		    obj_prodcateg.selectByValue("6375ddc3b12fa30008c959e6");
		    
		    
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
		    
		    //Enter product name//
		    driver.findElement(prod_name).sendKeys("winter socks offer");
		    
		    //Scroll down in the modal
		    JavascriptExecutor js =  (JavascriptExecutor)driver;
		    WebElement element = driver.findElement(prod_pic);
			js.executeScript("arguments[0].scrollIntoView(true)", element);
//		    Actions actions = new Actions(driver);
//		    actions.moveToElement(prod_pic).perform();
		    
		    //Enter product picture//
			Thread.sleep(10000);
//			WebDriverWait wait = new WebDriverWait(driver, 20);
//		    wait.until(ExpectedConditions.elementToBeClickable(prod_pic)).sendKeys("C:\\Users\\PRATIM\\Pictures\\Parkstreet.jpg");
			driver.findElement(prod_pic).sendKeys("/home/ubuntu/Tier5QA/cat.jpg");
            
		    //Scroll down in the modal
//		    JavascriptExecutor js1 =  (JavascriptExecutor)driver;
//			js1.executeScript("window.scrollBy(0,500)", "");
		    
		    //Enter product price//
		    driver.findElement(prod_price).sendKeys("200");
            
		    //Select sales tax//
		    driver.findElement(sales_tax).click();
            
		} 
		
		
		
		public void save_prod_details()
		{
			//Save the product details
		    driver.findElement(prod_save).click();
			
		}
		
}
