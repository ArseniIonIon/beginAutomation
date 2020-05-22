package edu.librairus.actions;


import edu.librairus.context.ScenarioContext;
import edu.librairus.pages.AuthorPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Random;

import static edu.librairus.browsers.Driver.getInstance;
import static edu.librairus.context.ScenarioContext.getScenarioContext;
import static edu.librairus.context.ScenarioKeys.CURRENT_PAGE;

public class AuthorPageActions extends Actions {

    private ScenarioContext scenarioContext = getScenarioContext();

    public AuthorPageActions(WebDriver driver) {
        super(driver);
    }

    public void hoverAllBooks() {
        AuthorPage authorPage = new AuthorPage(getInstance());
        Actions action = new Actions(getInstance());
        action.moveToElement(authorPage.getBooks()).perform();
        scenarioContext.saveData(CURRENT_PAGE,authorPage);
    }

    public void clickOnAuthor(String autor) throws InterruptedException {
        AuthorPage authorPage = (AuthorPage) scenarioContext.getData(CURRENT_PAGE);
        List<WebElement> elements = authorPage.getListOfAuthor();
        Thread.sleep(100);
        for (WebElement element : elements) {
            commonActions.moveToElement(element);
            if (element.getText().equals(autor)) {
                element.click();
                break;
            }
        }
    }

    public void checkAutorPage() {
        AuthorPage authorPage = (AuthorPage) scenarioContext.getData(CURRENT_PAGE);
        Assert.assertTrue(authorPage.getCheckAutorPageElement().isDisplayed());
    }

    public void clickOnRandomBook() {
        AuthorPage authorPage = (AuthorPage) scenarioContext.getData(CURRENT_PAGE);
        List<WebElement> elements = authorPage.getRandomBook();
        Random random = new Random();
        int randomValue = random.nextInt(elements.size());
        Actions actions = new Actions(getInstance());
        actions.moveToElement(elements.get(randomValue));
        elements.get(randomValue).click();
    }

    public void verifyAuthorBook(String autorBook) {
        AuthorPage authorPage = (AuthorPage) scenarioContext.getData(CURRENT_PAGE);
        String autor  = authorPage.getBookAuthor().getText();
        Assert.assertEquals(autor,autorBook);

    }
}
