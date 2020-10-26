package edu.librairus.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.librairus.actions.AuthorPageActions;
import edu.librairus.context.ScenarioContext;
import edu.librairus.utils.PageManager;
import org.junit.Assert;

import static edu.librairus.context.ScenarioContext.getScenarioContext;

public class AuthorSteps  {

    private ScenarioContext scenarioContext = getScenarioContext();

    private AuthorPageActions authorPageActions = new AuthorPageActions();

    @Given("User navigates to carti sections")
    public void userNavigatesToCartiSections() {

    }

    @Given("user navigates to Top Autori Section")
    public void userNavigatesToTopAutoriSection() throws InterruptedException {
        Thread.sleep(5);
        authorPageActions.hoverAllBooks();
        Thread.sleep(5);
    }

    @When("user selects {string}")
    public void clicksOn(String autor) throws InterruptedException {
        Thread.sleep(500);
        authorPageActions.clickOnAuthor(autor);
        Thread.sleep(6500);
    }

    @Then("{} page is displayed")
    public void expectedPageIsDisplayed(String pageName) {
        Assert.assertTrue(String.format("Expected %s page is displayed",pageName),
                PageManager.getPage(pageName).getAnchorElement().isDisplayed());
    }
    @And("open {} author's book")
    public void clickOnAnyBook(String bookName) {
        authorPageActions.clickOnAuthorBook(bookName);
    }

    @And("the autor of book is {string}")
    public void theAutorOfBookIs(String autorBook) {
        authorPageActions.verifyAuthorBook(autorBook);
    }

}
