package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.DashboardPage;
import pageObjects.Gym_DetailsPage;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	public DashboardPage dash;
	public Gym_DetailsPage gymp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		 //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers/chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 lp = new LoginPage(driver);
		 driver.manage().window().maximize();
		//throw new io.cucumber.java.PendingException();
	}

	
	
	
	
	
	
    ///////////////////////**LOGIN FEATURE STEPS**////////////////////
	
	
	@When("User Opens URL {string}")
	public void user_opens_url(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get(url);
		//throw new io.cucumber.java.PendingException();
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String string) {
	    // Write code here that turns the phrase above into concrete actions
		if (driver.getTitle().contains("Red Belt Gym -Login")){
			System.out.println("Title is correct");
		} else {
			System.out.println("Title is incorrect");
		}
		//throw new io.cucumber.java.PendingException();
	}

	@And("User will Enter Email as {string} and Password as {string}")
	public void user_will_enter_email_as_and_password_as(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		lp.enterUsername(username);
		lp.enterPassword(password);
		// throw new io.cucumber.java.PendingException();
	}

	@And("User will click on Login button")
	public void user_will_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		lp.clickLogin();
		//throw new io.cucumber.java.PendingException();
	}
	
	
	
	
	
	
	
    ///////////////////////**GYM DETAILS FEATURE STEPS**/////////////

	
	@Then("User will click on general settings")
	public void user_will_click_on_general_settings() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(10000);
	    gymp = new Gym_DetailsPage(driver);
	    gymp.click_settings_icon();
		//throw new io.cucumber.java.PendingException();
	}
	
	@Then("User will click on gym details")
	public void user_will_click_on_gym_details() {
	    // Write code here that turns the phrase above into concrete actions
	    gymp.select_gym_details();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//throw new io.cucumber.java.PendingException();
	}
	
	
	@And("Accordingly User will click on Edit button")
	public void accordingly_user_will_click_on_edit_button() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		gymp.select_edit_icon();
	}
	
	
	@Then("User will click on upload and select any png or jpg file")
	public void user_will_click_on_upload_and_select_any_png_jpg_file() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		gymp.upload_image();
		//throw new io.cucumber.java.PendingException();
	}
    
	
	@Then("User will fill up all fields")
	public void user_will_fill_up_all_fields()
	{
	     System.out.print("done");
	}
	
	
    @And("Finally click on Save")
    public void finally_click_on_save() throws InterruptedException 
    {
    	Thread.sleep(10);
    	gymp.save_Details();
    }
    

}
