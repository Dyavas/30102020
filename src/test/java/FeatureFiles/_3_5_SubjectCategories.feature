Feature: SubjectCategories functionality
  Background:
    Given Navigate to basqar
    When Enter username and password and click Login button
    Then User should login successfully
    And Navigate to SubjectCategories page

  Scenario: Create a SubjectCategories
    When Create a SubjectCategories name is "Galatasaray" and code is "1905"
    Then Success message should be displayed

  Scenario: Delete a SubjectCategories
    When Name is delete the "Galatasaray"
    Then Success message should be displayed