package com.automation.stepDefs;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("Open browser")
    public void open_browser() {
        loginPage.doLogin();
    }

    @Given("User clicks on  Hello sign in button")
    public void user_clicks_on_hello_sign_in_button() {
    }

    @Given("User clicks on {string} sign in button")
    public void user_clicks_on_sign_in_button(String string) {
    }

    @When("User enter {string} address")
    public void user_enter_address(String string) {
    }

    @Given("Verify user is on sign in page")
    public void verify_user_is_on_sign_in_page() {
    }

    @When("User enter {string}")
    public void user_enter(String string) {

    }
    @When("User enter email{string} address")
    public void user_enter_address(String email, String password) {
        System.out.println(email);
        System.out.println(password);
    }

    @When("User clicks on continue")
    public void user_clicks_on_continue() {
        System.out.println();
    }

    @When("User enter phoneNumber{string}and password{string}")
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

