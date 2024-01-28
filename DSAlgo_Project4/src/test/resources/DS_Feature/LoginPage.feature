
Feature: Log in to the DS-Algo app
 The user is able to login to the DS Algo app successfully

Background:
Given User is in the homepage
Then User clicks on the signin button

@Regression
  Scenario Outline: User is trying to login with invalid credentials
    When User enters the invalid username "<username>" and password "<password>" and click on login button
    Then The user should get an error message
    
    Examples: 
      | username  					| password 				| status  |
      | BugSlayers 					| SuDhJoRa_SDET 	| Invalid |
      | Bugslayers@SDET143 	| SudhJoRa_SDET 	| Invalid |
			
@Regression
	Scenario Outline: User is trying to login with some fields empty
	When User missed to fill out all the required fields "<username>" and "<password>"
	Then User should get a error message to fill out the missing field
	Examples:
	| username						| password				|	status	|
	| Bugslayers@SDET143	|									|	Invalid	|
	| 										|	SuDhJoRa_SDET		|	Invalid	|
	|											|									|	Invalid	|
		
		@Regression	
	Scenario: User is logging in with valid credentials
	When User enter the valid username and password then he clicks on the login button
	Then User is successfully logged in to the app
	 
	 