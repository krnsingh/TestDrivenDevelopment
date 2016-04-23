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

  Scenario: To find out if a string is palindrome or not
    Given The input string is ""
    When palindrome method is executed
    Then then true is returned

    Given The input string is "a"
    When palindrome method is executed
    Then then true is returned

    Given The input string is "civic"
    When palindrome method is executed
    Then then true is returned

    Given The input string is "Civic"
    When palindrome method is executed
    Then then true is returned

    Given The input string is "I did did I"
    When palindrome method is executed
    Then then true is returned

    Given The input string is "I did dID i"
    When palindrome method is executed
    Then then true is returned

    Given The input string is "chris"
    When palindrome method is executed
    Then then false is returned

    Given The input string is "What do you mean"
    When palindrome method is executed
    Then then false is returned

