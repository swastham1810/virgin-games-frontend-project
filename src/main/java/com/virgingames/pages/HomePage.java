package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
    @FindBy(css = "label[for='privacy_pref_optin']")
    WebElement acceptCookies;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome to Virgin Games']")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(linkText = "Casino")
    WebElement casino;
    @CacheLookup
    @FindBy(css = "body > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > section:nth-child(6) > h2:nth-child(1)")
    WebElement popularOnlineCasinoGamesText;


    public void clickOnAcceptCookies() {
        clickOnElement(acceptCookies);
        log.info("Click on accept all cookies: " + acceptCookies.toString());
    }

    public String verifyWelcomeTextOnHomePage() {
        log.info("Verify Welcome message on homepage: " + welcomeText.toString());
        return getTextFromElement(welcomeText);
    }

    public void clickOnCasinoTab() {
        clickOnElement(casino);
        log.info("Click on Casino Tab: " + casino.toString());
    }

    public String verifyPopularOnlineCasinoGamesText() {
        log.info("verify popular online casino games message: " + popularOnlineCasinoGamesText.toString());
        return getTextFromElement(popularOnlineCasinoGamesText);
    }

}
