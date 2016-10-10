Feature: Login

  Scenario: Login to Gmail
    Given Launch Gmail Home page
    When Enter username and password
    Then Click on signIn button
    And Logout from Gmail
