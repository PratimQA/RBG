package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

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
	private By user_noNum = By.xpath("//li[3]//div[1]//button[1]");                    //second contact which has no number
	private By user_withNum = By.xpath("//li[4]//div[1]//button[1]");                  //third contact which has a number
	private By user_noemail = By.xpath("//li[2]//div[1]//button[1]");                  //first contact with no email
	private By user_withEmail = By.xpath("//li[5]//div[1]//button[1]");                //fourth contact with email
	private By inbox_tab = By.xpath("//button[normalize-space()='Inbox']");            //Inbox tab
	private By SMS_btn = By.xpath("//button[normalize-space()='SMS']");                //SMS button to check for enabled or disabled
	private By SMS_Tempbox = By.xpath("//div[@class='cmnFieldStyle btnSelect']");      //SMS templates
	private By SMS_Templist = By.xpath("//ul[@class='showTemplateName']");             //SMS Templates list
	private By msg_box = By.xpath("//textarea[@placeholder='Type your message']");     //SMS message box
	private By send_btn = By.xpath("//span[normalize-space()='Send']");                //send button
	private By contact_cross_icon = By.xpath("//button[@class='closeModal']");         //contact close modal
	private By comm_log_icon = By.xpath("//button[@class='btn buttonHeaderIcons ']");  //Communication log icon                                       
    private By search_box = By.xpath("//input[@placeholder='Search by From / To, SMS and Email Subject']");      //Search box in communication box
    private By searchIcon = By.xpath("//button[@class='searchIcon']");                                          //Search icon in communication search
    
    private By Email_btn = By.xpath("//button[normalize-space()='Email']");           //Email button in contact modal inbox
    private By Email_temp_box = By.xpath("//span[normalize-space()='Select Template']");   //Email template dropdown
    private By Email_temp_list = By.xpath("//ul[@class='showTemplateName']");              //Email template list
    private By Email_error_msg = By.xpath("//div[@class='errorMsg space']");               //Error message if email is not there
    private By Email_savebtn = By.xpath("//button[@class='saveNnewBtn']");                 //Email save button
    
    //For Bulk email and SMS
    private By checkbox1 = By.xpath("//input[@name='contactId642162f566286c0008d4300c']");
    private By checkbox2 = By.xpath("//input[@name='contactId641854d37da9cd00087d0350']");
    private By checkbox3 = By.xpath("//input[@name='contactId640f1d27d81d8b8011cf61c0']");
	private By Actions_btn = By.xpath("//button[normalize-space()='Actions']");       //This is for the actions button for bulk email and SMS
	private By Bulk_SMS = By.xpath("//div[@class='contactHead']//li[1]");   
	//div[@class='contactHead']//li[1]                
	//button[normalize-space()='Send SMS']                                            //Bulk SMS action
	private By Bulk_Email = By.xpath("//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div[1]/div[1]/div[2]/div[1]/div/ul/li[2]/button/img[1]");     
	//div[@class='contactHead']//li[2]                                                //Bulk Email action
	//button[normalize-space()='Send Email']
	
	private By BulkSMStext = By.xpath("//h3[normalize-space()='Send Bulk SMS']");           //Bulk SMS text verify
	private By BulkEmailtext = By.xpath("//h3[normalize-space()='Send Bulk Email']");       //Bulk Email text verify
	
	   //Bulk email
	   private By BulkEmailtempl = By.xpath("//span[normalize-space()='Choose an email template']");
	   private By BulkEmailtemplbox = By.xpath("//ul[@class='showTemplateName']");
	   private By BulkEmailsendbtn = By.xpath("//button[normalize-space()='Send Email']");
	   
	   private By BulkEmailmodalclose = By.xpath("//button[@class='btn btn-closeSideMenu']");
	   
	   //Bulk sms
	   private By BulkSMStempl = By.xpath("//select[@type='text']");
	   private By BulkSMStemplbox = By.xpath("");
	   private By BulkSMSinputbox = By.xpath("//textarea[@placeholder='Send message']");
	   private By BulkSMSsendbtn = By.xpath("//button[@class='cmnBtn']");
	   
	   private By BulkSMSmodalclose = By.xpath("//button[@class='btn btn-closeSideMenu']");
	   
	   
	   
	   
	   
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
	
	
	
	public void clickContact_noEmail()
	{
	   driver.findElement(user_noemail).click();	
	}
	
	
	
	public void clickContact_withEmail()
	{
	  driver.findElement(user_withEmail).click();	
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
	
	
	
	public void sel_SMSTemplates()
	{
	   	
		driver.findElement(SMS_Tempbox).click();
		
	  	List<WebElement> templates = driver.findElements(SMS_Templist);
		
	  	for(WebElement webelement : templates)
	  	{
	  		if(webelement.getText().trim().equals("Leave it now"));
	  		 webelement.click();
	  		 break;
	  	}
	}
	
	
	
	public void sendSMS()
	{
	   driver.findElement(msg_box).sendKeys("This is a test message");
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,250)", "");
	   driver.findElement(send_btn).click();
	}
	
	
	public void clickEmail()
	{
		driver.findElement(Email_btn).click();
	}
	
	
	
	public void checkEmaildisabled() throws InterruptedException
	{
//		//driver.findElement(By.xpath("//body/div[@id='root']/div[@class='modal contactModal']/div[@class='modalContainer']/div[@class='tabBarArea']/div[@class='editingPanel']/div[@class='editFormBody active']/div[@class='formBody']/div[1]")).click();
//		Thread.sleep(3000);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
//		
//		//Boolean email_savebtn = driver.findElement(Email_savebtn).isEnabled();
//		
//		String error_msg = "Sending EMAIL is disabled now, to enable it save a email first";
//		//String actual_errormsg = driver.findElement(Email_error_msg).getText().trim().equals("Leave it now");
//		
//		//System.out.println(actual_errormsg);
//		
//		if(driver.findElement(Email_error_msg).getText().trim().equals("Sending EMAIL is disabled now, to enable it save a email first")) 
//			{
//			    System.out.println("Email is not given");	
//			}	
//		else
//	     	{
//			System.out.println("Email is given");
//	    	}
		
		
		Boolean email_savebtn = driver.findElement(Email_savebtn).isEnabled();
		if(email_savebtn)
		{
			System.out.println("Email is given");	
		}
		else
		{
			 System.out.println("Email is not given");	
		}
	}
	
	
	
	  public void sendEmail() 
	  {
		 driver.findElement(Email_temp_box).click();
		 List<WebElement> email_templates = driver.findElements(Email_temp_list);
			
		  	for(WebElement webelement : email_templates)
		  	{
		  		if(webelement.getText().trim().equals("This is not a mail template for RBG"));
		  		 webelement.click();
		  		 break;
		  	}
		  	
		 driver.findElement(Email_savebtn).click(); 	
	  }
	
	
	  
	public void closecontact() 
	{
	   driver.findElement(contact_cross_icon).click();	
	}
	
	
	
	
	public void visit_comm_log() throws InterruptedException
	{
	   driver.findElement(contact_cross_icon).click();
	   Thread.sleep(2000);
	   driver.findElement(comm_log_icon).click();
	   Thread.sleep(2000);
//	   driver.findElement(search_box).sendKeys("9163547539");
//	   driver.findElement(searchIcon).click();
	}	
	
	
	public void openContactAgain() 
	{
		driver.findElement(contact_menu).click();
	}
	
	
	public void selectMultipleUsers()
	{
		driver.findElement(checkbox1).click();
		driver.findElement(checkbox2).click();
		driver.findElement(checkbox3).click();
		driver.findElement(Actions_btn).click();
		
//		List<WebElement> actionlist = driver.findElements(Actions_btn);
//		
//		for(WebElement webelement : actionlist)
//	  	{
//	  		if(webelement.getText().trim().equals("Leave it now"));
//	  		 webelement.click();
//	  		 break;
//	  	}
		
		driver.findElement(Bulk_SMS).click();
		
	}
	
	
	
	public void selectBulkSMS() 
	{
		WebElement element1 = driver.findElement(Bulk_SMS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//executor.executeScript(“arguments[0].click();”, element1);
	    js.executeScript("arguments[0].click();", element1);
	}
	
	
	
	public void selectBulkEMail()
	{
		WebElement element2 = driver.findElement(Bulk_Email);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//executor.executeScript(“arguments[0].click();”, element1);
	    js.executeScript("arguments[0].click();", element2);
	}
	
	
	public void BulkSMSverify() 
	{
		String BulkSMStextverify = driver.findElement(BulkSMStext).getText().trim();
		System.out.println(BulkSMStextverify+"modal opened");
		
	}
	
	
	public void BulkEmailverify()
	{
		String BulkEmailtextverify = driver.findElement(BulkEmailtext).getText().trim();
		System.out.println(BulkEmailtextverify+"modal opened");
	}
	
	
	public void SendBulkSMS()
	{
	   	driver.findElement(BulkSMSinputbox).sendKeys("This is a test Bulk SMS for automation");
	   	driver.findElement(BulkSMSsendbtn).click();
	}
	
	
	
	
	public void SendBulkEMail() 
	{
		driver.findElement(BulkEmailtempl).click();
		 List<WebElement> bulk_email_templates = driver.findElements(BulkEmailtemplbox);
			
		  	for(WebElement webelement : bulk_email_templates)
		  	{
		  		if(webelement.getText().trim().equals("HELLO"));
		  		 webelement.click();
		  		 break;
		  	}
		  	
		 driver.findElement(BulkEmailsendbtn).click(); 
	}
	
	
	
	public void closeBulkmodal()
	{
		//Close Bulk Email modal and visit communication log
		driver.findElement(comm_log_icon).click();
		
	}
	
	
}