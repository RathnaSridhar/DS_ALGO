@Stack
Feature: The user test the functionalities of the Stack page in the DS Algo application

Background:The user logs in to the application to verify the functionalities 
	Given User is on the DS Algo portal and click on the get started button
	Then User clicks on the sign in link
	When User is on the login page, user enters the valid email id and password
	And User clicks on the Stack Get started button and user is on the Stack page
	
	@Stack_01
	Scenario Outline: User checks the functionality of the Operations in stack page 
  When User clicks on the Operations in stack and user is in that page
  And User click on the try here button
  Then User inputs the valid python code in the text editor box from the excelsheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	

	Scenario Outline: User checks the functionality of the Implementaion in stack page 
  When User clicks on the Implementaion in stack and user is in the that page
  And User click on the try here button
  Then User inputs the valid python code in the text editor box from the excelsheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	@Smoke
	Scenario Outline: User checks the functionality of the Applications in stack page
  When User clicks on the Applications in stack and user is in the that in stack page
  And User click on the try here button
  Then User inputs the valid python code in the text editor box from the excelsheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|