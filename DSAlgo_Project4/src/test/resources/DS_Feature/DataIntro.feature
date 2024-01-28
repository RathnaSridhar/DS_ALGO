
Feature: The iser in navigating to the Data Introduction page 
and tries to input code in the Try here tab

 @Smoke
  Scenario: User navigates to the Data Introduction page
    Given The user is already logged in and is on the homepage
    When User clicks the get started button
    And Clicks on the times complexity button
    Then User click the Try here button, user is taken to the coding page
    When User enters the Python code from xlsheet
    And User clicks on the run button
    Then User can see the the output printed
  
  @Smoke
 	Scenario Outline: Verifying data structure text box editor with invalid python code
 	Given The user is already logged in and is on the homepage
    When User clicks the get started button
    And Clicks on the times complexity button
    Then User click the Try here button, user is taken to the coding page
    When User enters the invalid Python code from xlsheet "<sheetname>" and rownum <rownum>
    And User clicks on the run button
    Then Output should be blank
    
    Examples:
    |sheetname	|	rownum|
    |Data				|		1			|	