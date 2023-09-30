package com.jsd.letterboxd.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.jsd.letterboxd.config.WebDriverProvider;
import com.jsd.letterboxd.helpers.Attachments;
import com.jsd.letterboxd.pages.InventoryPage;
import com.jsd.letterboxd.pages.LoginPage;
import com.jsd.letterboxd.pages.ShoppingCartPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class TestBase {

    LoginPage loginPage = new LoginPage();
    InventoryPage inventoryPage = new InventoryPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @BeforeAll
    static void config() {
        WebDriverProvider.config();
    }

    @BeforeEach
    void addListener() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void addAttachments() {
        Attachments.screenshotAs("Last screenshot");
        Attachments.pageSource();
        Attachments.browserConsoleLogs();
        Attachments.addVideo();
    }

    @AfterEach
    void clearCookies() {
        Selenide.clearBrowserCookies();
        executeJavaScript("window.localStorage.clear();");
        executeJavaScript("window.sessionStorage.clear();");
        Selenide.refresh();
    }
}
