
Feature: Registering to the DS-Algo app

Scenario Outline: Register with invalid credentials to check the error displayed
Given User is on the Register Page
When User leaves some fields "<Username>", "<Password1>" and "<Password2>" empty  
And User clicks on the register button 
Then User should get proper warning message

Examples:
|	Username	|	Password1	|	Password2	|	Status	|
|						|	Pass123		|	Pass123		|	Invalid	|
|	Admin			|	Pass123		|						|	Invalid	|
|						|						|						|	Invalid	|

