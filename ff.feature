Feature: Gmail Login
  Here we are testing the login operation in gmail

  Background: Launch Gmail Home page
    Given Launch Gmail Home page

  Scenario Outline: Login to Gmail
    When Enter username"<username>" and password"<password>"
    Then Click on signIn button
    And Logout from Gmail
    Examples:
    	| username | password |
    	| 119niki | p9885576296 |
    	| ambatirambabu4 | @mb@ti458 |
    
