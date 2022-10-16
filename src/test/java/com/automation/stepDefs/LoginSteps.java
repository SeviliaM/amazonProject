package com.automation.stepDefs;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("Open browser")
    public void open_browser() {


    }



    @When("User enter email address")
    public void user_enter_address() {
        loginPage.chooseSignIn();
        loginPage.doLogin();
    }

    @When("User enter password")
    public void user_enter() {
    }

    @Given("Verify user is on sign in page")
    public void verify_user_is_on_sign_in_page() {
    }


    @When("User clicks on continue")
    public void user_clicks_on_continue() {
        System.out.println();
    }

    @When("User enter phone number and password")
    public void user_enter(String phoneNumber, String password) {
        System.out.println(phoneNumber);
        System.out.println(password);
    }

    @When("User is able to click login button")
    public void user_is_able_to_click_login_button() {
        System.out.println();
    }

    @Then("User is able successfully login to account")
    public void user_is_able_successfully_login_to_account() {
        System.out.println();
    }


}

