Feature: vTiger Login Page

  Scenario Outline: User should be able to login in with valid details.
    Given Chrome browser should open and user should on Vtiger Page
    When User enters username and password as and Enter
    Then User should navigate on vTiger Homepage

  