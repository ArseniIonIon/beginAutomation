package edu.librairus.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.librairus.actions.AuthorPageActions;
import edu.librairus.browsers.Driver;
import edu.librairus.commonAction.Actions;
import edu.librairus.pages.AuthorPage;

public class AuthorSteps extends Actions {

    AuthorPageActions authorPage = new AuthorPageActions(Driver.getInstance());

    @Given("user navigates to Top Autori Section")
    public void userNavigatesToTopAutoriSection() throws InterruptedException {
        Thread.sleep(5);
        authorPage.hoverAllBooks();
        Thread.sleep(5);

    }

    @When("selects {string} author")
    public void clicksOn(String autor) throws InterruptedException {
        Thread.sleep(500);
        authorPage.clickOnAuthor(autor);
        Thread.sleep(6500);
    }

    @Then("author page is displayed")
    public void authorPageIsDisplayed() {
        authorPage.checkAutorPage();
    }

    @And("open any author's book")
    public void clickOnAnyBook() {
        authorPage.clickOnRandomBook();
    }

    @And("the autor of book is {string}")
    public void theAutorOfBookIs(String autorBook) {
        authorPage.verifyAuthorBook(autorBook);
    }





}
