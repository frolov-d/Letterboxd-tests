package com.jsd.letterboxd;

import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class LetterboxdTests extends TestBase {

    @Test
    @DisplayName("Search test")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.CRITICAL)
    void searchTest() {
        String searchTerm = "Lord of the rings";
        String expectedHeadingText = "FOUND AT LEAST 250 MATCHES FOR “LORD OF THE RINGS”";

        letterboxdHomePage.openHomePage();
        letterboxdHomePage.searchForMovie(searchTerm);
        letterboxdHomePage.verifySearchResultsHeading(expectedHeadingText);
    }
}