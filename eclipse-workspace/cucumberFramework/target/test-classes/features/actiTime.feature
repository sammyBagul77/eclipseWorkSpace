Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Actitime task creation
    Given User already on login page of Actitime
    When User should able to login with Username as <username> and Password as <password>
    Then User can see Home Page of Actitime having Title <title>
    And user able to click on menu element i.e Tasks
    When After clicking on Add new button user should add new task
    Then User also able to add task Name as <taskname> and deadline
    And user can logout after task deletion and logout

    Examples: 
      | username | password | title            | taskname |
      | admin    | manager  | Enter Time-Track | BDDTask  |
