package edu.librairus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    public AbstractPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public WebElement getAnchorElement(){
        return null;
    }
}
