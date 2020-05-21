package edu.librairus.commonAction;

import org.openqa.selenium.WebElement;

public class CommonActions  {

    public void waitForElementDisplayed(WebElement element, int second) throws Exception{
        long end  = System.currentTimeMillis() + (second*1000);
        while(System.currentTimeMillis()<end){
            if (element.isDisplayed()){
                break;
            }
        }
    }
    public void click(WebElement elem) throws Exception {
        waitForElementDisplayed(elem, 5);
        elem.click();
    }
}
