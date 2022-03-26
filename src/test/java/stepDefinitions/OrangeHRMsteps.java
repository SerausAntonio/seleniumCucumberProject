package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.remote.Browser.CHROME;

import java.net.MalformedURLException;
import java.net.URL;

public class OrangeHRMsteps {

    DesiredCapabilities cap = new DesiredCapabilities();


    RemoteWebDriver driver;



    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
      cap.setBrowserName(String.valueOf(CHROME));
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
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
