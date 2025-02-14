package com.bdd.step_definitions;

import com.bdd.pages.ProductsPage;
import com.bdd.utilities.BrowserUtilities;
import com.bdd.utilities.Products;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class SortStepDefs extends ProductsPage {
    @And("user selects {string}")
    public void user_selects(String sortBy){
        selectFilter(sortBy);
    }

    @Then("user should see prices of products in descending order")
    public void user_should_see_prices_of_products_in_descending_order() {
        List<String> expectedPrices = Products.getAllPrices();
        //TODO sort prices by making them numbers

        List<String> productPrices = getProductPrices();

        Assert.assertEquals(expectedPrices,productPrices);

    }

    @Then("user should see prices of products in ascending order")
    public void user_should_see_prices_of_products_in_ascending_order() {
        List<String> expectedPrices = Products.getAllPrices();
        //TODO sort prices by making them numbers

        List<String> productPrices = getProductPrices();

        Assert.assertEquals(expectedPrices,productPrices);

    }

    @Then("user should see product names of products in alphabetical ascending order")
    public void user_should_see_product_names_of_products_in_alphabetical_ascending_order() {
        List<String> expectedTitles = Products.getTitles();
        Collections.sort(expectedTitles); //sort in alphabetical order
        List<String> productTitles = getProductTitles(); //keep the order from web

        Assert.assertEquals(expectedTitles,productTitles);

    }

    @Then("user should see product names of products in alphabetical descending order")
    public void user_should_see_product_names_of_products_in_alphabetical_descending_order() {

        List<String> expectedTitles = Products.getTitles();
        expectedTitles.sort(Collections.reverseOrder()); //sort in alphabetical descending order
        List<String> productTitles = getProductTitles(); //keep the order from web

        Assert.assertEquals(expectedTitles,productTitles);
    }



}
