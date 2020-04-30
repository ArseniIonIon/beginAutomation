package edu.librairus.commonAction;

import edu.librairus.browsers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public  class Actions {

    public WebDriver driver =  Driver.getInstance();


    public void click(String elementBy) {
        driver.findElement(By.xpath(elementBy)).click();
    }

    public static WebElement getParentElement(WebElement element){
        return element.findElement(By.xpath(".."));
    }

}
