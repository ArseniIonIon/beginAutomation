package edu.librairus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class DiscountProductPage extends AbstractPage {

   @FindBy (xpath = "//*[@id=\"topMain\"]/li[7]/a")
    private WebElement discountsPage;

    @FindBy (css = "#content > section > div > div.col-xs-12.col-md-9.col-sm-8.page-content > ul")
    private WebElement discountedBooks;

    @FindBy (css = "div#content del")
    private WebElement initialPrice;

   /* @FindBy (xpath = "//span[contains(text(),'Светофор шушера и другие граждане ')]")
    private WebElement titleBook;*/


    public DiscountProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//div[@id='content']/div/div/div[4]/div/div[2]")
    private WebElement salesPrice;

    public WebElement getInitialPrice() {
        return initialPrice;
    }

    public WebElement getSalesPrice() {
        return salesPrice;
    }

    public WebElement getDiscountsPage() {
        return discountsPage;
    }

    public List<WebElement> getRandomBook(){
        return discountedBooks.findElements(By.tagName("li"));
    }


}
