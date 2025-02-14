package com.bdd.pages;

import com.bdd.utilities.BrowserUtilities;
import com.bdd.utilities.Driver;
import com.bdd.utilities.Products;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

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

    @FindBy(css = "div.inventory_item_description>div.pricebar>div")
    private List<WebElement> priceList;

    //all images from products page, src attribute contains the image link
    @FindBy(css = "div.inventory_item_img>a>img")
    private List<WebElement> imageList;

    //item image on item page, alt attribute contains the item title
    @FindBy(xpath = "//div[@id='inventory_item_container']//img")
    private WebElement imageOnItemPage;

    //sorting
    @FindBy(css = "select.product_sort_container")
    private WebElement sortDropdown;

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
    public static Map<String, String> getItemMap(String item) {
        //create map to store item information
        Map<String, String> itemMap = new HashMap<>();
        //find item in all items map and put info to new map
        if (allItemsMap.containsKey(item)) {
            List<String> itemInfo = allItemsMap.get(item);
            itemMap.put("title", item);
            itemMap.put("description", itemInfo.get(0));
            itemMap.put("price", itemInfo.get(1));
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

    public Map<String, WebElement> getElementsProductsPage(String productTitle){
        Map<String, WebElement> map = new HashMap<>();

        Integer index = Products.productWebIndex.get(productTitle);

        //TODO
        WebElement image = Driver.getDriver().findElement(By.xpath("(//div[@class='inventory_item'])[" + index + "]/div/a/img"));

        WebElement productName = Driver.getDriver().findElement(By.xpath("(//div[@class='inventory_item'])[" + index + "]//div[@class='inventory_item_name ']"));

        WebElement description = Driver.getDriver().findElement(By.xpath("(//div[@class='inventory_item'])[" + index + "]//div[@class='inventory_item_desc']"));

        WebElement price = Driver.getDriver().findElement(By.xpath("(//div[@class='inventory_item'])[" + index + "]//div[@class='pricebar']/div"));

        map.put("image", image);
        map.put("title", productName);
        map.put("description", description);
        map.put("price", price);
        return map;
    }

    public void selectFilter(String sortBy){
        Select dropdown = new Select(sortDropdown);
        dropdown.selectByVisibleText(sortBy);

        Assert.assertEquals(sortBy,dropdown.getFirstSelectedOption().getText());

    }

    /**
     *
     * @return actual titles of products from the page
     */
    public List<String> getProductTitles(){

        return BrowserUtilities.getWebElementsText(productList);
    }

    /**
     * get prices of web elements from UI
     * @return list of prices in dollar sign and value format
     */
    public List<String> getProductPrices(){

        return BrowserUtilities.getWebElementsText(priceList);
    }

    /**
     * sorts prices of the expected price list
     * @param sortAs 'ascending' order or 'descending' order
     * @return list of price as the original form with dollar sign
     */
    public List<String> sortPrices(String sortAs){
        List<String> expectedPrices = Products.getAllPrices();
        List<Double> priceValue = new ArrayList<>();

        for (String expectedPrice : expectedPrices) {
            priceValue.add(Double.parseDouble(expectedPrice.substring(1)));
        }

        if(sortAs.equals("ascending")){
            Collections.sort(priceValue);
        }else if (sortAs.equals("descending")){
            priceValue.sort(Collections.reverseOrder());
        }else {
            System.out.println("Price cannot be sorted, enter in proper format 'ascending' or 'descending'");
        }

        expectedPrices.clear(); //remove all of the items

        for (Double i : priceValue) {
            //add dollar sign to each price
            expectedPrices.add("$"+ i);
        }

        return expectedPrices;
    }
}
