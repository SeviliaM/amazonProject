package com.automation.stepDefs;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();


    @Given("User enter email address")
    public void user_enter_address() {
        loginPage.chooseSignIn();
        loginPage.doLogin();
    }

    @When("User enter password")
    public void user_enter() {
    }

    @Then("Verify user is on sign in page")
    public void verify_user_is_on_sign_in_page() {
    }

}