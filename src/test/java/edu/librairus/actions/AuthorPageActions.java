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

    public void clickOnRandomBook(String bookName) {
        AuthorPage authorPage = (AuthorPage) scenarioContext.getData(CURRENT_PAGE);
        List<WebElement> elements = authorPage.getRandomBook();

        for (int i=0; i<elements.size(); i++){
            commonActions.moveToElement(elements.get(i));
            if (elements.get(i).findElement(By.cssSelector("span.book__title")).equals(bookName)){
                System.out.println(elements.get(i).getText());
                elements.get(i).click();
            }
        }

       /* for (WebElement element:elements) {
            if (element.getText().equals(bookName)){
                commonActions.moveToElement(element);
                element.click();
                break;
            }else {
                System.out.println("no elem found");
            }
        }

        Random random = new Random();
        int randomValue = random.nextInt(elements.size());
        Actions actions = new Actions(getInstance());
        actions.moveToElement(elements.get(randomValue));
        elements.get(randomValue).click();*/
    }

    public void verifyAuthorBook(String autorBook) {
        AuthorPage authorPage = (AuthorPage) scenarioContext.getData(CURRENT_PAGE);
        String autor  = authorPage.getBookAuthor().getText();
        Assert.assertEquals(autor,autorBook);

    }

}
