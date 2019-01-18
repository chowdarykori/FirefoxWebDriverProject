Feature: Testing firefox driver
  Scenario: Open the URL's with firefox driver
  Given Test Firefox Driver
    When I give path of the firefox available
    Then I should be able to open any URL with firefox driver