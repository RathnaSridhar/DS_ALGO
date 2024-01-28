
Feature: Verifying the Array functionalities in the DS Algo app

	Background: The user logsin to the application to verify the functionalities
	Given User is on the DS Algo portal and click on the get started button
	Then User clicks on the sign in link
	When User is on the login page, user enters the valid email id and password
	Then In the home page user clicks the get started button of Array
	
  @Smoke
  Scenario Outline: User checks functionalities of the Arrays in Python
    When User clicks on the Arrays in Python link
    Then User navigates to the try editor page
    And User enter the valid python code in the tryeditor from sheet "<sheetname>" and rownumber <rownum>
    Then User should get the correct output
    
    Examples:
    | sheetname	|	rownum|
    |	Data			|		2		|

	@Smoke
  Scenario Outline: User checks the functionalities on the Arrays using list
    When User clicks on the Arrays using list link
    Then User navigates to the try editor page
    And The User enter the valid python code in the tryeditor from sheet "<sheetname>" and rownumber <rownum>
    And User should get the correct output

    Examples: 
      | sheetname	|	rownum	|
      |	 Data			|	3			|
  
  @Smoke
  Scenario Outline: The user checks the functionalities of the Basic operation list page
  When User clicks on the Basic opertaion list page
  Then User navigates to the try editor page
  And User enter the valid python code from sheet "<sheetname>" and rownumber <rownum> in to the try editor
  And User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|	
  |	Data			|		4			|
  
 @Smoke
  Scenario Outline: The user checks the functionalities of the Appplications of Array page
  When User clicks on the Applications of Array link
  Then User navigates to the try editor page
  And User enters the valid python code from sheet "<sheetname>" and rownumber <rownum> in to the try editor 
  And User should get the correct output
  
  Examples:
  |	sheetname	|	rownum|
  |	Data			|	4			|
  
  @Smoke 
  Scenario Outline: The user test the Practice sections of the Array page
 	When User clicks on the Arrays in Python link
 	Then User click on the Practice question link
 	And User selects the search the array practice question
 	And User enters the valid python code from sheet "<sheetname>" and rownumber <rownum> in to the try editor 
 	And User should get the correct output
 	
 	Examples:
  |	sheetname	|	rownum|
  |	Data			|	5			| 
  
  @Smoke
 Scenario Outline: The user test the Practice sections of the Array page
 	When User clicks on the Arrays in Python link
 	Then User click on the Practice question link
 	And User selects the Max consecutive ones practice question
 	And User enters the valid python code from sheet "<sheetname>" and rownumber <rownum> in to the try editor 
 	And User should get the correct output
 	
 	Examples:
  |	sheetname	|	rownum|
  |	Data			|	5		| 
  
 @Smoke 
  Scenario Outline: The user test the Practice sections of the Array page
 	When User clicks on the Arrays in Python link
 	Then User click on the Practice question link
 	And User selects the Find number with Even number of digits practice question
 	And User enters the valid python code from sheet "<sheetname>" and rownumber <rownum> in to the try editor 
 	And User should get the correct output
 	
 	Examples:
  |	sheetname	|	rownum|
  |	Data			|	5			| 
  
  @Smoke 
  Scenario Outline: The user test the Practice sections of the Array page
 	When User clicks on the Arrays in Python link
 	Then User click on the Practice question link
 	And User selects the squares of the sorted array practice question
 	And User enters the valid python code from sheet "<sheetname>" and rownumber <rownum> in to the try editor 
 	And User should get the correct output
 	
 	Examples:
  |	sheetname	|	rownum|
  |	Data			|5			| 