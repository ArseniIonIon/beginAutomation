package edu.librairus.actions;

import edu.librairus.browsers.Driver;
import org.openqa.selenium.interactions.Actions;
import edu.librairus.pages.LibrariusPages;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertEquals;


public class OurActions {



    public void hoverMenuManuale(){
        LibrariusPages page = new LibrariusPages();
        PageFactory.initElements(Driver.getInstance(), page);
        Actions action = new Actions(Driver.getInstance());
        action.moveToElement(page.getManualeMainMenu()).perform();
    }

    public void clickOnClasa10(){
        LibrariusPages page = new LibrariusPages();
        PageFactory.initElements(Driver.getInstance(), page);
        page.getClasa10().click();
    }

    public void clickOnSpecificBook(){
        LibrariusPages page = new LibrariusPages();
        PageFactory.initElements(Driver.getInstance(), page);
        page.getSelectSpecificBook().click();
    }

    public void addToCart(){
        LibrariusPages page = new LibrariusPages();
        PageFactory.initElements(Driver.getInstance(), page);
        page.getAddBookToCart().click();
    }

    public void setGoToCart() throws InterruptedException{
        LibrariusPages page = new LibrariusPages();
        PageFactory.initElements(Driver.getInstance(), page);
        Thread.sleep(2000);
        page.getClickOnCart().click();
        Thread.sleep(2000);
        page.getGoToCart().click();
    }

    public void compareBookTitle() throws InterruptedException{
        LibrariusPages page = new LibrariusPages();
        PageFactory.initElements(Driver.getInstance(), page);
        String title = page.getCartBookTitle().getText().trim().replace(" ", "");
        String expectedTitle = "Chimia.cl.10.Caietdelucraripractice";
        Thread.sleep(2000);
        assertEquals(expectedTitle,title);
    }
}
