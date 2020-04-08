package edu.librairus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LibrariusPages {

    @FindBy (xpath = "//a[contains(@class, 'dropdown-toggle') and contains(text(), 'Manuale')]")
    private WebElement manualeMainMenu;

    @FindBy(xpath = "//div[contains(@class, 'col-md-3')]/ul[contains(@class, 'has-topBar')]/li[contains(@class, 'dropdown')][2]/a[contains(text(), 'Clasa 10')]")
    private WebElement Clasa10;

    @FindBy(xpath = "//span[contains(@class,'book__title') and contains(text(), 'Chimia.cl.10.Caiet de lucrari practice ')]")
    private WebElement selectSpecificBook;

    @FindBy(id = "addToCartButton")
    private WebElement addBookToCart;

    @FindBy(css = "a > .hidden-xs")
    private WebElement clickOnCart;

    @FindBy(css = ".basket-button")
    private WebElement goToCart;

    @FindBy(xpath = "//div[@id='basket-table']/div[2]/div[3]/a")
    private WebElement cartBookTitle;




    public WebElement getManualeMainMenu() {
        return manualeMainMenu;
    }

    public void setManualeMainMenu(WebElement manualeMainMenu) {
        this.manualeMainMenu = manualeMainMenu;
    }

    public WebElement getClasa10() {
        return Clasa10;
    }

    public void setClasa10(WebElement clasa10) {
        Clasa10 = clasa10;
    }

    public WebElement getSelectSpecificBook() {
        return selectSpecificBook;
    }

    public void setSelectSpecificBook(WebElement selectSpecificBook) {
        this.selectSpecificBook = selectSpecificBook;
    }

    public WebElement getAddBookToCart() {
        return addBookToCart;
    }

    public void setAddBookToCart(WebElement addBookToCart) {
        this.addBookToCart = addBookToCart;
    }

    public WebElement getClickOnCart() {
        return clickOnCart;
    }

    public void setClickOnCart(WebElement clickOnCart) {
        this.clickOnCart = clickOnCart;
    }

    public WebElement getGoToCart() {
        return goToCart;
    }

    public void setGoToCart(WebElement goToCart) {
        this.goToCart = goToCart;
    }

    public WebElement getCartBookTitle() {
        return cartBookTitle;
    }

    public void setCartBookTitle(WebElement cartBookTitle) {
        this.cartBookTitle = cartBookTitle;
    }
}
