package com.jsd.letterboxd;

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
        swagLabsLoginPage.openLoginPage();
        swagLabsLoginPage.enterCredentials();
        swagLabsLoginPage.loginVerifying();
    }

    @Feature("Web tests")
    @DisplayName("Logout test")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void logoutTest() {
        swagLabsLoginPage.openLoginPage();
        swagLabsLoginPage.enterCredentials();
        swagLabsLoginPage.logout();
        swagLabsLoginPage.logoutVerifying();
    }
}