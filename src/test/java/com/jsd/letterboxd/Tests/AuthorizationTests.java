package com.jsd.letterboxd.Tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
public class AuthorizationTests extends TestBase {

    @Feature("Web tests")
    @DisplayName("Login test")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void loginTest() {
        loginPage.openLoginPage();
        loginPage.enterCredentials();
        loginPage.loginVerifying();
    }

    @Feature("Web tests")
    @DisplayName("Logout test")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void logoutTest() {
        loginPage.openLoginPage();
        loginPage.enterCredentials();
        loginPage.logout();
        loginPage.logoutVerifying();
    }

    @Feature("Web tests")
    @DisplayName("Incorrect password test")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void enterIncorrectPassword() {
        loginPage.enterIncorrectPassword();
    }
}