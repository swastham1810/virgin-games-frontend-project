@Asha @Regression
Feature: Virgin Games HomePage Functionality
  As a User ,
  I would like to navigate to homepage successfully

  Scenario: User should navigate to homepage successfully
    Given   User is on HomePage
    When    User click on accept all cookies
    Then    User Verify the welcome message "Welcome to Virgin Games"


  Scenario: User should navigate to Casino page successfully
    Given   User is on HomePage
    When    User click on accept all cookies
    And     User click on Casino tab on homepage
    Then    User verify the text "Popular Online Casino Games"

