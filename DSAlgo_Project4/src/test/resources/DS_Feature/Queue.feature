Feature: The user test the functionalities of the Queue page in the DS Algo application

Background: The user logs in to the application to verify the functionalities 
	Given User is on the DS Algo portal and click on the get started button
	Then User clicks on the sign in link
	When User is on the login page, user enters the valid email id and password
	And User clicks on the Queue Get started button and user is on the Queue page
	
	Scenario Outline: User checks the functionality of the Implementation of queue in Python page 
  When User clicks on the Implementation of queue in Python and user is in that page
  And User clicks on the try here button
  Then User inputs the valid python code in the text editor box from the xlsheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the Implementation using collection.deque page 
  When User clicks on the Implementation using collection.deque in Python and user is in that page
  And User clicks on the try here button
  Then User inputs the valid python code in the text editor box from the xlsheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
   Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
		Scenario Outline: User checks the functionality of the Implementation using array page 
  When User clicks on the Implementation using array in Python and user is in that page
  And User clicks on the try here button
  Then User inputs the valid python code in the text editor box from the xlsheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
   Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
		Scenario Outline: User checks the functionality of the Queue Operations page 
  When User clicks on the Queue Operations in Python and user is in that page
  And User clicks on the try here button
  Then User inputs the valid python code in the text editor box from the xlsheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
   Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|