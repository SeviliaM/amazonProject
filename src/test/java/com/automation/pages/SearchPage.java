package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchField;
    @FindBy(id = "nav-search-submit-button")
    WebElement submitButton;

 public void verifyUserIsOnHomepage(){

     Assert.assertTrue("Search field is not visible", searchField.isDisplayed());
    }

    public void verifyUserCanSearchItems() {
        searchField.sendKeys(("Iphone x")+ Keys.ENTER);
//submitButton.click();
    }
}
/*Then Verify user is on home page

  Scenario:
    When User clicks on search field
    And User enters input
    And User clicks on search button
    Then Verify search result is displayed
*/