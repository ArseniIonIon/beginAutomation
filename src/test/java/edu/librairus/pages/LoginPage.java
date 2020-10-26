package edu.librairus.pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"topBar\"]/div/ul[1]/li[4]/a")
    private WebElement loginPageBtn;

    @FindBy(css = "/html/body/div[1]/div[2]/div/div[1]/h4")
    private WebElement anchorElement;

    @FindBy(id = "inputEmail")
    private WebElement emailField;

    @FindBy(id = "inputPassword")
    private WebElement passwordField;

    @FindBy (className = "btn btn-success")
    private WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginPageBtn() {
        return loginPageBtn;
    }

    @Override
    public WebElement getAnchorElement() {
        return anchorElement;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginBtn() {
        return loginBtn;
    }
}

