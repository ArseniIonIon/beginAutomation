@RunAuthorPage
Feature: Verify books by the same author

  Scenario: Get book by the same author.
    Given user navigates to Top Autori Section
    When selects "ПУШКИН А.(51)" author
    Then author page is displayed
    And  open any author's book
    And the autor of book is "Пушкин А."


