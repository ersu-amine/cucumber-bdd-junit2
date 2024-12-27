package com.bdd.step_definitions.saucedemo_stepdef;

import com.bdd.pages.saucedemo.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class ProductsPageStepDefs extends ProductsPage {
    List<String> actualProductTitles;
    @Then("user should land on the products page")
    public void user_should_land_on_the_products_page(){
        confirmProductsHeader();
    }

    @When("user clicks on item {string}")
    public void user_clicks_on_item(String itemTitle) {

    }

    @Then("user should see title {string}, description and price on products page and item page are matching")
    public void user_should_see_title_description_and_price_on_products_page_and_item_page_are_matching(String itemTitle) {

    }
    @Then("user should see matching {string} and {string} on item page")
    public void user_should_see_matching_and_on_item_page(String itemTitle, String itemComponent) {

    }

    @And("user should see item's title, description and price")
    public void userShouldSeeItemSTitleDescriptionAndPrice() {
        //TODO title, description and price are visible
    }
}
