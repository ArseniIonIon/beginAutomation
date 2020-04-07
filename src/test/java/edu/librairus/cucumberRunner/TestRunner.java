package edu.librairus.cucumberRunner;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"edu"}
)
@RunWith(Cucumber.class)
public class TestRunner {
}
