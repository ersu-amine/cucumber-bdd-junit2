package com.bdd.step_definitions.saucedemo_stepdef;

import com.bdd.pages.saucedemo.ProductsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.List;

public class ProductsPageStepDefs extends ProductsPage {
    @Then("user should land on the products page")
    public void user_should_land_on_the_products_page(){
        confirmProductsHeader();
    }

    public void user_sees_the_following_products(List<String> expectedProductTitles) {

    }
}
