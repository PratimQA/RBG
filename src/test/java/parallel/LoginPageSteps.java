package parallel;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
    
	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		DriverFactory.getDriver().get("https://www.redbeltgym.com");
        		
		//throw new io.cucumber.java.PendingException();
	}

	
	
	
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		title = loginPage.getLoginPageTitle();
		System.out.println("login page title is:" + title);
		
		//throw new io.cucumber.java.PendingException();
	}

	
	
	
	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
	    // Write code here that turns the phrase above into concrete actions
	    
		Assert.assertTrue(title.contains(expectedTitleName));
		
		//throw new io.cucumber.java.PendingException();
	}

	
	
	
	@Then("forgot your password link should be displayed")
	public void forgot_your_password_link_should_be_displayed() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(1000);
		loginPage.isForgotPwdLinkExist();
		
		//throw new io.cucumber.java.PendingException();
	}

	
	
	@When("user enters username {string}")
	public void user_enters_username(String username) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		Thread.sleep(1000);
		loginPage.enterUserName(username);
		
		//throw new io.cucumber.java.PendingException();
	}

	
	
	@When("user enters password {string}")
	public void user_enters_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
	    
		loginPage.enterPassword(password);
		
		//throw new io.cucumber.java.PendingException();
	}

	
	
	
	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
		loginPage.clickOnLogin();
		
		//throw new io.cucumber.java.PendingException();
	}

	@Then("user gets the title of the dashboard page")
	public void user_gets_the_title_of_the_dashboard_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
