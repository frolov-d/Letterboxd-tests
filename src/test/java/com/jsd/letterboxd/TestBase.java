package com.jsd.letterboxd;

import com.codeborne.selenide.logevents.SelenideLogger;
import com.jsd.letterboxd.config.WebDriverProvider;
import com.jsd.letterboxd.helpers.Attachments;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {

    LetterboxdHomePage letterboxdHomePage = new LetterboxdHomePage();

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
}
