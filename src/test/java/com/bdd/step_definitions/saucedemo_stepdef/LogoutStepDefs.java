package com.bdd.step_definitions.saucedemo_stepdef;

import com.bdd.pages.saucedemo.ProductsPage;
import com.bdd.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogoutStepDefs extends ProductsPage {
    Logger LOG = LogManager.getLogger();
    @When("user clicks on the hamburger menu")
    public void user_clicks_on_the_hamburger_menu() {
        clickMenu();
        LOG.info("Hamburger menu is clicked");
    }

    @When("user clicks Logout link")
    public void user_clicks_logout_link() {
        clickLogoutLink();
        LOG.info("Logout option is clicked");
    }

    @Then("user should land on the login page")
    public void user_should_land_on_the_login_page() {
        confirmLoginButtonVisibility();
        LOG.info("User is on the login page");
    }

    @And("user navigates back")
    public void userNavigatesBack() {

        Driver.getDriver().navigate().back();
    }
}
