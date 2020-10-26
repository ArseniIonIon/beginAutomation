package edu.librairus.actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static edu.librairus.browsers.Driver.getInstance;

public class CommonActions {

    public void waitForElementDisplayed(WebElement element, int second) {
        long end = System.currentTimeMillis() + (second * 1000);
        while (System.currentTimeMillis() < end) {
            if (element.isDisplayed()) {
                break;
            }
        }
    }

    public void click(WebElement elem) {
        waitForElementDisplayed(elem, 5);
        elem.click();
    }

    public void click(String elementBy) {
        getInstance().findElement(By.xpath(elementBy)).click();

    }

    public void moveToElement(WebElement element) {
        Actions action = new Actions(getInstance());
        action.moveToElement(element);
        action.perform();
    }

    public double getNumberFromElement(WebElement element) {
        String elemText = element.getText();
        return Double.parseDouble(elemText.replaceAll("\\D+", ""));
    }

    public double getNumberFromElement(String string) {
        return Double.parseDouble(string.replaceAll("\\D+", ""));
    }

    public WebElement getParentElement(WebElement element) {
        return element.findElement(By.xpath(".."));
    }

}
