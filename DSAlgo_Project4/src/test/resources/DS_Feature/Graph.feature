Feature: The user test the functionalities of the Graph page in the DS Algo application

Background:The user logs in to the application to verify the functionalities 
	Given User is on the DS Algo portal and click on the get started button
	Then User clicks on the sign in link
	When User is on the login page, user enters the valid email id and password
	And User clicks on the Graph Get started button and user is on the Graph page
	
	Scenario Outline: User checks the functionality of the Graph
  When User clicks on the Graph and user is in that page
  And User click on the try here button to go to try
  Then User inputs the valid python code in the text editor box from the Excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the GraphRepresentations
  When User clicks on the GraphRepresentations and user is in that page
  And User click on the try here button to go to try
  Then User inputs the valid python code in the text editor box from the Excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|