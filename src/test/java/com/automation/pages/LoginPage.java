package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'Hello, sign in]")
    WebElement signIn;
    @FindBy(id = "ap_email")
    WebElement emailOrPhone;
    @FindBy(id = "continue")
    WebElement continueBtn;
    @FindBy(id = "ap_password")
    WebElement password;

    public void doLogin() {


    }
}
