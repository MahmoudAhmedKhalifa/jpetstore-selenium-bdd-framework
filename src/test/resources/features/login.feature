Feature: User Login
  As a registered user
  I want to login to my account
  So that I can access the application

  Background:
    Given user is on the Pet Store landing page

  Scenario: Successful login with valid credentials
    When user navigate to login screen
    And user enters valid credentials
    And user clicks login button
    Then Welcome content should be visible on homepage
