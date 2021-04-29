Feature: Make my Trip Booking Flight
  I want this feature to allow user to search flight

 @FlowTest
  Scenario: To verify user is landing to Result Page after searching the flight
    Given user is on "MakeMyTrip" Dashboard Page
    When user select One Way Trip
    And user select origin city 
    And user select destination city
    And user select departure date
    And user select return date
    And user select traveller&class
    And user clicks on Searh Button
    Then user will land on Search Result Page