package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

public WebDriver ldriver;

    
    public DashboardPage(WebDriver rdriver)
     {
   	  ldriver = rdriver;
   	  PageFactory.initElements(ldriver, this);
     }	
	
    
     //SETTINGS_ICON// 
     @FindBy(xpath="//button[@class='btn buttonHeaderIcons']")
 	 @CacheLookup
 	 WebElement settings_icon;
    
     
     
     //ADDITIONAL REVENUE//
    
     /*Additional Revenue Text*/
     @FindBy(xpath="//div[@class='title']//child::h3[contains(text(), 'Additional Revenue')]")
     @CacheLookup
     WebElement addi_rvn_text;
     
     /*Collected Amount Value*/ 
     @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[1]/div/div/div[3]/div/h4[1]")
     @CacheLookup
     WebElement collected_amount;
     
     /*Projected Value*/
     @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[1]/div/div/div[4]/div/h4[1]")
     @CacheLookup
     WebElement projected_value;
     
     
     
     //MONTHLY RECURRING REVENUE GROWTH//
     
     /*Monthly Recurring Revenue Growth Text*/
     @FindBy(xpath="//div[@class='title']//child::h3[contains(text(), 'Monthly Recurring Revenue Growth')]")
     @CacheLookup
     WebElement recc_rvn_grow_text;
     
     /*Current month revenue*/
     @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div/div/div[3]/div[1]/div/h4[1]")
     @CacheLookup
     WebElement curr_month_rev_value;
     
     /*Projected Amount*/
     @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div/div/div[3]/div[2]/div/h4[1]")
     @CacheLookup
     WebElement projected_amt;
     
     /*Projected value*/
     @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[2]/div/div/div[4]/div/h4[1]")
     @CacheLookup
     WebElement projected_val;
     
     
     
     
     //NEW CONTACTS//
     
     /*New Contacts Text*/
     @FindBy(xpath="//div[@class='title']//child::h3[contains(text(), 'New Contacts')]")
     @CacheLookup
     WebElement new_contacts_text;
     
     /*New Added Contacts*/
     @FindBy(xpath="//div[@class='title']//child::h3[contains(text(), 'New Contacts')]")
     @CacheLookup
     WebElement new_added_contacts;
     
     
     
     
     //APPOINTMENTS SCHEDULED//
     
     /*Appointment Scheduled Text*/
     @FindBy(xpath="//div[@class='title']//child::h3[contains(text(), 'Appointments Scheduled')]")
     @CacheLookup
     WebElement appoint_sche_text;
     
     /*Appointments Scheduled Value*/
     @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[4]/div/div/div[3]/div/h4[1]")
     @CacheLookup
     WebElement appoint_sche_value;
     
     
     
     
     //APPOINTMENTS SHOWED//
     
     /*Appointments Showed Text*/
     @FindBy(xpath="//div[@class='title']//child::h3[contains(text(), 'Appointments Scheduled')]")
     @CacheLookup
     WebElement appoint_showed_text;
     
     /*Appointments Showed value*/
     @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[5]/div/div/div[3]/div/h4[1]")
     @CacheLookup
     WebElement appoint_showed_value;
     
     
     
     
     //APPOINTMENTS CANCELLED//
     
     /*Appointments Cancelled*/
     @FindBy(xpath="//div[@class='title']//child::h3[contains(text(), 'Appointments Showed')]")
     @CacheLookup
     WebElement appoint_cance_text;
     
     /*Appointments Cancelled Value*/
     @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[6]/div/div/div[3]/div/h4[1]")
     @CacheLookup
     WebElement appoin_canc_value;
     
     
     
     //RETENTION//
     
     /*Retention Text*/
     @FindBy(xpath="//div[@class='title']//child::h3[contains(text(), 'Retention')]")
     @CacheLookup
     WebElement retention_text;
     
     /*Retention Value*/
     @FindBy(xpath="//*[@id=\"root\"]/div[1]/div/div[2]/div[3]/div/div/div[1]/div[2]/div/div[7]/div/div/div[3]/div/h4[1]")
     @CacheLookup
     WebElement retention_value;
     
     
     
     public String getPageTitle() {
    	 return ldriver.getTitle();
     }
     
     
     public void click_settings_icon()
     {
    	 JavascriptExecutor  js = (JavascriptExecutor)ldriver;
    	 js.executeScript("arguments[0].click();", settings_icon);
     }
    
    
	
}
