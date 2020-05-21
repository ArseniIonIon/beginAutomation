package edu.librairus.actions;

import edu.librairus.browsers.Driver;
import edu.librairus.context.ScenarioContext;
import edu.librairus.pages.AuthorPage;
import edu.librairus.pages.DiscountProductPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import static edu.librairus.browsers.Driver.getInstance;
import static edu.librairus.context.ScenarioContext.getScenarioContext;
import static edu.librairus.context.ScenarioKeys.CURRENT_PAGE;

public class DiscountPageActions {

    private ScenarioContext scenarioContext = getScenarioContext();

    public void clickOnDiscountProducts() {
        DiscountProductPage discountProductPage = new DiscountProductPage(getInstance());
        discountProductPage.getDiscountsPage().click();
        scenarioContext.saveData(CURRENT_PAGE,discountProductPage);
    }

    public void clickOnDiscoutedBook() {
        DiscountProductPage discountProductPage = (DiscountProductPage) scenarioContext.getData(CURRENT_PAGE);
        discountProductPage.getTitleBook().click();
    }


}
