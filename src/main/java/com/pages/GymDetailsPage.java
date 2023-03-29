package com.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class GymDetailsPage {

	
	private WebDriver driver;

	// 1. By Locators: OR
	private By settings_icon = By.cssSelector(".btn.buttonHeaderIcons");
	private By gym_details = By.xpath("//a[normalize-space()='Gym Details']");
	private By edit_icon = By.xpath("//div[@class='gymName']//button//img");
	private By gym_name = By.xpath("//input[@placeholder='Ex. Fitbit']");
	private By contact_person = By.xpath("//input[@placeholder='Ex. Jon Doe']");
	private By phone_number = By.xpath("//input[@placeholder='Eg. 5552234454']");
	private By contact_email = By.xpath("//input[@placeholder='Ex. admin@fitbit.come']");
	private By save_gym_details = By.xpath("//button[normalize-space()='Save']");
	private By cancel = By.xpath("//button[normalize-space()='Cancel']");
	private By select_file = By.xpath("//input[@type='file']");

	
	// 2. page class constructor
	public GymDetailsPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	
	
	
	// 3. page actions: features(behavior) of the page the form of methods:
	
	public void click_settings_icon()
    {	
		driver.findElement(settings_icon).click();
     //  JavascriptExecutor  js = (JavascriptExecutor)driver;
    //	 js.executeScript("arguments[0].click();", settings_icon);
    }
	
	
	public String getGymDetailsTitle() {
		return driver.getTitle();
	}
	
	
	public void click_edit_icon() 
    {
	  //WebDriverWait(driver, 20).until(EC.presence_of_element_located((By.XPATH, "//input[@type='email']")))
      driver.findElement(edit_icon).click();
    }
	
	
	public void click_gym_details()
	{
		driver.findElement(gym_details).click();
	}
	
	
	public void uploadimagefile() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(select_file).sendKeys("/home/ubuntu/Tier5QA/cat.jpg");
		
	}
		
	
	public void enter_details() {
		driver.findElement(contact_person).clear();
	   	driver.findElement(contact_person).sendKeys("test pratim");
	   	driver.findElement(gym_name).clear();
	   	driver.findElement(gym_name).sendKeys("Tier5 QA");
	   	driver.findElement(contact_email).clear();
		driver.findElement(contact_email).sendKeys("abcd@gmail.com");
		driver.findElement(phone_number).clear();
	   	driver.findElement(phone_number).sendKeys("2228909099");
	   	//driver.findElement(save_gym_details).click();
	}
		
	
	public void save_details() {
		driver.findElement(save_gym_details).click();	
	}
	
	
	public void edit_icon_visibility() {
		boolean status = driver.findElement(edit_icon).isDisplayed();
		if(status=true)
		 {
		    System.out.println("The edit icon is present");	
		 }
		else if(status=false)
		 {
			System.out.println("The edit icon is not present");
		 }
		
	}
	
	
	public void click_cancel() {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(cancel).click();
	}
	
}
	

