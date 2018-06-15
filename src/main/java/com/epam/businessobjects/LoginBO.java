package com.epam.businessobjects;

import com.epam.pages.GmailHomePage;
import com.epam.pages.LoginPage;

public class LoginBO {
    private GmailHomePage gmailHomePage = new GmailHomePage();
    private LoginPage loginPage = new LoginPage();

    public void login(String login, String password) {
        gmailHomePage.clickSignIn();
        loginPage.typeLoginAndSubmit(login);
        loginPage.typePasswordAndSubmit(password);
    }
}
