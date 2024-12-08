package com.bdd.pages.saucedemo;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id="user-name")
    private WebElement usernameInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(name="login-button")
    private WebElement loginButton;

    @FindBy(tagName="h3")
    private WebElement error;

    @FindBy(xpath = "//div[@id='header_container']//span[.='Products']")
    private WebElement headerProductsPage;

    /**
     *
     * @param username valid username
     * @param password  valid password
     */
    public void login(String username, String password){

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();
    }

    public void enterUsername(String username){

        usernameInput.sendKeys(username);
    }

    public void clickLoginButton(){

        loginButton.click();
    }

    public void confirmErrorMessage(String errorMessage){

        Assert.assertEquals(errorMessage, error.getText());
    }
}
