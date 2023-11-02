Feature: Decathlon

  Scenario Outline: Running 100 meters and calculating different scores
    Given I have selected "<Discipline>" meters
    And I enter "<TrackOrField>" <Number> as my result
    Then I can verify my score as <Result>
    Examples:
      | Discipline       | TrackOrField | Number | Result |
      | Deca100M         | Track        | 10     | 1096   |
      | Deca110MHurdles  | Track        | 14     | 975    |
      | Deca400M         | Track        | 20     | 2698   |
      | Deca1500M        | Track        | 2.44   | 3406   |
      | DecaDiscusThrow  | Field        | 23     | 329    |
      | DecaHighJump     | Field        | 123    | 206    |
      | DecaJavelinThrow | Field        | 12     | 57     |
      | DecaLongJump     | Field        | 400    | 206    |
      | DecaPoleVault    | Field        | 300    | 357    |
      | DecaShotPut      | Field        | 15     | 790    |

    //Test
