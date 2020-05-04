package edu.librairus.actions;

import edu.librairus.browsers.Driver;
import edu.librairus.pages.IuPages;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;


public class IuActions {

    public void clickSearchBox() {
        IuPages page = new IuPages();
        PageFactory.initElements(Driver.getInstance(), page);
        page.getSearchBoxIsClicked().click();
    }


    public void insertSpecificBook(String bookTitle) {
        IuPages page = new IuPages();
        PageFactory.initElements(Driver.getInstance(), page);
        page.getBookIsInserted().sendKeys(bookTitle);
    }

    public void clickSubmitButton() {
        IuPages page = new IuPages();
        PageFactory.initElements(Driver.getInstance(), page);
        page.getButtonIsClicked().click();
    }

    public void bookIsDisplayed(String bookTitle) {
        IuPages page = new IuPages();
        PageFactory.initElements(Driver.getInstance(), page);
        String title = page.getBookTitle().getText().trim().replace(" ", "");
        assertEquals(bookTitle,title);
    }
}
