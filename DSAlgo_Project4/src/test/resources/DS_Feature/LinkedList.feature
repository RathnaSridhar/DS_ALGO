
Feature: The user test the functionalities of the Linked List page in the DS Algo application

Background:The user logs in to the application to verify the functionalities 
	Given User is on the DS Algo portal and click on the get started button
	Then User clicks on the sign in link
	When User is on the login page, user enters the valid email id and password
	And User clicks on the Linked List Get started page to open the linked list page

  Scenario Outline: User checks the Introduction functionality of the Linked list Intro page 
  When User clicks on the Introductions link and clicks on the try here button
  Then User inputs the valid python code in the text editor box from the excel sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
  
 Scenario Outline: User checks the functionality of the creating linked list page
  When User clicks on the Creating linked list link and clicks on the try here button
  Then User inputs the valid python code in the text editor box from the excel sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|

  Scenario Outline: User checks the functionality of the Types of Linked list page
  When User clicks on the Types of Linked list link and clicks on the try here button
  Then User inputs the valid python code in the text editor box from the excel sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|

	 Scenario Outline: User checks the functionality of the Implemented Linked list in python page
  When User clicks on the Implemented Linked list in python  link and clicks on the try here button
  Then User inputs the valid python code in the text editor box from the excel sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	 Scenario Outline: User checks the functionality of the Traveral of Linked list page
  When User clicks on the Traversal link and clicks on the try here button
  Then User inputs the valid python code in the text editor box from the excel sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the Insertion of Linked list page
  When User clicks on the Insertion link and clicks on the try here button
  Then User inputs the valid python code in the text editor box from the excel sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the Deletion of Linked list page
  When User clicks on the Deletion link and clicks on the try here button
  Then User inputs the valid python code in the text editor box from the excel sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	