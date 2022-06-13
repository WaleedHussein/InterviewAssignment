@wip
Feature: Navigate to the testing website:
  1. add n number of elements
  2. asserts that n number of elements exist on the page

  Background: user on the homepage
    Given user is on the homepage

  Scenario:
    When user clicks on Add Elements for 4 times
    Then verify that the number of elements added equals 4