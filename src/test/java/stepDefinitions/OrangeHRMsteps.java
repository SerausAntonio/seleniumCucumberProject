package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMsteps {

    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
       System.out.println("I launche the chrome browser");
    }
    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I open orange hrm homepage");
    }
    @Then("I verify that logo present on page")
    public void i_verify_that_logo_present_on_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I verify that logo is present on page");
    }
    @Then("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I close the browser");
    }

}
