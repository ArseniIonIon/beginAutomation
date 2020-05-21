package edu.librairus.actions;

import edu.librairus.context.ScenarioContext;
import edu.librairus.pages.LibrariusPages;
import edu.librairus.utils.PageManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import java.util.Optional;

import static edu.librairus.browsers.Driver.getInstance;
import static edu.librairus.context.ScenarioContext.getScenarioContext;
import static edu.librairus.context.ScenarioKeys.CURRENT_PAGE;
import static org.junit.Assert.assertEquals;

public class OurActions {

    private ScenarioContext scenarioContext = getScenarioContext();


    public void topMenuOptionsHover(final String title) {
        LibrariusPages page = new LibrariusPages(getInstance());
        Actions action = new Actions(getInstance());
//      action.moveToElement(page.getManualeMainMenu()).perform();
        Optional<WebElement> optionToHover = page.getTopMenuOptions().stream().filter(x->title.equals(x.getText())).findFirst();
        if(optionToHover.isPresent() && optionToHover.get().isDisplayed()) {
            action.moveToElement(optionToHover.get()).perform();
        } else {
            System.out.println("Element not found on the page");
        }
        scenarioContext.saveData(CURRENT_PAGE,PageManager.getPageByName(title));
    }

    public void clickOnClasa10(){
        LibrariusPages page = new LibrariusPages(getInstance());
        page.getClasa10().click();
        scenarioContext.saveData(CURRENT_PAGE,page);

    }

    public void clickOnSpecificBook(){
        LibrariusPages page = new LibrariusPages(getInstance());
        page.getSelectSpecificBook().click();
        scenarioContext.saveData(CURRENT_PAGE,page);

    }

    public void addToCart(){
        LibrariusPages page = new LibrariusPages(getInstance());
        page.getAddBookToCart().click();
        scenarioContext.saveData(CURRENT_PAGE,page);

    }

    public void setGoToCart() throws InterruptedException{
        LibrariusPages page = new LibrariusPages(getInstance());
        Thread.sleep(2000);
        page.getClickOnCart().click();
        Thread.sleep(2000);
        page.getGoToCart().click();
        scenarioContext.saveData(CURRENT_PAGE,page);

    }

    public void compareBookTitle() throws InterruptedException{
        LibrariusPages page = new LibrariusPages(getInstance());
        PageFactory.initElements(getInstance(), page);
        String title = page.getCartBookTitle().getText().trim().replace(" ", "");
        String expectedTitle = "Chimia.cl.10.Caietdelucraripractice";
        Thread.sleep(2000);
        assertEquals(expectedTitle,title);
        scenarioContext.saveData(CURRENT_PAGE,page);
    }



}
