package com.bdd.pages;

import com.bdd.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="react-burger-menu-btn")
    private WebElement hamburgerMenu;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logoutLink;

    @FindBy(name="login-button")
    private WebElement loginButton;

    public void clickMenu(){
        hamburgerMenu.click();
    }

    public void clickLogoutLink(){
        logoutLink.click();
    }

    public void confirmLoginButtonVisibility(){
        Assert.assertTrue("Login button is not visible",loginButton.isDisplayed());
    }


    //image web element has same attributes on products page and on the item page
    /**
     * get image web element depending on the item title
     * @param itemTitle
     * @return element of image
     */
    public WebElement getImageElement(String itemTitle){
        return Driver.getDriver().findElement(By.xpath("//img[@alt = '" + itemTitle +  "']"));
    }
}
