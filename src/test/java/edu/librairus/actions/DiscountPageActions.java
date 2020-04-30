package edu.librairus.actions;

import edu.librairus.browsers.Driver;
import edu.librairus.pages.AuthorPage;
import edu.librairus.pages.DiscountProductPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class DiscountPageActions {

    public void clickOnDiscountProducts() {
        DiscountProductPage discountProductPage = new DiscountProductPage();
        PageFactory.initElements(Driver.getInstance(), discountProductPage);
        discountProductPage.getDiscountsPage().click();
    }

    public void clickOnDiscoutedBook() {
        DiscountProductPage discountProductPage = new DiscountProductPage();
        PageFactory.initElements(Driver.getInstance(), discountProductPage);
        discountProductPage.getTitleBook().click();
    }


}
