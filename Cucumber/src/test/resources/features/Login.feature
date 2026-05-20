
Feature: Login Functionality

 
  Scenario: Verify login with valid uname and password
    Given User has to launch the application
    When User has to enter "Admin" and "admin123"
    And User has to click on login button
    Then User has to see dashboard
   
  