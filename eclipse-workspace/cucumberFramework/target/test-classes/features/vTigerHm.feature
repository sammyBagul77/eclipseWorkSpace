Feature: lead Creation

  Background: 
    User should be able to login in with valid details.

    Given Chrome browser should open and user should on Vtiger Page
    When User enters username and password as and Enter
    Then User should navigate on vTiger Homepage

  Scenario: Vtiger lead creation
    When User clicks on dashBoard menu and clicks on Marketing
    Then User able to click lead in list and able to see lead page
    And user should create new lead after clicking on add lead
     When User clicks on More Dropdown and Click on delete lead
     Then User should be able to delete the lead
    
   
  
  