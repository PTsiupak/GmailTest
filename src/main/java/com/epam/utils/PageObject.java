package com.epam.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
    private WebDriver driver;

    public PageObject() {
        driver = WebDriverSingleton.getInstance();
        PageFactory.initElements(WebDriverSingleton.getInstance(), this);
    }
}
