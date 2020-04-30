package edu.librairus.actions;


import cucumber.api.java.en_old.Ac;
import cucumber.api.java.hu.De;
import edu.librairus.browsers.Driver;
import edu.librairus.pages.AuthorPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class AuthorPageActions extends Actions {


    public AuthorPageActions(WebDriver driver) {
        super(driver);
    }

    public void hoverAllBooks() {
        AuthorPage autorPage = new AuthorPage();
        PageFactory.initElements(Driver.getInstance(), autorPage);
        Actions action = new Actions(Driver.getInstance());
        action.moveToElement(autorPage.getBooks()).perform();
    }

    public void clickOnAuthor(String autor) throws InterruptedException {
        AuthorPage autorPage = new AuthorPage();
        PageFactory.initElements(Driver.getInstance(), autorPage);

        List<WebElement> elements = autorPage.getListOfAuthor();
        Thread.sleep(100);
        for (WebElement element : elements) {
            Actions action = new Actions(Driver.getInstance());
            action.moveToElement(element).build().perform();
            if (element.getText().equals(autor)) {
                element.click();
                break;
            }
        }
    }

    public void checkAutorPage() {
        AuthorPage autorPage = new AuthorPage();
        PageFactory.initElements(Driver.getInstance(), autorPage);
        Assert.assertTrue(autorPage.getCheckAutorPageElement().isDisplayed());
    }

    public void clickOnRandomBook() {
        AuthorPage autorPage = new AuthorPage();
        PageFactory.initElements(Driver.getInstance(), autorPage);
        List<WebElement> elements = autorPage.getRandomBook();

        Random random = new Random();
        int randomValue = random.nextInt(elements.size());
        Actions actions = new Actions(Driver.getInstance());
        actions.moveToElement(elements.get(randomValue));
        elements.get(randomValue).click();
    }

    public void verifyAuthorBook(String autorBook) {
        AuthorPage autorPage = new AuthorPage();
        PageFactory.initElements(Driver.getInstance(), autorPage);
        String autor  = autorPage.getBookAuthor().getText();
        Assert.assertEquals(autor,autorBook);

    }
}
