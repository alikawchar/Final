Feature: loging to express.com

  Scenario: loging to express.com using valid credintiles.
    Given oprn browser
    And hover over signIn icon
    And click on sign In button
    When user input valid userId
    And user input valid passWord
    And user click login button
    Then user should see profilepage
