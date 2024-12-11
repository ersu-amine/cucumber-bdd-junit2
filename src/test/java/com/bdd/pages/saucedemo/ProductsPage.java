package com.bdd.pages.saucedemo;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsPage extends BasePage{
    private final Map<String,String> items = new HashMap<>();

    //named based on item numbers from UI html source
    private final String [] ITEM0 = {"Sauce Labs Bike Light",
            "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.",
            "$9.99"};
    private final String [] ITEM1 = {"Sauce Labs Bolt T-Shirt",
            "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.",
            "$15.99"};
    private final String [] ITEM2 = {"Sauce Labs Onesie ",
            "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
            "$7.99"};
    private final String [] ITEM3= {"Test.allTheThings() T-Shirt (Red)",
            "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.",
            "$15.99"};
    private final String [] ITEM4 = {"Sauce Labs Backpack",
            "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
            "$29.99"};

    private final String [] ITEM5 = {"Sauce Labs Fleece Jacket ",
            "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.",
            "$49.99"};

    private final String [][] ALLITEMS = {ITEM1,ITEM2,ITEM3,ITEM4,ITEM5,ITEM0};

    @FindBy(xpath = "//div[@id='header_container']//span[.='Products']")
    private WebElement pageHeader;

    @FindBy(css="div.inventory_item_label>a>div")
    private List<WebElement> productList;

    //all images from products page, src attribute contains the image link
    @FindBy(css="div.inventory_item_img>a>img")
    private List<WebElement> imageList;

    //alt attribute contains the item title
    @FindBy(xpath = "//div[@id='inventory_item_container']//img")
    private WebElement imageOnItemPage;

    public void confirmProductsHeader(){
        Assert.assertEquals("Products page header does not match","Products",pageHeader.getText());
    }

    private Map<String,List<String>> getItemsMap(){
        Map<String, List<String>> itemsMap = putIntoList(ALLITEMS);
        return itemsMap;
    }

    /**
     *
     * @param items String array of String arrays , each array containing title, description and price of a product
     * @return map of information of product, title as key and list of description and price as value
     */
    private Map<String,List<String>> putIntoList(String[][] items){
        //create map to store all the lists
        Map<String,List<String>> itemsMap = new HashMap<>();
        //iterate over the 2D array adding each array item components to list
        for (String[] item : items) {
            List<String> list = new ArrayList<>();
            list.add(item[1]);
            list.add(item[2]);
            itemsMap.put(item[0],list);
        }
        return itemsMap;
    }
}
