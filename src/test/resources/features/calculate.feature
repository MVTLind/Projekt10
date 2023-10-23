Feature: Decathlon

  Scenario Outline: Running 100 meters and calculating different scores
    Given I have selected "<Discipline>" meters
    And I enter <Number> as my result
    Then I can verify my score as <Result>
    Examples:
      | Discipline | Number | Result |
      | Deca100M   | 5      | 2640   |
      | Deca400M   | 5      | 3994   |
