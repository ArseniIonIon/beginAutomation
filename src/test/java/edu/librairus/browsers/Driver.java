package edu.librairus.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static final String CHROME_PROPERTY = "webdriver.chrome.driver";
    private static final String CHROME_PATH = "src\\test\\resources\\drivers\\chromedriver.exe";
    private static WebDriver instance;

    public static WebDriver getInstance() {
        if (instance == null) {
            System.setProperty(CHROME_PROPERTY, CHROME_PATH);
            instance = new ChromeDriver();
            instance.manage().window().maximize();
        }

        return instance;
    }

    public static void quit() {
        instance.quit();
        instance = null;
    }
}
