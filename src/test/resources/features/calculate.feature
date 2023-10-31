Feature: Decathlon

  Scenario Outline: Running 100 meters and calculating different scores
    Given I have selected "<Discipline>" meters
    And I enter <Number> as my result
    Then I can verify my score as <Result>
    Examples:
      | Discipline         | Number | Result |
      | Deca100M           | 10     | 1096   |
      | Deca110MHurdles    | 14     | 975    |
      | Deca400M           | 20     | 2698   |
      | Deca1500M          | 2.44   | 3406   |
      | DecaDiscusThrow    | 23     | 329    |
      | DecaHighJump       | 123    | 206    |
      | DecaJavelinThrow   | 12     | 57     |
      | DecaLongJump       | 400    | 206    |
      | DecaPoleVault      | 300    | 357    |
      | DecaShotPut        | 15     | 790    |

