Feature: The user test the functionalities of the Stack page in the DS Algo application

Background:The user logs in to the application to verify the functionalities 
	Given User is on the DS Algo portal and click on the get started button
	Then User clicks on the sign in link
	When User is on the login page, user enters the valid email id and password
	And User clicks on the Tree Get started button and user is on the Tree page
	
	Scenario Outline: User checks the functionality of the Overview of Trees
  When User clicks on the Overview of Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the Terminologies link in Tree
  When User clicks on the Terminologies link in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the Types of Trees
  When User clicks on the Types of Trees link and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the TreeTraversals in Trees
  When User clicks on the TreeTraversals in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
		Scenario Outline: User checks the functionality of the TraversalsIllustration in Trees
  When User clicks on the TraversalsIllustration in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
		Scenario Outline: User checks the functionality of the BinaryTrees in Trees
  When User clicks on the BinaryTrees in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
		
		Scenario Outline: User checks the functionality of the TypesofBinaryTrees in Trees
  When User clicks on the TypesofBinaryTrees in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the ImplementationinPython in Trees
  When User clicks on the ImplementationinPython in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
		Scenario Outline: User checks the functionality of the BinaryTreeTraversals in Trees
  When User clicks on the BinaryTreeTraversals in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the ImplementationofBinaryTrees in Trees
  When User clicks on the ImplementationofBinaryTrees in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
		Scenario Outline: User checks the functionality of the ApplicationsofBinaryTrees in Trees
  When User clicks on the ApplicationsofBinaryTrees in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the BinarySearchTrees in Trees
  When User clicks on the BinarySearchTrees in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	Scenario Outline: User checks the functionality of the ImplementationofBST in Trees
  When User clicks on the ImplementationofBST in Trees and user is in that page
  And User click on the try here button to go to try editor
  Then User inputs the valid python code in the text editor box from the excel sheet sheet "<sheetname>" and rownumber <rownum>
  Then User should get the correct output
  
  Examples:
  |sheetname	|	rownum	|
	|	Data			|	3				|
	
	