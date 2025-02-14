package com.bdd.pages;

import com.bdd.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.Map;

public class ItemPage extends BasePage {


    /**
     * Only 1 element on the item page
     * @return map of web elements, containing title, description, and price
     */
    public Map<String, WebElement> getElementsFromItemPage( ) {
        Map<String, WebElement> map = new HashMap<>();

        WebElement productName = Driver.getDriver().findElement(By.cssSelector("div.inventory_details_name.large_size"));

        WebElement description = Driver.getDriver().findElement(By.cssSelector("div.inventory_details_desc.large_size"));

        WebElement price = Driver.getDriver().findElement(By.cssSelector("div.inventory_details_price"));

        map.put("title", productName);
        map.put("description", description);
        map.put("price", price);

        return map;
    }


}
