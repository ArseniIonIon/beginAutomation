package edu.librairus.pages;

import edu.librairus.commonAction.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AuthorPage extends AbstractPage{

    @FindBy(xpath = "//*[@id=\"topMain\"]/li[1]/a")
    private WebElement books;

    @FindBy(xpath ="//h3[text() = 'Top Autori']")
    private WebElement topAuthorsTitle;

    @FindBy(css = "div#breadcumb li:nth-child(2) > a")
    private WebElement checkAutorPageElement;

    @FindBy (css = "#content > section > div > div.col-xs-12.col-md-9.page-content > ul")
    private WebElement randomBook;

    @FindBy (css = "div#content dd:nth-child(2) > a")
    private WebElement bookAuthor;

    public AuthorPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBookAuthor() {
        return bookAuthor;
    }

    public List<WebElement> getRandomBook(){
        return randomBook.findElements(By.tagName("li"));
    }


    public WebElement getCheckAutorPageElement() {
        return checkAutorPageElement;
    }

    public WebElement getBooks() {
        return books;
    }
}



