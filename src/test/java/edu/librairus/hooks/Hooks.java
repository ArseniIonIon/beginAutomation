package edu.librairus.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static edu.librairus.browsers.Driver.getInstance;
import static edu.librairus.browsers.Driver.quit;

public class Hooks {
    @Before
    public void beforeLibrarius(){
        getInstance().get("https://librarius.md/");
    }
    @After
    public void afterLibrarius(){
        quit();
    }

}
