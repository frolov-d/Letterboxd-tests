package com.jsd.letterboxd;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
public class SwagLabsTests extends TestBase {

    @Test
    @Feature("Web tests")
    @DisplayName("Search test")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.CRITICAL)
    void loginTest() {
        swagLabsHomePage.openLoginPage();
        swagLabsHomePage.credentialsEntering();
        swagLabsHomePage.loginVerifying();
    }
}