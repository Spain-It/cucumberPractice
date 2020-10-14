Feature: Movies End Point
  @api
  Scenario: Send Post Http Protocol
    Given the user set the uri
    And the user sends post request with "/movies" end point
    And Verify the status code is 201
    When Verify the content Type is "application/json; charset=utf-8"
    Then Print the response body


