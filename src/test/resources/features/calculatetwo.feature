Feature: Hepathlon

  Scenario Outline: Running 100 meters and calculating different scores
    Given I have selected "<Discipline>" meters
    And I enter <Number> as my result
    Then I can verify my score as <Result>
    Examples:
      | Discipline       |  Number | Result |
      | Hep100MHurdles   |  20     | 302    |
      | Hep200M          |  21     | 1287   |
      | Hep800M          |  90     | 1632   |
      | HeptHightJump    |  85     | 41     |
      | HeptJavelinThrow |  50     | 860    |
      | HeptLongJump     |  250    | 34     |
      | HeptShotPut      |  5      | 191    |


