Feature: OrangHRM Login

  Scenario: Logo presence on OrangeHRM home Page
    Given I launch chrome browser
    When I open orange hrm homepage
    Then I verify that logo present on page
    And close browser
