package com.bdd.pages;

import com.bdd.utilities.BrowserUtilities;
import com.bdd.utilities.Products;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsPage extends BasePage {
    private static Map<String, List<String>> allItemsMap = Products.getAllItemsMap();

    @FindBy(xpath = "//div[.='Sauce Labs Bike Light']")
    private WebElement item0Element;

    @FindBy(xpath = "//div[.='Sauce Labs Bolt T-Shirt']")
    private WebElement item1Element;

    @FindBy(xpath = "//div[.='Sauce Labs Onesie']")
    private WebElement item2Element;

    @FindBy(xpath = "//div[.='Test.allTheThings() T-Shirt (Red)']")
    private WebElement item3Element;

    @FindBy(xpath = "//div[.='Sauce Labs Backpack']")
    private WebElement item4Element;

    @FindBy(xpath = "//div[.='Sauce Labs Fleece Jacket']")
    private WebElement item5Element;

    @FindBy(xpath = "//div[@id='header_container']//span[.='Products']")
    private WebElement pageHeader;

    @FindBy(css = "div.inventory_item_label>a>div")
    private List<WebElement> productList;

    //all images from products page, src attribute contains the image link
    @FindBy(css = "div.inventory_item_img>a>img")
    private List<WebElement> imageList;

    //item image on item page, alt attribute contains the item title
    @FindBy(xpath = "//div[@id='inventory_item_container']//img")
    private WebElement imageOnItemPage;

    public void confirmProductsHeader() {
        Assert.assertEquals("Products page header does not match", "Products", pageHeader.getText());
    }

    /**
     * Look into map of all product information and return given items description and price
     * @param itemTitle product title
     * @return list of string containing description and price
     */
    public List<String> getItemsInfo(String itemTitle) {
        //[0] contains description, [1] contains price
        return allItemsMap.get(itemTitle);
    }

    /**
     * Map of string containing product info in key value format
     * @param item product title
     * @return map containing item,description, price
     */
    private static Map<String, String> getItemMap(String item) {
        //create map to store item information
        Map<String, String> itemMap = new HashMap<>();
        //find item in all items map and put info to new map
        if (allItemsMap.containsKey(item)) {
            List<String> itemInfo = allItemsMap.get(item);
            //TODO title -> item, there's only index 0,1
            itemMap.put("title", itemInfo.get(0));
            itemMap.put("description", itemInfo.get(1));
            itemMap.put("price", itemInfo.get(2));
        }
        return itemMap;
    }

    public void confirmTitles(List<String> expectedTitles) {
        List<String> actualTitles = BrowserUtilities.getWebElementsText(productList);

        Assert.assertEquals(expectedTitles, actualTitles);
    }

    public void clickOnItem(String itemTitle) {
        switch (itemTitle) {
            case "Sauce Labs Bike Light":
                item0Element.click();
                break;
            case "Sauce Labs Bolt T-Shirt":
                item1Element.click();
                break;
            case "Sauce Labs Onesie":
                item2Element.click();
                break;
            case "Test.allTheThings() T-Shirt (Red)":
                item3Element.click();
                break;
            case "Sauce Labs Backpack":
                item4Element.click();
                break;
            case "Sauce Labs Fleece Jacket":
                item5Element.click();
                break;
            default:
                System.out.println("Item does not exist");
        }
    }
}
