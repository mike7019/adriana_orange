Feature: Create successfuly a new employee

  Background:

  Scenario Outline: successful login on the site
    Given That the user was on the website
    When attempts login with the following
      | user   | pass   |
      | <user> | <pass> |
    Then will see the <text> on screen
    Examples:
      | user  | pass     | text      |
      | Admin | admin123 | Dashboard |

  Scenario Outline: Create a new employee on PIM
    When the user attempts to register a new employee on the option PIM
      | name   | middleName   | lastname   | id   | username   | pass   | confPass   |
      | <name> | <middleName> | <lastname> | <id> | <username> | <pass> | <confPass> |
    Then he will see the employee created on the website
    Examples:
      | name    | middleName | lastname | id    | username | pass      | confPass  |
      | Adriana | Carolina   | Arias    | 12345 | AArias   | arias1234 | arias1234 |