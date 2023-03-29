package parallel;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.pages.DashboardPage;
import com.pages.GymDetailsPage;
import com.pages.LoginPage;
import com.pages.ProductPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductPageSteps {

	private WebDriver driver;
	private static String prod_title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashPage;
	private ProductPage prodPage = new ProductPage(DriverFactory.getDriver());
	
		
		
		
		@Given("^user into RBG$")
	    public void user_already_logged_in(DataTable dataTable) throws InterruptedException {
			
	        List<Map<String, String>> credList = dataTable.asMaps();
			
			String userName = credList.get(0).get("username");
			String password = credList.get(0).get("password");
			
			DriverFactory.getDriver().get("https://www.redbeltgym.com");
			dashPage = loginPage.doLogin(userName, password);
			
			prodPage = dashPage.visitprod();
			
			// gymPage = dashPage()
			// throw new io.cucumber.java.PendingException();
	    }

		
		
	    @When("user clicks on the settings")
	    public void user_clicks_on_the_settings_icon() throws InterruptedException {
	        
	    	Thread.sleep(10000);
	    	prodPage.click_settings_icon();
	    	
	     	// throw new io.cucumber.java.PendingException();
	    
	    }

	    
	    
	    @And("user clicks on products label")
	    public void user_clicks_on_products_label() {
	    
	    	prodPage.clickProductslabel();
	    	
	    }
	    
	    
	    
	    @Then("^products page title should be \"([^\"]*)\"$")
	    public void products_page_title_should_be_something(String strArg1) throws Throwable {
	        prod_title = prodPage.getProdpageTitle();
	        System.out.println("product page title is:" + prod_title);
	    	//throw new PendingException();
	    }

	    
	    
	    @And("^user will enter a category$")
	    public void user_will_enter_a_category() throws Throwable {
	    	Thread.sleep(10000);
	    	prodPage.enterCategory();
	    	// throw new PendingException();
	    }
	    
	    
	    @Then("^product category will be added$")
	    public void product_category_will_be_added() throws Throwable {
	        prodPage.clickcategorybtn();
	    	//throw new PendingException();
	    }

	    
	    
	    @Then("user will click on Add a Product button")
	    public void user_will_click_on_Add_a_Product_button() throws Throwable {
	    	Thread.sleep(10000);
	    	prodPage.clickaddproduct();
	    }   
	    
	    
	    
	    @And("enter details to add product")
	    public void enter_details_to_add_product() throws InterruptedException{
	    	Thread.sleep(10000);
	    	prodPage.enterproddetails();
	    }
	    
	    
	    @And("save the product details")
	    public void  save_the_product_details() {
	    	prodPage.save_prod_details();
	    }
	    
}
