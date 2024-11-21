package com.bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//div[@id='header_container']//span[.='Products']")
    private WebElement header;

    public void confirmProductsHeader(){
        Assert.assertEquals("Products",header.getText());
    }
}
