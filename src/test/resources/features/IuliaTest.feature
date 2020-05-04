Feature:

  Scenario: Search for a specific book and see information about it

    Given the "Search Box" is clicked

    When book title "Alchimistul" is inserted in the "Search Box"
    And "Submit" button is clicked
    Then the book "Alchimistul" is displayed on the screen

    When the searched book is clicked
    Then the information about that book is displayed


  Scenario: Sort top 100 books by price

    Given the "TOP 100 Carti" from the main page is clicked
    When "Filtreaza dupa" dropdown menu is clicked
    And "Pret" option is selected from that dropdown menu
    Then books are rearranged from high to low price

  Scenario:


