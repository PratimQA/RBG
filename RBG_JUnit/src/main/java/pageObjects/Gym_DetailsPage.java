package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Gym_DetailsPage {

	public WebDriver ldriver;
	
	public Gym_DetailsPage(WebDriver rdriver)
    {
  	  ldriver = rdriver;
  	  PageFactory.initElements(rdriver, this);
    }	
	
	//settings icon//
	@FindBy(xpath = "//button[@class='btn buttonHeaderIcons']")
	@CacheLookup
	WebElement settings_icon;
    
	//gym details label//
	@FindBy(xpath = "//a[normalize-space()='Gym Details']")
	@CacheLookup
	WebElement gym_details;
    
	//edit icon//
	@FindBy(xpath = "//div[@class='gymName']//button//img")
    @CacheLookup
    WebElement edit_icon;
	
	//input image//
    @FindBy(xpath ="//input[@type='file']")
	@CacheLookup
	WebElement input_image;
    
    //organisation name field//
    @FindBy(xpath = "//input[@placeholder='Ex. Fitbit']")
    @CacheLookup
    WebElement org_name;
    
    //contact person//
    @FindBy(xpath = "")
    @CacheLookup
    WebElement contact_person;
    
    //phone no//
    @FindBy(xpath = "")
    @CacheLookup
    WebElement phone_no;
    
    //contact email//
    @FindBy(xpath = "")
    @CacheLookup
    WebElement email;
    
    //timezone//
    @FindBy(xpath = "")
    @CacheLookup
    WebElement timezone;
    
    //save button//
    @FindBy(css = "button[type='submit']")
    @CacheLookup
    WebElement save_btn;
    
    public void click_settings_icon()
    {
   	 JavascriptExecutor  js = (JavascriptExecutor)ldriver;
   	 js.executeScript("arguments[0].click();", settings_icon);
    }
    
    public void select_gym_details() 
    {
    	gym_details.click();
    }
    
    public void select_edit_icon() 
    {
    	edit_icon.click();
    }
    
    public void upload_image() {
    	input_image.sendKeys("C:\\Users\\Pratim\\Pictures\\Bengal and Bangladesh.png");
    }
    
    public void save_Details() {
    	JavascriptExecutor js = (JavascriptExecutor)ldriver;
    	js.executeScript("window.scrollBy(0,250)", "");
    	save_btn.click();
    	
    }
}
