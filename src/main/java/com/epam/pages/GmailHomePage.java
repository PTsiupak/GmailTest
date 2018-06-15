package com.epam.pages;

import com.epam.utils.PageObject;
import com.epam.utils.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GmailHomePage extends PageObject {

    @FindBy(xpath = "//div/a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")
    private WebElement signIn;

    public void clickSignIn() {
        WebDriverSingleton.wait("//div/a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']");
        signIn.click();
    }
}
