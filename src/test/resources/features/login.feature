Feature: Test Selenium feature with Serenity
  
  @uiregression
  Scenario Outline: Test some generic login page
    Given Open discover page
    When click login and provide credentials "<loginid>" "<pwd"
    Then verify the invalid credentials page
    
    Examples:
      |loginid|pwd|
      |testuser|password|

