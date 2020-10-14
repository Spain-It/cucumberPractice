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


    Scenario: Send Get Http Protocel
      Given the user set the uri
      And the user sends get request with "/movies" end point 1410
      And Verify the status code is 200
      When Verify the content Type is "application/json; charset=utf-8"
      Then Verify the response body is equal which is you posted


      Scenario: Send put Http protocol
        Given the user set the uri
        And the user sends put request with "/movies" end point 1410
        And Verify the status code is 204
        Then Verify the response body is equal which is you updated