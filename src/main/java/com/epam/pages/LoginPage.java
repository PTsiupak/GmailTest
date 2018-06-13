package com.epam.pages;

import com.epam.utils.PageObject;
import com.epam.utils.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    public LoginPage() {
        super();
    }

    @FindBy(id = "identifierId")
    private WebElement loginInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(xpath = "//content[@class='CwaK9']/span[1]")
    private WebElement nextButton;

    public void typeLoginAndSubmit(String login) {
        loginInput.sendKeys(login);
        nextButton.click();
    }

    public void typePasswordAndSubmit(String password) {
        passwordInput.sendKeys(password);
        //WebDriverSingleton.wait();
        nextButton.click();
    }
}
