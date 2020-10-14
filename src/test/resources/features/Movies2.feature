Feature: Movies End Point

  Scenario: Send Post Http Protocol
    Given the user set the uri
    And the user sends post request with "/movies" end point
      | title           | Salamanca |
      | year            | 1920      |
      | plot            | anyword   |
      | duration        | 110       |
      | audio_qualities |           |
      | video_qualities |           |
      | genres          |           |
    And Verify the status code is 201
    When Verify the content Type is "application/json; charset=utf-8"
    Then Print the response body