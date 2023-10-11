Feature Decathlon:

  Scenario Outline: Running 100 meters and calculating different scores
    Given I have selected "<Discipline>" meters
    And I enter 5.0 as my result
    Then I can verify my score as 2640.0
    Examples:
      | Discipline |

