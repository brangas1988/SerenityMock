@Regression
Feature: Cucumber API test


  Scenario Outline: Run API multithreading

    Given insert call for products
    When enter details <productid> "<name>" "<description>"
    Then record should be inserted
    Examples:
      |productid |name  |description|
      |  45|Raghu  |Dubakoor         |
      |46  |Bharani  |SuperStar      |
      |47 |ChandraKanth  |Doggie    |
      |58 |Arvind        |anbuen    |
      |69 |Aaria         |Chellam   |
      |70 |Prithivi      |wifeyy    |