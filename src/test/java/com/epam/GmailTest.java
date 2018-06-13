package com.epam;

import com.epam.pages.GmailHomePage;
import com.epam.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.epam.utils.WebDriverSingleton.quit;

public class GmailTest {

    @Test
    public void testGmail() {
        GmailHomePage gmailHomePage = new GmailHomePage();
        gmailHomePage.clickSignIn();
        LoginPage loginPage = new LoginPage();
        loginPage.typeLoginAndSubmit("login");
    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        quit();
    }
}
