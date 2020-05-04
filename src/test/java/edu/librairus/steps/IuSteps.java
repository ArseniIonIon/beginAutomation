package edu.librairus.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.librairus.actions.IuActions;

public class IuSteps {

    IuActions actions = new IuActions();


    @Given("the \"Search Box\" is clicked")
    public void searchBoxIsClicked() {
        actions.clickSearchBox();
    }

    @When("book title {string} is inserted in the \"Search Box\"")
    public void bookIsInserted(String bookTitle) {
        actions.insertSpecificBook(bookTitle);
    }

    @And("\"Submit\" button is clicked")
    public void buttonIsClicked() {
        actions.clickSubmitButton();
    }

    @Then("the book {string} is displayed on the screen")
    public void bookIsDisplayedOnScreen(String bookTitle) {
        actions.bookIsDisplayed(bookTitle);
    }
}
