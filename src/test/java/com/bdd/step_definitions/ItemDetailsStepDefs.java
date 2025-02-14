package com.bdd.step_definitions;

import com.bdd.pages.ItemPage;
import com.bdd.pages.ProductsPage;
import io.cucumber.java.en.Then;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.Map;

public class ItemDetailsStepDefs extends ItemPage {
    Logger LOG = LogManager.getLogger();
    //TODO complete logs

    @Then("user should see title {string}, description and price on item page")
    public void userShouldSeeTitleDescriptionAndPriceOnItemPage(String itemTitle) {
        Map<String, String> itemMap = ProductsPage.getItemMap(itemTitle);

        Map<String, WebElement> elements = getElementsFromItemPage();

        Assert.assertEquals(itemMap.get("title"),elements.get("title").getText());
        LOG.info("Title is as EXPECTED");

        Assert.assertEquals(itemMap.get("description"),elements.get("description").getText());
        LOG.info("Description is as EXPECTED");

        Assert.assertEquals(itemMap.get("price"),elements.get("price").getText());
        LOG.info("Price is as EXPECTED");


    }

    @Then("user should see matching {string} and {string} on item page")
    public void user_should_see_matching_and_on_item_page(String itemTitle, String imageSrc) {
        WebElement imageElement = getImageElement(itemTitle);
        Assert.assertEquals(imageSrc, imageElement.getAttribute("src"));
    }
}
