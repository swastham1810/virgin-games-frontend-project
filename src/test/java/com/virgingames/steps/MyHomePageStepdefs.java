package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyHomePageStepdefs {
    @Given("User is on HomePage")
    public void userIsOnHomePage() {
        System.out.println("User is on Homepage");
    }

    @When("User click on accept all cookies")
    public void userClickOnAcceptAllCookies() {
        new HomePage().clickOnAcceptCookies();
    }

    @Then("User Verify the welcome message {string}")
    public void userVerifyTheWelcomeMessage(String message) {
        Assert.assertEquals(new HomePage().verifyWelcomeTextOnHomePage(), message,
                "Incorrect message displayed!");
    }

    @When("User click on Casino tab on homepage")
    public void userClickOnCasinoTabOnHomepage() {
        new HomePage().clickOnCasinoTab();
    }

    @Then("User verify the text {string}")
    public void userVerifyTheText(String message) {
        Assert.assertEquals(new HomePage().verifyPopularOnlineCasinoGamesText(), message,
                "Incorrect message displayed!");
    }

}
