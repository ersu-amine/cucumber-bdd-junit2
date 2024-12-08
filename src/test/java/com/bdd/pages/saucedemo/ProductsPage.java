package com.bdd.pages.saucedemo;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//div[@id='header_container']//span[.='Products']")
    private WebElement pageHeader;

    @FindBy(css="div.inventory_item_label>a>div")
    private List<WebElement> productList;


//    @FindBy(id = "login-button")
//    private WebElement loginButton;

    public void confirmProductsHeader(){
        Assert.assertEquals("Products page header does not match","Products",pageHeader.getText());
    }


}
