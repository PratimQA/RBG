package parallel;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AppointmentPageSteps {

	@Given("^user logged in$")
    public void user_logged_in() throws Throwable {
        //throw new PendingException();
    }

    @Given("^user is on dashboard page$")
    public void user_is_on_dashboard_page() throws Throwable {
        //throw new PendingException();
    }

    @When("^user clicks on appointment section$")
    public void user_clicks_on_appointment_section() throws Throwable {
        //throw new PendingException();
    }

    @Then("^page title should be \"([^\"]*)\"$")
    public void page_title_should_be_something(String strArg1) throws Throwable {
        //throw new PendingException();
    }

    @Then("^user will see appointment screen$")
    public void user_will_see_appointment_screen() throws Throwable {
        //throw new PendingException();
    }

    @Then("^user will enter the appointment details and click on submit$")
    public void user_will_enter_the_appointment_details_and_click_on_submit() throws Throwable {
        //throw new PendingException();
    }

    @Then("^user will click on that contact$")
    public void user_will_click_on_that_contact() throws Throwable {
        throw new PendingException();
    }

    @And("^user will click on create appointment$")
    public void user_will_click_on_create_appointment() throws Throwable {
        //throw new PendingException();
    }

    @And("^click on Month tab$")
    public void click_on_month_tab() throws Throwable {
        //throw new PendingException();
    }

    @And("^click on Week tab$")
    public void click_on_week_tab() throws Throwable {
        //throw new PendingException();
    }

    @And("^click on Day tab$")
    public void click_on_day_tab() throws Throwable {
        //throw new PendingException();
    }
	
	
}
