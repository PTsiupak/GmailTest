package com.epam;

import com.epam.businessobjects.LoginBO;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.epam.utils.WebDriverSingleton.quit;

public class FbTest {

    @Test
    public void testGmail() {
//        GmailHomePage gmailHomePage = new GmailHomePage();
//        gmailHomePage.clickSignIn();
//        LoginPage loginPage = new LoginPage();
//        loginPage.typeLogin("login");
        LoginBO loginBO = new LoginBO();
        loginBO.login("myeml2436423@gmail.com", "MypassFb!");

    }

    @AfterMethod(alwaysRun = true)
    public void closeDriver() {
        quit();
    }
}
