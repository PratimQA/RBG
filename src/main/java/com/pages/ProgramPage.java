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


public class ProgramPage {

	private WebDriver driver;
	
	
    // 1. By Locators: OR
	private By settings_icon = By.cssSelector(".btn.buttonHeaderIcons");
	private By program = By.xpath("//a[normalize-space()='Programs']");
	private By add_program_btn = By.xpath("//button[@class='creatUserBtn']");
	private By categ_field = By.xpath("//input[@placeholder='Enter a program category']");
	private By add_categ_btn = By.xpath("//button[normalize-space()='Add Category']");
//	private By phone_number = By.xpath("//input[@placeholder='Eg. 5552234454']");
//	private By contact_email = By.xpath("//input[@placeholder='Ex. admin@fitbit.come']");
//	private By save_gym_details = By.xpath("//button[normalize-space()='Save']");
//	private By cancel = By.xpath("//button[normalize-space()='Cancel']");
//	private By select_file = By.xpath("//input[@type='file']");
	
	//private By add_prd_btn = By.xpath("//button[@class='creatUserBtn']");
	private By prog_categ = By.xpath("//select[@name='category']");
	private By prog_name = By.xpath("//input[@placeholder='Ex: Jujutsu program']");
	private By prog_pic = By.xpath("//input[@type='file']");
	private By prog_description = By.xpath("//input[@placeholder='Small description here']");
	private By duration = By.xpath("//input[@name='duration_num']");
	private By duration_time = By.xpath("//select[@name='duration_months']");
    private By payment_type = By.xpath("//select[@name='paymentType']");
    private By Age_Group = By.xpath("//select[@name='age_group']");
    private By Fees = By.xpath("//input[@placeholder='Ex: 99']");
    private By save_btn = By.xpath("//button[@name='save']");
    
    
	//2. page class constructor
	public ProgramPage(WebDriver pdriver) {
		this.driver = pdriver; 		
	}
	
	
	//3.page methods
	public void click_gen_settings()
	 {
		driver.findElement(settings_icon).click();
	 }
	

	public String getProgTitle()
	{
		return driver.getTitle();
	}
	
	
	public void clickProgramlabel() {
		driver.findElement(program).click();
	} 
	
	
	public void enterCategory() {
		driver.findElement(categ_field).sendKeys("lower level courses");
	}

	
	public void clickcategorybtn() {
		driver.findElement(add_categ_btn).click();
	}
	
	
	public void clickaddacoursebtn() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(add_program_btn)).click();
		//driver.findElement(add_product_btn).click();
	}
	

	public void entercoursedetails() throws InterruptedException {
	    //Selecting program category//
		driver.findElement(prog_categ).click();
	    Thread.sleep(10000);
	    Select obj_prodcateg = new Select(driver.findElement(prog_categ));
	    obj_prodcateg.selectByValue("6387008d41e6970008f438d5");
	    
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    
	    //Enter program name//
	    driver.findElement(prog_name).sendKeys("winter socks offer");
	    
	    //Scroll down in the modal
	    JavascriptExecutor js =  (JavascriptExecutor)driver;
	    WebElement element = driver.findElement(prog_pic);
		js.executeScript("arguments[0].scrollIntoView(true)", element);
//	    Actions actions = new Actions(driver);
//	    actions.moveToElement(prod_pic).perform();
	    
	    //Enter program picture//
		Thread.sleep(10000);
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//	    wait.until(ExpectedConditions.elementToBeClickable(prod_pic)).sendKeys("C:\\Users\\PRATIM\\Pictures\\Parkstreet.jpg");
		driver.findElement(prog_pic).sendKeys("/home/ubuntu/Tier5QA/cat.jpg");
        
	    //Scroll down in the modal
//	    JavascriptExecutor js1 =  (JavascriptExecutor)driver;
//		js1.executeScript("window.scrollBy(0,500)", "");
	    
	    //Enter product duration//
	    driver.findElement(duration).sendKeys("200");
        
	    //Select duration tenure//
	    driver.findElement(duration_time).click();
	    Thread.sleep(10000);
	    Select obj_dura_time = new Select(driver.findElement(duration_time));
	    obj_dura_time.selectByValue("month");
	    
	    //Select payment type
	    driver.findElement(payment_type).click();
	    Thread.sleep(10000);
	    Select obj_pay_type = new Select(driver.findElement(payment_type));
	    obj_pay_type.selectByValue("onetime");
	    
	    //Select age group
	    driver.findElement(Age_Group).click();
	    Thread.sleep(10000);
	    Select obj_age_grp = new Select(driver.findElement(Age_Group));
	    obj_age_grp.selectByValue("63870856ba54110008c5e2b6");
	    
	    //Enter the fees
	    driver.findElement(Fees).sendKeys("100");
	    
	} 
	
	
	
	public void save_prog_details()
	{
		//Save the product details
	    driver.findElement(save_btn).click();
		
	}

	
	
	
}
	

