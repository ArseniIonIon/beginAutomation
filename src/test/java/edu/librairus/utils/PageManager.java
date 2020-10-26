package edu.librairus.utils;

import edu.librairus.annotations.PageAccessor;
import edu.librairus.browsers.Driver;
import edu.librairus.pages.AbstractPage;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class PageManager {
        private static final String PATH_TO_PAGE_PAKAGES_1 = "src\\test\\java\\edu\\librairus\\pages\\";
    private static final String PATH_TO_PAGE_PAKAGES = "edu.librairus.pages.";


    private static final List<Class<?>> PAGE_CLASSES = new ArrayList<>();
    public static void initPageClasses(){
        File directory = new File(PATH_TO_PAGE_PAKAGES_1);
        File[] files = directory.listFiles();
        for (File file: files){
            try {
                Class<?> clazz = Class.forName(PATH_TO_PAGE_PAKAGES + file.getName().replace(".java", ""));
                PAGE_CLASSES.add(clazz);
            } catch (ClassNotFoundException e) {
            }
        }
    }

    public static AbstractPage getPage(String pageName) {
        AbstractPage abstractPage = null;
        for (Class claz : PAGE_CLASSES) {
            PageAccessor annotation = (PageAccessor) claz.getAnnotation(PageAccessor.class);


            if (annotation!=null && pageName.equals(annotation.pageName()) ){
                try {
                    Constructor constructor = claz.getConstructor(WebDriver.class);
                    abstractPage = (AbstractPage) constructor.newInstance(Driver.getInstance());
                    // to do, add postinit
                    break;
                } catch (NoSuchMethodException |InstantiationException |IllegalAccessException| InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        if (abstractPage == null){
            throw new RuntimeException(String.format("Couldn't find a page with page name [%s]", pageName));
        }
        return abstractPage;
    }



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
