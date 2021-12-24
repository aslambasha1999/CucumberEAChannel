Feature: Checking the Login Functionality of EA Website

  Scenario: validating Login Functionality with Valid Credentials
    Given User should be Present on EA Website
    And user Enters valid "username" and "password"
      | admin | adminpassword |
      | aslam | aslam@test    |
    And User clicks login button
    Then User should be present on HomePage
