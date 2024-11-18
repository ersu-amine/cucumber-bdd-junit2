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

        LOG.info("Login page navigation Before method");
    }
    @When("user enters {string} and {string}")
    public void user_enters_and(String username, String password) {

        login(username,password);
    }
    @Then("user should land on the {string} page")
    public void user_should_land_on_the_page(String pageName) {

    }
}
