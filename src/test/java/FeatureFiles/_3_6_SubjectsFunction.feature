Feature: Subjects functionality


  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to Subjects page

  Scenario: Create a Subjects
    When Create a Subjects name is "Galatasaray" and code is "1905"
    And Create a new Category name is "tlp1245" and code is "112354"
    Then Select a Category and Select a Style

  Scenario: Delete a Subjects
    When Name is "Galatasaray"
    Then Success message should be displayed