package com.jsd.letterboxd;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LetterboxdHomePage {

    private SelenideElement searchInput = $("#search-q");
    private SelenideElement searchResultsHeading = $(By.cssSelector("h2.section-heading"));

    public void openHomePage() {
        open("/");
    }

    public void searchForMovie(String movieTitle) {
        searchInput.setValue(movieTitle).pressEnter();
    }

    public void verifySearchResultsHeading(String expectedText) {
        searchResultsHeading.shouldHave(text(expectedText));
    }
}
