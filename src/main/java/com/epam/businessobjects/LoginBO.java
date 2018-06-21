package com.epam.businessobjects;

import com.epam.pages.LoginPage;

public class LoginBO {
    private LoginPage loginPage = new LoginPage();

    public void login(String login, String password) {
        loginPage.typeLogin(login);
        loginPage.typePassword(password);
    }
}
