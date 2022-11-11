Feature: Search Functionality

  Scenario Outline: Checking a range of products using search functionality
    Given User already on HomePage
    When User click on searchBox and Enter <productName>
    Then User should able to see list of <productName> on WebPage
    
    Examples: 
      | productName      |
      | Samsung Moblie  |
      | Apple Watch        |
      | Sony Tv                |
