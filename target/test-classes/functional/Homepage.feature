@functional1
Feature: Google Search
  As a user, I want to open Google's homepage and verify its title.

  Scenario Outline: Verify Facebook homepage title
    Given User launch the Facebook homepage
    When User should login with valid username and password
    Then I can see home page successfully

##    Examples: 
  ##    | Username              | Password     |
    ##  | nehasinha44@gmail.com | mca6019/04## |
