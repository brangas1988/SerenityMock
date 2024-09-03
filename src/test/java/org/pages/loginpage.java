package org.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;


public class loginpage extends PageObject {

    @FindBy(xpath = "//*[@id='userid-content']")
    WebElementFacade userid;

    @FindBy(xpath = "//*[@id='password-content']")
    WebElementFacade pwd;

    public void openpage() throws InterruptedException {
        getDriver().navigate().to("https://www.discover.com");
        waitFor(userid).shouldBeVisible(); // Ensure the element is visible
        userid.sendKeys("test");
        pwd.sendKeys("testpwd");
    }
}
