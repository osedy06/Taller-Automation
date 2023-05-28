#Author: Osedy

@Completed_test
Feature: I am Testing the inventory billiard page
  
  @test_1
  Scenario Outline: I am veify the login 
    Given Star inventory page
    And I enter the user <user> and the password <password> 
    When I press the login button
    Then I validate the succesful login 
    
    Examples: 
      | user  	| password 		|
      |	brayan	| Prueba1234	|
      | Jorge		| Jorge2023*  |
      