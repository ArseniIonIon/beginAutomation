package edu.librairus.actions;

import edu.librairus.context.ScenarioContext;
import edu.librairus.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static edu.librairus.context.ScenarioContext.getScenarioContext;
import static edu.librairus.browsers.Driver.getInstance;
import static edu.librairus.context.ScenarioKeys.CURRENT_PAGE;

public class LoginPageActions {

    private ScenarioContext scenarioContext  = getScenarioContext();

    public void goToLoginPage(){
        LoginPage loginPage = new LoginPage(getInstance());
        loginPage.getLoginPageBtn().click();
        scenarioContext.saveData(CURRENT_PAGE,loginPage);

    }
    public void checkEmptyEmailField(){
        LoginPage loginPage = (LoginPage) scenarioContext.getData(CURRENT_PAGE);
        String emailField  =  loginPage.getEmailField().getText();
        Assert.assertTrue(emailField.isEmpty());

    }

    public void checkEmptyPasswordField(){
        LoginPage loginPage = (LoginPage) scenarioContext.getData(CURRENT_PAGE);
        String passwordField  =  loginPage.getPasswordField().getText();
        Assert.assertTrue(passwordField.isEmpty());

    }
}
