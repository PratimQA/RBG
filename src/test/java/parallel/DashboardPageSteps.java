package parallel;

import io.cucumber.java.en.Given;

import java.util.List;
import java.util.Map;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;

public class DashboardPageSteps {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashPage;
	
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) throws InterruptedException {
	    
		List<Map<String, String>> credList = dataTable.asMaps();
		
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://www.redbeltgym.com");
		dashPage = loginPage.doLogin(userName, password);
	   // throw new io.cucumber.java.PendingException();
	}


	

	@Given("user is on Dashboard page")
	public void user_is_on_dashboard_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
		String title = dashPage.getDashPageTitle();
		System.out.println("Dashboard Page title is: " + title);
		//dashPage.selectMonthadd_rvn();
		
		//throw new io.cucumber.java.PendingException();
	}


	
	
}
