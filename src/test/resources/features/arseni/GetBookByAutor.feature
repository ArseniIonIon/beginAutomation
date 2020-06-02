@RunAuthorPage
Feature: Verify books by the same author

  Scenario: Get book by the same author.
    Given user navigates to Top Autori Section
    When user selects "ПУШКИН А.(51)"
    Then Author page is displayed
    And  open Капитанская дочка. Повести author's book
    And the autor of book is "Пушкин А."
    Then Author page is displayed


