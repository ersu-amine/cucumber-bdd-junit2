package com.bdd.step_definitions;

import com.bdd.pages.ProductsPage;
import com.bdd.utilities.Products;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

public class ProductsPageStepDefs extends ProductsPage {

    Logger LOG = LogManager.getLogger();

    List<String> actualProductTitles;

    List<String> actualProductInfoProductsPage;

    @Then("user should land on the products page")
    public void user_should_land_on_the_products_page(){
        confirmProductsHeader();
        LOG.info("Page header has been confirmed");
    }

    @Then("user sees the following products")
    public void user_sees_the_following_products(List<String> expectedProductTitles) {
        confirmTitles(expectedProductTitles);
        LOG.info("Product titles are as EXPECTED");
    }

    @When("user clicks on item {string}")
    public void user_clicks_on_item(String itemTitle) {

        clickOnItem(itemTitle);
    }

    @And("user should see title {string}, description and price on products page")
    public void userShouldSeeTitleDescriptionAndPriceOnProductsPage(String title) {
        Map<String, WebElement> elements = getElementsProductsPage(title);

        Map<String, String> itemMap = getItemMap(title);

        Assert.assertEquals(itemMap.get("title"),elements.get("title").getText());
        LOG.info("Title is as EXPECTED");


        Assert.assertEquals(itemMap.get("description"),elements.get("description").getText());
        LOG.info("Description is as EXPECTED");

        Assert.assertEquals(itemMap.get("price"),elements.get("price").getText());
        LOG.info("Price is as EXPECTED");
    }


    @And("user should see matching {string} and {string} on product page")
    public void userShouldSeeMatchingAndOnProductPage(String itemTitle, String imageSrc) {
        WebElement imageElement = getImageElement(itemTitle);
        Assert.assertEquals(imageSrc, imageElement.getAttribute("src"));
    }
}
