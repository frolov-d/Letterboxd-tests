package com.jsd.letterboxd;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LetterboxdHomePage {

    private SelenideElement searchInput = $("#search-q");
    private SelenideElement searchResultsHeading = $(By.cssSelector("h2.section-heading"));
    private SelenideElement consentButton = $(By.cssSelector("button.fc-cta-consent"));

    @Step("Main page opening")
    public void openHomePage() {
        open("/");
    }

    @Step("Clicking on the personal info consent agreement button")
    public void consentAgreement() {
        consentButton.shouldBe(Condition.visible).click();
    }

    @Step("Searching for a movie")
    public void searchForMovie(String movieTitle) {
        searchInput.shouldBe(Condition.visible).setValue(movieTitle).pressEnter();
    }

    @Step("Verifying search result heading")
    public void verifySearchResultsHeading(String expectedText) {
        searchResultsHeading.shouldHave(text(expectedText));
    }
}
