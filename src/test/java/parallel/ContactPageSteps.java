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
		//String expectedTitle = "Red Belt Gym - Contacts";
		//Assert.assertTrue(contacts_title.contains(expectedTitle));
	    Assert.assertEquals(expectedTitle, contacts_title);
		//throw new io.cucumber.java.PendingException();
	}
	
	
	
	@Then("contact page title should not be {string}")
	public void contact_page_title_should_not_be(String unexpectedTitle) throws InterruptedException 
	{
		contacts_title = contactpage.checkcontactpagetitle();
		Assert.assertEquals(unexpectedTitle, contacts_title);
	}
	
	
	
	@When("user clicks on a contact having no number")
	public void user_clicks_on_a_contact_having_no_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(10000);
	    contactpage.clickContact_noNum();
		//throw new io.cucumber.java.PendingException();
	}

	
	
	@Then("close this contact")
	public void close_this_contact()  throws InterruptedException
	{
	    Thread.sleep(1000);
		contactpage.closecontact();	
	}
	
    
	
	@When("user clicks on a contact having a number")
	public void user_clicks_on_a_contact_having_a_number() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    Thread.sleep(10000);
	    contactpage.clickContact_withNum();
		//  throw new io.cucumber.java.PendingException();
	}
	
	
	
	@When("user clicks on a contact having no email")
	public void user_clicks_on_a_contact_having_no_email() throws InterruptedException
	{
		Thread.sleep(10000);
		contactpage.clickContact_noEmail();
	}
	
	
	
	@When("user clicks on a contact having an email")
	public void user_clicks_on_a_contact_having_an_email() throws InterruptedException
	{
		Thread.sleep(10000);
		contactpage.clickContact_withEmail();
		
	}
	

	
	@And("contact modal opens and user clicks on inbox tab")
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
	
	
	
	@And("user clicks on Email button")
	public void user_clicks_on_Email_button() throws InterruptedException
	{
		Thread.sleep(4000);
		contactpage.clickEmail();
	}
	
	
	
	@Then("email disabled or enabled message should show")
	public void email_disabled_or_enabled_message_should_show() throws InterruptedException
	{
		Thread.sleep(4000);
		contactpage.checkEmaildisabled();
	}
	
	
	
	@And("user should be able to send Email")
	public void user_should_be_able_to_send_Email() throws InterruptedException
	{
		Thread.sleep(3000);
		contactpage.sendEmail();
	}
	
	
	
	@Then("user clicks on SMS button")
	public void user_clicks_on_SMS_button() throws InterruptedException
	{
		Thread.sleep(4000);
		contactpage.clickSMS();
	}
	
	
	
	@And("user selects a SMS template")
	public void user_selects_a_SMS_template() throws InterruptedException
	{
		Thread.sleep(3000);
		contactpage.sel_SMSTemplates();
	}
	
	
	
	@And("user should be able to send SMS")
	public void user_should_be_able_to_send_SMS() throws InterruptedException 
	{
		Thread.sleep(4000);
		contactpage.sendSMS();
	}
	
	
	
	@And("checks in communication log")
	public void checks_in_communication_log_the_latest_communication() throws InterruptedException
	{
	  	contactpage.visit_comm_log();
	}
	
	
	
	@And("user clicks on contacts again")
	public void user_clicks_on_contacts_again() 
	{
		contactpage.openContactAgain();
	}
	
	
	
	@And("selects multiple users")
	public void selects_multiple_users() throws InterruptedException
	{
		Thread.sleep(5000);
		contactpage.selectMultipleUsers();
	}
	
	
	@And("selects Bulk SMS option")
	public void selects_Bulk_SMS_option() throws InterruptedException
	{
		Thread.sleep(4000);
		contactpage.selectBulkSMS();
	}
	
	
	
	@And("Bulk SMS modal opens")
	public void Bulk_SMS_modal_opens() throws InterruptedException
	{
		Thread.sleep(5000);
		contactpage.BulkSMSverify();
	}
	
	
	@And("user sends Bulk sms")
	public void user_sends_Bulk_sms() throws InterruptedException
	{
		Thread.sleep(10000);
		contactpage.SendBulkSMS();
	}
	
	
	@Then("Bulk SMS should be sent and reflecting in communication log")
	public void Bulk_SMS_should_be_sent_and_reflecting_in_communication_log()
	{
		contactpage.closeBulkmodal();
	}
	
	
	@And("selects Bulk Email option") 
    public void selects_Bulk_Email_option() throws InterruptedException
    {
		Thread.sleep(4000);
		contactpage.selectBulkEMail();
    }
	
	
	@When("Bulk Email modal opens")
	public void Bulk_Email_modal_opens() throws InterruptedException
	{
		Thread.sleep(10000);
		contactpage.BulkEmailverify();
	}
	
	
	
	@And("user sends Bulk Email")
	public void user_sends_Bulk_Email() throws InterruptedException
	{
		Thread.sleep(10000);
		contactpage.SendBulkEMail();
	}
	
	
	
	@Then("Bulk Email should be sent and reflecting in communication log")
	public void Bulk_Email_should_be_sent_and_reflecting_in_communication_log() 
	{
		contactpage.closeBulkmodal();
	}
	
	
}