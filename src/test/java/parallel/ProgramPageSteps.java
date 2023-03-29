package parallel;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.pages.ProgramPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProgramPageSteps {

	private WebDriver driver;
	private static String prog_title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashPage;
	private ProgramPage progPage = new ProgramPage(DriverFactory.getDriver());
	
	
	@Given("^user into RBG and will check program feature$")
    public void user_into_rbg_and_will_check_program_feature(DataTable dataTable) throws Throwable {
        
		List<Map<String, String>> credList = dataTable.asMaps();
		
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://www.redbeltgym.com");
		dashPage = loginPage.doLogin(userName, password);
		
		progPage = dashPage.visitprog();
		
		
		// throw new PendingException();
    }

	
	
    @When("^user clicks on the gen settings$")
    public void user_clicks_on_the_settings() throws Throwable {
        
    	Thread.sleep(10000);
    	progPage.click_gen_settings();
    	
    	// throw new PendingException();
    }

    
    
    @Then("^program page title should be \"([^\"]*)\"$")
    public void program_page_title_should_be_something(String strArg1) throws Throwable {
        
    	prog_title = progPage.getProgTitle();
    	System.out.println("product page title is:" + prog_title);
    	
    	//throw new PendingException();
    }

    
    
    @Then("^program category will be added$")
    public void program_category_will_be_added() throws Throwable {
        Thread.sleep(10000);
        progPage.clickcategorybtn();
    	//throw new PendingException();
    }

    
    
    @Then("^user will click on Add a Program button$")
    public void user_will_click_on_add_a_program_button() throws Throwable {
    	Thread.sleep(10000);
    	progPage.clickaddacoursebtn();
        //throw new PendingException();
    }

    
    
    @And("^user clicks on program label$")
    public void user_clicks_on_products_label() throws Throwable {
        progPage.clickProgramlabel();
    	//throw new PendingException();
    }

    
    
    @And("^user will enter a course category$")
    public void user_will_enter_a_category() throws Throwable {
    	Thread.sleep(10000);
        progPage.enterCategory();
    	
    	//throw new PendingException();
    }

    
    
//    @And("^user clicks on program label$")
//    public void user_clicks_on_program_label() throws Throwable {
//        
//    	//throw new PendingException();
//    }

    
    
    @And("^enter details to add program$")
    public void enter_details_to_add_program() throws Throwable {
        Thread.sleep(10000);
        progPage.entercoursedetails();
    	//throw new PendingException();
    }

    
    
    @And("^save the program details$")
    public void save_the_program_details() throws Throwable {
        progPage.save_prog_details();
    	//throw new PendingException();
    }

	
	
}
