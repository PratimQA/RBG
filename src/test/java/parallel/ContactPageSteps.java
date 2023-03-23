package parallel;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.ContactsPage;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactPageSteps {

	
	private WebDriver driver;
	private static String contacts_title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private DashboardPage dashPage;
	public ContactsPage contactpage = new ContactsPage(DriverFactory.getDriver());
	
//	@Given("user into RBG and will use contacts feature")
//	public void user_into_rbg_and_will_use_contacts_feature(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    // For automatic transformation, change DataTable to one of
//	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
//	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
//	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
//	    //
//	    // For other transformations you can register a DataTableType.
//		List<Map<String, String>> credList = dataTable.asMaps();
//		
//		String userName = credList.get(0).get("username");
//		String password = credList.get(0).get("password");
//		
//		DriverFactory.getDriver().get("https://www.redbeltgym.com");
//		dashPage = loginPage.doLogin(userName, password);
//		
//	    contactpage = dashPage.contactpage();
//		
//	    throw new io.cucumber.java.PendingException();
//	}


	@Given("user into RBG and will use contacts feature")
	public void user_into_RBG_and_will_use_contacts_feature(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		List<Map<String, String>> credList = dataTable.asMaps();
		
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		
		DriverFactory.getDriver().get("https://dev.redbeltgym.com");
		
		dashPage = loginPage.doLogin(userName, password);
		
	    contactpage = dashPage.contactpage();
		
	   // throw new io.cucumber.java.PendingException();
		
	}


	

	@When("user clicks on the contact menu")
	public void user_clicks_on_the_contact_menu() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		contactpage.open_contact();
		
	    //throw new io.cucumber.java.PendingException();
	}
	
	
	
	@Then("contact page title should be {string}")
	public void contact_page_title_should_be(String expectedTitle) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		//contactpage.checkcontactpagetitle();
		contacts_title = contactpage.checkcontactpagetitle();
		Assert.assertTrue(contacts_title.contains(expectedTitle));
	    
		//throw new io.cucumber.java.PendingException();
	}
	
	
	
	@When("user clicks on a contact having no number")
	public void user_clicks_on_a_contact_having_no_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
	    contactpage.clickContact_noNum();
		//throw new io.cucumber.java.PendingException();
	}

    
	
	@When("user clicks on a contact having a number")
	public void user_clicks_on_a_contact_having_a_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(10000);
	    contactpage.clickContact_withNum();
		//  throw new io.cucumber.java.PendingException();
	}
	
	

	@When("contact modal opens and user clicks on inbox tab")
	public void contact_modal_opens_and_user_clicks_on_inbox_tab() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
	    contactpage.openInbox();
		//throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("SMS button should be disabled")
	public void sms_button_should_be_disabled() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		contactpage.checkSMSdisabled();
		//throw new io.cucumber.java.PendingException();
	}
	
	
	@Then("SMS button should be enabled")
	public void sms_button_should_be_enabled() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		contactpage.checkSMSdisabled();
       //throw new io.cucumber.java.PendingException();
	}
	
	
	
	@Then("user clicks on SMS button")
	public void user_clicks_on_SMS_button() throws InterruptedException
	{
		Thread.sleep(4000);
		contactpage.clickSMS();
	}
	
	
	@And("writes and sends SMS")
	public void writes_and_sends_SMS() throws InterruptedException 
	{
		Thread.sleep(4000);
		contactpage.sendSMS();
	}
	
	
}