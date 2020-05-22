Feature: Verify discount  products

  Scenario: Verify if book by 50% sales have respectively price
    Given user navigates to Sales page
    And clicks on discounted book
    When the book page is displayed
    Then  price is reduced by 50%



