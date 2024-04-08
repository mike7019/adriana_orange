Feature: login on the website

  Scenario Outline: successful login on the site
    Given That the user was on the website
    When attempts login with the following
      | user   | pass   |
      | <user> | <pass> |
    Then will see the <text> on screen
    Examples:
      | user  | pass     | text      |
      | Admin | admin123 | Dashboard |