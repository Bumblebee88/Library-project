@login
Feature: As user i want to be able to login under different role


 @opera
  Scenario: Login as a student91
    Given user is on the login page
    When user logs in
    Then user should see Library