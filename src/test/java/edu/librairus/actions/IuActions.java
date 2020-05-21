package edu.librairus.actions;

import edu.librairus.context.ScenarioContext;
import edu.librairus.pages.IuPages;
import org.openqa.selenium.support.PageFactory;

import static edu.librairus.browsers.Driver.getInstance;
import static edu.librairus.context.ScenarioContext.getScenarioContext;
import static edu.librairus.context.ScenarioKeys.CURRENT_PAGE;
import static org.junit.Assert.assertEquals;


public class IuActions {

    private ScenarioContext scenarioContext = getScenarioContext();

    public void clickSearchBox() {
        IuPages page = new IuPages(getInstance());
        page.getSearchBoxIsClicked().click();
        scenarioContext.saveData(CURRENT_PAGE, page);
    }

    public void insertSpecificBook(String bookTitle) {
        IuPages page = (IuPages) scenarioContext.getData(CURRENT_PAGE);
        page.getBookIsInserted().sendKeys(bookTitle);
    }

    public void clickSubmitButton() {
        IuPages page = (IuPages) scenarioContext.getData(CURRENT_PAGE);
        PageFactory.initElements(getInstance(), page);
        page.getButtonIsClicked().click();
    }

    public void bookIsDisplayed(String bookTitle) {
        IuPages page = (IuPages) scenarioContext.getData(CURRENT_PAGE);
        PageFactory.initElements(getInstance(), page);
        String title = page.getBookTitle().getText().trim().replace(" ", "");
        assertEquals(bookTitle,title);
    }
}
