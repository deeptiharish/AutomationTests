Feature: Buyer Search Enhancement

  Scenario: To verify the Buyer search Master Layout is displayed as expected
    Given I navigate to https://sitemeadevclc.achilles.com/
    And I login as Kamila.prod and Wawa@789
    Then I check Achilles logo is dispalyed
    Then I check the menu options Home and My Workspace and Information Centre is displayed
    Then I check that Supplier Search is displayed
    Then I check Advanced Search link is dispalyed
    Then I check footer © 2016 Achilles Information Limited is displayed


  Scenario: To verify Buyer Menu rendered when moved to partial view for Quick & Advanced search
    Given I navigate to https://sitemeadevclc.achilles.com/
    And I login as Kamila.prod and Wawa@789
    Then I check Achilles logo is dispalyed
    Then I check the menu options Home and My Workspace and Information Centre is displayed
    And I go to Advanced Search page
    Then I check the menu options Home and My Workspace and Information Centre is displayed

  Scenario: To verify Buyer header is rendered when moved to partial view for Quick & Advanced search
    Given I navigate to https://sitemeadevclc.achilles.com/
    And I login as Kamila.prod and Wawa@789
    Then I check Achilles logo is dispalyed
    Then I check the buyer user displayed is Kamila Cholawska
     And I go to Advanced Search page
    Then I check the buyer user displayed is Kamila Cholawska