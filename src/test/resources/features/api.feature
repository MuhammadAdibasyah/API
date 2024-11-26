Feature: Automation Rest Api

  @api
  Scenario: get all user with valid url
    Given prepare url valid for get list data
    When hit url to get list data
    Then get status code 200
    And get all data users

  @api
  Scenario: get all user with invalid url
    Given prepare url valid for get list data
    When hit url to get list data
    Then get status code 200
    And get all data users


  Scenario: get all user with valid url
    Given prepare url valid for get list data
    When hit url to get list data
    Then get status code 200
    And get all data users