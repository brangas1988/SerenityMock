@Regression
Feature: Cucumber API test


  Scenario Outline: Run API multithreading

    Given insert call for products
    When enter details <productid> "<name>" "<description>"
    Then record should be inserted

    Examples:
      |productid |name  |description|
      |  45|Dell  |Laptop         |
      |46  |Nokia  |Mobile      |
      |47 |IOS  |Apple OS    |
      |58 |Windows        |Windows OS    |
      |69 |Lenova         |Laptop   |
      |70 |ATT      |Network    |


  Scenario Outline: Run API multithreading1

    Given insert call for products
    When enter details <productid> "<name>" "<description>"
    Then record should be inserted

    Examples:
      |productid |name  |description|
      |  43|Dell  |Laptop         |
      |42  |Nokia  |Mobile      |

  Scenario Outline: Run API multithreading2

    Given insert call for products
    When enter details <productid> "<name>" "<description>"
    Then record should be inserted

    Examples:
      |productid |name  |description|
      |  40|Dell  |Laptop         |
      |20  |Nokia  |Mobile      |

  Scenario Outline: Run API multithreading3

    Given insert call for products
    When enter details <productid> "<name>" "<description>"
    Then record should be inserted

    Examples:
      |productid |name  |description|
      |  40|Dell  |Laptop         |
      |20  |Nokia  |Mobile      |


  Scenario Outline: Run API multithreading4

    Given insert call for products
    When enter details <productid> "<name>" "<description>"
    Then record should be inserted

    Examples:
      |productid |name  |description|
      |  40|Dell  |Laptop         |
      |20  |Nokia  |Mobile      |


  Scenario Outline: Run API multithreading5

    Given insert call for products
    When enter details <productid> "<name>" "<description>"
    Then record should be inserted

    Examples:
      |productid |name  |description|
      |  22|Dell  |Laptop         |
      |24  |Nokia  |Mobile      |