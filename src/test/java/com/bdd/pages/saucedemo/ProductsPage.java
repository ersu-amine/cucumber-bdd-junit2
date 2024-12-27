package com.bdd.pages.saucedemo;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductsPage extends BasePage {

    @FindBy(xpath = "//div[@id='header_container']//span[.='Products']")
    private WebElement pageHeader;

    //title of each item
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

}
