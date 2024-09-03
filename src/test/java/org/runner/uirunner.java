package org.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue={"org.stepdef"},
        tags="@uiregression",
        //plugin = {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"},
        stepNotifications = true,
        monochrome = true
)
public class uirunner {
}
