package org.driver;


import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class wrappedDriver implements DriverSource {
    @Override
    public WebDriver newDriver() {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        WebDriver driver = null;
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
        options.addArguments("--start-maximized");
       // options.addArguments("--headless");
        Map<String, Object> hmap=new HashMap<>();

        hmap.put("credentials_enable_service", false);
        hmap.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs",hmap);
        driver = new ChromeDriver(options);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\brang\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        return driver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
