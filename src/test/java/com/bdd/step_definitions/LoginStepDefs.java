package com.bdd.step_definitions;

import com.bdd.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginStepDefs extends LoginPage {
    Logger LOG = LogManager.getLogger();
    @Given("user is on the login page")
    public void user_is_on_the_login_page() {

        LOG.info("Navigation to login page is in setupMethod");
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {

        login(username,password);
    }

    @Then("user should see error message {string}")
    public void userShouldSeeErrorMessage(String errorMessage) {

        confirmErrorMessage(errorMessage);
        LOG.info("Error message validation PASSED {}",errorMessage);
    }

    @When("user enters {string}")
    public void user_enters(String username) {

        enterUsername(username);
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {

        clickLoginButton();
        LOG.info("Login Button has been clicked");
    }
}
