Feature: Search to hotels
  As to QA Automation
  Want to Search a hotel
  For book when the rate is cheaper

  Scenario Outline: Search Hotel
    Given That user the DX Hotel page
    When the user select information
      | location   | checkout   | checkin   | room   | adult   | child   |
      | <location> | <checkout> | <checkin> | <room> | <adult> | <child> |

    Then the value to pay is validated
    Examples:
      | location    | checkout   | checkin   | room | adult | child |
      | Los Angeles | 12/02/2022 | 9/30/2022 | 1    | 1     | 0     |








