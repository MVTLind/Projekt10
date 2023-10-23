Feature: Hepathlon

  Scenario Outline: Running 100 meters and calculating different scores
    Given I have selected "<Discipline>" meters
    And I enter "<TrackOrField>" <Number> as my result
    Then I can verify my score as <Result>
    Examples:
      | Discipline       | TrackOrField | Number | Result |
      | Hep100MHurdles   | Track        | 20     | 302    |
      | Hep200M          | Track        | 21     | 1287   |
      | Hep800M          | Track        | 90     | 1632   |
      | HeptHightJump    | Field        | 85     | 41     |
      | HeptJavelinThrow | Field        | 50     | 860    |
      | HeptLongJump     | Field        | 250    | 34     |
      | HeptShotPut      | Field        | 5      | 191    |


