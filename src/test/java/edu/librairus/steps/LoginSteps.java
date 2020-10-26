package edu.librairus.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import edu.librairus.actions.LoginPageActions;
import edu.librairus.pages.LoginPage;
import static edu.librairus.browsers.Driver.getInstance;

public class LoginSteps {

    @Given("User navigates to login Page")
    public void userNavigatesToLoginPage() {
       // LoginPageActions loginPage = new LoginPageActions(getInstance());
    }

    @And("the email field is empty")
    public void theEmailFieldIsEmpty() {
    }

    @And("the password field is empty")
    public void thePasswordFieldIsEmpty() {
    }

}
