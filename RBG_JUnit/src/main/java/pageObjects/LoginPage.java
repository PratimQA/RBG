package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

public WebDriver ldriver;
	
	/*
    //By txt_username = By.xpath("//input[@name='email']");
    
	//By txt_password = By.xpath("//input[@name='password']");
	
	//By btn_login = By.xpath("//div[@class='formInputs']//child::button[@class='btn orangeBtn']");
    */
    
	public LoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath="//input[@name='email']")
	@CacheLookup
	WebElement txt_Email;
	
	@FindBy(xpath="//input[@name='password']")
	@CacheLookup
	WebElement  txt_Password;
	
	@FindBy(xpath="//div[@class='formInputs']//child::button[@class='btn orangeBtn']")
	@CacheLookup
	WebElement  btn_login;
	
	
	public void enterUsername(String username){
		txt_Email.sendKeys(username);
	}
	
	
	public void enterPassword(String password){
	    txt_Password.sendKeys(password);	
	}
	
	
	public void clickLogin(){
		btn_login.click();
	}
	
}
