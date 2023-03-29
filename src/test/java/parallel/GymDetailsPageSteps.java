package parallel;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.pages.DashboardPage;
import com.pages.GymDetailsPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;

public class GymDetailsPageSteps {

	private WebDriver driver;
	private static String gym_title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashPage;
	private GymDetailsPage gympage = new GymDetailsPage(DriverFactory.getDriver());
	
	@Given("^user has already logged in$")
    public void user_has_already_logged_in(DataTable dataTable) throws InterruptedException {
		
        List<Map<String, String>> credList = dataTable.asMaps();
		
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://www.redbeltgym.com");
		dashPage = loginPage.doLogin(userName, password);
		
		gympage = dashPage.visitgym();
		
		// gymPage = dashPage()
		// throw new io.cucumber.java.PendingException();
    }


	
	
    @When("user clicks on the settings icon")
    public void user_clicks_on_the_settings_icon() throws InterruptedException {
        
    	Thread.sleep(10000);
    	gympage.click_settings_icon();
    	
     	// throw new io.cucumber.java.PendingException();
    
    }

    
    
    
    @And("user clicks on gym details")
    public void user_clicks_on_gym_details() {
    
    	gympage.click_gym_details();
    	
    }
    
    
    @Then("Gym page title should be {string}")
    public void Gym_page_title_should_be(String expectedgymtitle) {
    	
    	gym_title = gympage.getGymDetailsTitle();
    	System.out.println("login page title is:" + gym_title);
    	
    }
    
    
    
    @And("^Accordingly User will click on Edit button$")
    public void accordingly_user_will_click_on_edit_button() throws Throwable {
    	
    	Thread.sleep(10000);
    	gympage.click_edit_icon();
    	
    	// throw new io.cucumber.java.PendingException();
    }
    
    
    
    
    @Then("^User will fill up all fields$")
    public void user_will_fill_up_all_fields() throws Throwable {
    	Thread.sleep(1000);
    	gympage.enter_details();
    	// throw new io.cucumber.java.PendingException();
    }

    
    
    
    @Then("^User will click on upload and select any png or jpg file$")
    public void user_will_click_on_upload_and_select_any_png_or_jpg_file() throws Throwable {
    	
    	Thread.sleep(2000);
    	gympage.uploadimagefile();
    	
    	// throw new io.cucumber.java.PendingException();
    }

    
    
    
    @Then("^User must see the edit button beside the name of the gym$")
    public void user_must_see_the_edit_button_beside_the_name_of_the_gym() throws Throwable {
    	Thread.sleep(10000);
    	gympage.edit_icon_visibility();
    	
    	// throw new io.cucumber.java.PendingException();
    }

    
//    @And("^User will Enter Email as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
//    public void user_will_enter_email_as_something_and_password_as_something(String strArg1, String strArg2) throws Throwable {
//    	// throw new io.cucumber.java.PendingException();
//    }

    @And("Update the details")
    public void update_the_details() {
    	//Here user will just see the details and click on cancel label
    	//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
    	gympage.click_cancel();
    }
    

    @And("^Finally click on Save$")
    public void finally_click_on_save() throws Throwable {
    	
    	gympage.save_details();
    	
    	// throw new io.cucumber.java.PendingException();
    }

    
	
}
