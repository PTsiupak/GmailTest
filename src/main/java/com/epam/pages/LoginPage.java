package com.epam.pages;

import com.epam.utils.PageObject;
import com.epam.utils.WebDriverSingleton;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    public LoginPage() {
        super();
    }

    @FindBy(xpath = "//input[@type='email']")
    private WebElement loginInput;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@value='Log In']")
    private WebElement nextButton;

    public void typeLogin(String login) {
        loginInput.sendKeys(login);
    }

    public void typePassword(String password) {
        passwordInput.sendKeys(password);
        WebDriverSingleton.wait("//input[@value='Log In']");
        nextButton.click();
    }
}
