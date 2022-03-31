@FaceBook
Feature: FaceBookFeature
  I want test facebook application

  @Login
  Scenario: Login Scenario
    Given I am a user of facebook application
    When User enter valid Username
    And User enter valid password
    And User click on login button
    Then User should be able to login successfully 
   
