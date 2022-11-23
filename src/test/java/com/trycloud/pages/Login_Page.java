package com.trycloud.pages;

import com.trycloud.utilities.ConfigReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

    public Login_Page(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(name="user")
    public WebElement usernameInput;

    @FindBy(name = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    public void login(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginButton.click();

        //THIS METHOD IS MINE
    }


    public void login() {
        Driver.getDriver().get(ConfigReader.getProperty("env"));
        login(ConfigReader.getProperty("username"), ConfigReader.getProperty("password"));
        loginButton.click();

        //YOU USE THIS METHOD, YOU DO NOT HAVE TO GO TO URL, EVERYTHING IS INSIDE THIS METHOD.
    }
}




