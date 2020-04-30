package edu.librairus.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.librairus.actions.DiscountPageActions;

public class DiscountProductSteps {

    DiscountPageActions discountPageActions = new DiscountPageActions();

    @Given("user navigates to Sales page")
    public void userNavigatesToSalesPage() throws InterruptedException {
        discountPageActions.clickOnDiscountProducts();
        Thread.sleep(50);
    }

    @And("clicks on discounted book")
    public void clicksOnDiscountedBook() {
        discountPageActions.clickOnDiscoutedBook();
    }

    @When("the book page is displayed")
    public void theBookPageIsDisplayed() {
    }


    @Then("price is reduced by {int}%")
    public void priceIsReducedBy(int arg0) {
    }
}
