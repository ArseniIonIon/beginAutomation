package edu.librairus.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import edu.librairus.browsers.Driver;
import edu.librairus.pages.LibrariusPages;

import org.openqa.selenium.support.PageFactory;

import static edu.librairus.browsers.Driver.*;


public class Hooks {

    @Before
    public void beforeLibrarius(){
        getInstance();
        Driver.getInstance().get("https://librarius.md/");
    }

    @After
    public void afterLibrarius(){
        quit();
    }

}
