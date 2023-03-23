package com.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ContactsPage {
	
	
	private WebDriver driver;

	
	public ContactsPage(WebDriver ldriver) {
		this.driver = ldriver;
	}
	
	
	// 1. By Locators: OR
	private By contact_menu = By.cssSelector("a[href='/contacts']");                   //selecting contacts menu
	private By user_noNum = By.xpath("//li[2]//div[1]//button[1]");                    //first contact which has no number
	private By user_withNum = By.xpath("//li[3]//div[1]//button[1]");                  //second contact which has number
	private By inbox_tab = By.xpath("//button[normalize-space()='Inbox']");            //Inbox tab
	private By SMS_btn = By.xpath("//button[normalize-space()='SMS']");                //SMS button to check for enabled or disabled
	private By SMS_templates = By.xpath("//div[@class='cmnFieldStyle btnSelect']");    //SMS templates
	private By msg_box = By.xpath("//textarea[@placeholder='Type your message']");     //SMS message box
	private By send_btn = By.xpath("//span[normalize-space()='Send']");                //send button

	
	// 2. page class constructor
	public void open_contact() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(contact_menu).click();
	}
	
	
	public String checkcontactpagetitle() throws InterruptedException
	{
		Thread.sleep(1000);
		return driver.getTitle();
	}
	
	
	public void clickContact_noNum() throws InterruptedException
	{
		driver.findElement(user_noNum).click();
	} 
	
	
	public void clickContact_withNum()
	{
	    driver.findElement(user_withNum).click();    	
	}
	
	
	public void openInbox()
	{
		driver.findElement(inbox_tab).click();
	}
	
	
	
	public void clickSMS() {
	    driver.findElement(SMS_btn).click();	
	}
	
	
	
	public void checkSMSdisabled() 
	{
	
		Boolean btn_dis_check = driver.findElement(SMS_btn).isEnabled();
		if(btn_dis_check)
		{
			System.out.println("Button is enabled and can be used for SMS");
	     }
	     else {
	        System.out.println("Button is disabled and cannot be used for SMS");
		}
		
	}
	
	
	
	public void sendSMS()
	{
	   driver.findElement(msg_box).sendKeys("This is a test message");
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,250)", "");
	   driver.findElement(send_btn).click();
	}
	
	
}
