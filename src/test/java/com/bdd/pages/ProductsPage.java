package com.bdd.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{

    @FindBy(xpath = "//div[@id='header_container']//span[.='Products']")
    private WebElement header;

    @FindBy(id="react-burger-menu-btn")
    private WebElement hamburgerMenu;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void confirmProductsHeader(){
        Assert.assertEquals("Products page header does not match","Products",header.getText());
    }

    public void clickMenu(){
        hamburgerMenu.click();
    }

    public void clickLogoutLink(){
        logoutLink.click();
    }

    public void confirmLoginButtonVisibility(){
        Assert.assertTrue("Login button is not visible",loginButton.isDisplayed());
    }
}
