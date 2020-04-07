package browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static final String CHROME_PROPERTY = "webdriver.chrome.driver";
    private static final String CHROME_PATH ="C:\\ProjectsArseni\\beginAutomation\\src\\test\\resources\\drivers\\chromedriver.exe";
    private static Driver instance;

    private static WebDriver driver = null;
    private Driver( ) {
        System.setProperty(CHROME_PROPERTY,CHROME_PATH);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static Driver getInstance() {
        if (instance == null){
            instance = new Driver();
        }
        return instance;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void quit() {
        driver.quit();
        driver = null;
    }

    public static void main(String[] args) {
        WebDriver driver = Driver.getInstance().getDriver();
        driver.get("https://www.google.com/");    }
}
