Feature: Login

  Scenario: Successful login
    Given Customer clicks on ContulMeu link
    When Customer enters "anamariacostea1@yahoo.com" and "password16!"
    And Customer clicks IntraInCont button
    Then currentURL contains "/account"