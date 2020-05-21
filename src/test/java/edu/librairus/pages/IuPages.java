package edu.librairus.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IuPages extends AbstractPage{

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement searchBoxIsClicked;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement bookIsInserted;

    @FindBy(xpath = "//span[@class='input-group-addon btn-search-bar']/button[@type='submit']")
    private WebElement buttonIsClicked;

    @FindBy(xpath = "//a[@title='Alchimistul']/span[@class='book__title']")
    private WebElement bookTitle;

    public IuPages(WebDriver driver) {
        super(driver);
    }

    public WebElement getSearchBoxIsClicked() {
        return searchBoxIsClicked;
    }

    public void setSearchBoxIsClicked(WebElement searchBoxIsClicked) {
        this.searchBoxIsClicked = searchBoxIsClicked;
    }

    public WebElement getBookIsInserted() {
        return bookIsInserted;
    }

    public void setBookIsInserted(WebElement bookIsInserted) {
        this.bookIsInserted = bookIsInserted;
    }

    public WebElement getButtonIsClicked() {
        return buttonIsClicked;
    }

    public void setButtonIsClicked(WebElement buttonIsClicked) {
        this.buttonIsClicked = buttonIsClicked;
    }

    public WebElement getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(WebElement bookTitle) {
        this.bookTitle = bookTitle;
    }
}
