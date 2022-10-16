package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "nav-link-accountList")
    WebElement cartButton;

    @FindBy(id = "ap_email")
    WebElement emailOrPhone;
    @FindBy(id = "continue")
    WebElement continueBtn;
    @FindBy(id = "ap_password")
    WebElement password;
    @FindBy(id = "signInSubmit")
    WebElement signIn;

    public void verifyUserIsOnHomepage() {

        Assert.assertTrue("Search field is not visible", cartButton.isDisplayed());
    }

    public void chooseSignIn() {

        cartButton.click();

   /* Actions actions = new Actions(driver);
    actions.moveToElement(cartButton);
    actions.build().perform();

    actions.moveToElement(helloSignIn);
    actions.click().build().perform();*/

    }

    public void doLogin() {

     emailOrPhone.sendKeys(ConfigReader.getProperty("email"));
        continueBtn.click();
        password.sendKeys(ConfigReader.getProperty("password"));
        signIn.click();



    }
}