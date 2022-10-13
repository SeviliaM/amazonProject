package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'Hello, sign in]")
    WebElement helloSignIn;
    @FindBy(id = "ap_email")
    WebElement emailOrPhone;
    @FindBy(id = "continue")
    WebElement continueBtn;
    @FindBy(id = "ap_password")
    WebElement password;
    @FindBy(id = "signInSubmit")
    WebElement signIn;


    public void doLogin() {
        helloSignIn.click();
        emailOrPhone.sendKeys(ConfigReader.getProperty("email"));
        continueBtn.click();
        password.sendKeys(ConfigReader.getProperty("password"));
        signIn.click();
    }


}
