Feature: User Registration
  As a new user
  I want to register an account
  So that I can access the application

  Background:
    Given user is on the Pet Store landing page

  Scenario: Successful registration with valid data
    When user navigate to register screen
    And user register with valid user details
    Then user submits the form
