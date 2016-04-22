Feature: To test various stream collection exercises

  Scenario: Convert the list Address objects to list of countries
    Given There is random list of addresses:
      | addressLine      | city        | county      | country |
      | 11 Field Rd      | Fife        | Lanarkshire | UK      |
      | 6 Grantham House | Leatherhead | Surrey      | UK      |
      | 180 Five Avn     | Fremonth    | CA          | USA     |
      | 242 Phase 7      | mohali      | Punjab      | India   |
    When the operation to get list of unique countries applied
    Then the result should be
      | UK    |
      | USA   |
      | India |

