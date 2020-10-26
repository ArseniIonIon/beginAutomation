package edu.librairus.actions;


import edu.librairus.context.ScenarioContext;
import edu.librairus.pages.AuthorPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
import static edu.librairus.browsers.Driver.getInstance;
import static edu.librairus.context.ScenarioContext.getScenarioContext;
import static edu.librairus.context.ScenarioKeys.CURRENT_PAGE;

public class AuthorPageActions{

    private ScenarioContext scenarioContext = getScenarioContext();

    private CommonActions commonActions = new CommonActions();

    public void hoverAllBooks() {
        AuthorPage authorPage = new AuthorPage(getInstance());
        Actions action = new Actions(getInstance());
        action.moveToElement(authorPage.getBooks()).perform();
        scenarioContext.saveData(CURRENT_PAGE,authorPage);
    }

    public void clickOnAuthor(String autor) throws InterruptedException {
        AuthorPage authorPage = (AuthorPage) scenarioContext.getData(CURRENT_PAGE);
        List<WebElement> elements = commonActions.getParentElement(authorPage.getTopAuthorsTitle()).findElements(By.tagName("li"));
        Thread.sleep(100);
        for (WebElement element : elements) {
            commonActions.moveToElement(element);
            if (element.getText().equals(autor)) {
                element.click();
                break;
            }
        }
    }

    public void clickOnAuthorBook(String bookName) {
        AuthorPage authorPage = (AuthorPage) scenarioContext.getData(CURRENT_PAGE);
        List<WebElement> elements = authorPage.getAllBooks();

        for (WebElement element : elements) {
            commonActions.moveToElement(element);
            if (element.findElement(By.className("book__title")).getText().equals(bookName)) {
                element.click();
                break;
            }
        }

    }
    public void verifyAuthorBook(String autorBook) {
        AuthorPage authorPage = (AuthorPage) scenarioContext.getData(CURRENT_PAGE);
        String autor  = authorPage.getBookAuthor().getText();
        Assert.assertEquals(autor,autorBook);

    }
}
