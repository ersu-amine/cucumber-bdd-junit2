package com.bdd.pages.saucedemo;

import com.bdd.utilities.BrowserUtilities;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsPage extends BasePage {

    //named based on item numbers from UI html source
    private final String[] ITEM0 = {"Sauce Labs Bike Light",
            "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.",
            "$9.99"};
    private final String[] ITEM1 = {"Sauce Labs Bolt T-Shirt",
            "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.",
            "$15.99"};
    private final String[] ITEM2 = {"Sauce Labs Onesie",
            "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
            "$7.99"};
    private final String[] ITEM3 = {"Test.allTheThings() T-Shirt (Red)",
            "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.",
            "$15.99"};
    private final String[] ITEM4 = {"Sauce Labs Backpack",
            "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
            "$29.99"};

    private final String[] ITEM5 = {"Sauce Labs Fleece Jacket",
            "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.",
            "$49.99"};

    private final String[][] ALLITEMS = {ITEM1, ITEM2, ITEM3, ITEM4, ITEM5, ITEM0};

    private Map<String, List<String>> allItemInfo = getItemsMap();

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

    public void confirmProductsHeader() {
        Assert.assertEquals("Products page header does not match", "Products", pageHeader.getText());
    }

    private Map<String, List<String>> getItemsMap() {
        Map<String, List<String>> itemsMap = putIntoList(ALLITEMS);
        return itemsMap;
    }

    //public Map<String, List<String>> getItemsInfo(String itemTitle){
    public List<String> getItemsInfo(String itemTitle) {
        //[0] contains description, [1] contains price
        return allItemInfo.get(itemTitle);
    }

    /**
     * @param items String array of String arrays , each array containing title, description and price of a product
     * @return map of information of product, title as key and list of description and price as value
     */
    private Map<String, List<String>> putIntoList(String[][] items) {
        //create map to store all the lists
        Map<String, List<String>> itemsMap = new HashMap<>();
        //iterate over the 2D array adding each array item components to list
        for (String[] item : items) {
            List<String> list = new ArrayList<>();
            list.add(item[1]);
            list.add(item[2]);
            itemsMap.put(item[0], list);
        }
        return itemsMap;
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
