package edu.librairus.utils;

import edu.librairus.browsers.Driver;
import edu.librairus.pages.AbstractPage;
import org.openqa.selenium.WebDriver;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class PageManager {
    private static final String PATH_TO_PAGE_PAKAGES = "src\\test\\java\\edu\\librairus\\pages";

    public static AbstractPage getPageByName(String pageName) {
        AbstractPage abstractPage = null;
        try {
            Class<?> cl = Class.forName(PATH_TO_PAGE_PAKAGES + pageName + "Page");
            Constructor constructor = cl.getConstructor(WebDriver.class);
            abstractPage = (AbstractPage) constructor.newInstance(Driver.getInstance());
        } catch (ClassNotFoundException | InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return abstractPage;
    }

}
