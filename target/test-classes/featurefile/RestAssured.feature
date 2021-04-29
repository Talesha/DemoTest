Feature: Rest API Test
  I want this feature to allow user to Rest API

 @FlowTest
  Scenario: To verify user is getting correct status code
    Given user is having endpoint URI
    When user sends get request
    Then user will have 200 response code
    When user send post request
    Then user will have 200 response code