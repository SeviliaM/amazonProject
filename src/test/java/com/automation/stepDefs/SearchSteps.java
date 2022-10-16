package com.automation.stepDefs;

import com.automation.pages.LoginPage;
import com.automation.pages.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
    SearchPage searchPage = new SearchPage();


    @Given("Open the browser")
    public void open_the_browser() {
    }


    @When("User clicks on search field")
    public void user_clicks_on_search_field() {
    }

    @And("User enters input")
    public void user_enters_input() {
        searchPage.verifyUserCanSearchItems();
    }

    @And("User clicks on search button")
    public void user_clicks_on_search_button() {
    }

    @Then("Verify search result is displayed")
    public void verify_search_result_is_displayed() {
    }


}
