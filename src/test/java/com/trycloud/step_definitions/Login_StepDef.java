package com.trycloud.step_definitions;

import com.trycloud.pages.Login_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDef {

    Login_Page page = new Login_Page();


    @Given("user on the login page")
    public void user_on_the_login_page() {
       Driver.getDriver().get(ConfigReader.getProperty("env"));

    }
    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username, String password) {

        page.login(username, password);
    }

    @When("user click the login button")
    public void user_click_the_login_button() {
        page.loginButton.click();
    }

    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {


        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));
    }

}


