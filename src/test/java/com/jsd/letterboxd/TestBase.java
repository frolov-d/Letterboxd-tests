package com.jsd.letterboxd;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    LetterboxdHomePage letterboxdHomePage = new LetterboxdHomePage();

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://letterboxd.com";
    }
}
