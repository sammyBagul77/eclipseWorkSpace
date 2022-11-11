
Feature: Product List Functionality

  Scenario Outline: Getting list of products
    Given User already on HomePage
    When User click on searchBox and Enter <productName>
    Then User should able to see list of <productName> on WebPage
    When User click on any product
    Then He should get navigated on that product page
     And User should be able to add the product to the cart
     And  User should be able to see quanitity of product added to the cart
    Examples: 
      | productName  | 
      | Samsung Moblie  |
      #| Apple Watch        |
      #| Sony Tv                |

