package edu.librairus.steps;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import edu.librairus.actions.OurActions;

public class Steps {

    OurActions actions = new OurActions();
    @Given("user navigates to '{}'")
    public void navigateToClasa10Page(String elem) throws Exception {
        Thread.sleep(1000);
        actions.topMenuOptionsHover(elem);

//        actions.clickOnClasa10();
    }

    @Given("^user opens specific book$")
    public void selectPsecificBook() {
        actions.clickOnSpecificBook();
    }

    @Given("^user cliks on 'Adauga in cos'$")
    public void addBookToCart() {
        actions.addToCart();
    }

    @When("^user navigates to the cart$")
    public void navigateToCart() throws InterruptedException {
        actions.setGoToCart();
    }

    @Then("^user can see added book into the cart$")
    public void assertBook() throws InterruptedException {
        actions.compareBookTitle();
    }
}