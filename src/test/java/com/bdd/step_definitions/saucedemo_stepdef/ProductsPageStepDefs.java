package com.bdd.step_definitions.saucedemo_stepdef;

import com.bdd.pages.saucedemo.ProductsPage;
import io.cucumber.java.en.Then;

public class ProductsPageStepDefs extends ProductsPage {
    @Then("user should land on the products page")
    public void user_should_land_on_the_products_page(){
        confirmProductsHeader();
    }
}
