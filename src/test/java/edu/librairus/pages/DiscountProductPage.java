package edu.librairus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscountProductPage extends AbstractPage {

    @FindBy (xpath = "//*[@id=\"topMain\"]/li[7]/a")
    private WebElement discountsPage;


   /* @FindBy (xpath = "//span[contains(text(),'Светофор шушера и другие граждане ')]")
    private WebElement titleBook;*/

    @FindBy (xpath = "//span[contains(text(),'Светофор шушера и другие граждане ')]")
    private WebElement titleBook;

    public DiscountProductPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDiscountsPage() {
        return discountsPage;
    }

    public void setDiscountsPage(WebElement discountsPage) {
        this.discountsPage = discountsPage;
    }


    public WebElement getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(WebElement titleBook) {
        this.titleBook = titleBook;
    }
}
