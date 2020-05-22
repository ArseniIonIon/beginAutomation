package edu.librairus.actions;

import edu.librairus.browsers.Driver;
import edu.librairus.context.ScenarioContext;
import edu.librairus.pages.DiscountProductPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import java.util.List;
import java.util.Random;

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
        List<WebElement> elementList  =  discountProductPage.getRandomBook();
        Random random = new Random();
        int randomValue = random.nextInt(elementList.size());
        Actions actions = new Actions(Driver.getInstance());
        actions.moveToElement(elementList.get(randomValue));
        elementList.get(randomValue).click();
    }

    public void verifyDiscountedPrice(){
        DiscountProductPage discountProductPage = new DiscountProductPage(getInstance());
        double initialPrice  =  commonActions.getNumberFromElement(discountProductPage.getInitialPrice());
        String [] tempArray;
        tempArray = discountProductPage.getSalesPrice().getText().split("%");
        double salePrice =commonActions.getNumberFromElement(tempArray[1]);
        Assert.assertEquals(salePrice, initialPrice / 2, 0.00);
    }
}
