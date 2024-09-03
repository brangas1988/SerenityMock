package org.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.ManagedPages;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.pages.Pages;
import org.pages.loginpage;

public class uistepdef {


    @ManagedPages
    Pages pages;

    @Steps
    loginpage login;

    @Given("Open discover page")
    public void open_discover_page() throws InterruptedException {
        //login.openUrl("https://www.discover.com");
        loginpage loginPage = pages.getPage(loginpage.class);
        loginPage.openpage();

    }
    @When("click login and provide credentials {string} {string}")
    public void click_login_and_provide_credentials(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("TEST");
    }
    @Then("verify the invalid credentials page")
    public void verify_the_invalid_credentials_page() {
        System.out.println("TEST");
    }
}
