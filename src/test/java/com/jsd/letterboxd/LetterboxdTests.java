package com.jsd.letterboxd;

import org.junit.jupiter.api.Test;


public class LetterboxdTests extends TestBase {

    @Test
    void searchTestWithSteps() {
        String searchTerm = "Lord of the rings";
        String expectedHeadingText = "FOUND AT LEAST 250 MATCHES FOR “LORD OF THE RINGS”";

        letterboxdHomePage.openHomePage();
        letterboxdHomePage.searchForMovie(searchTerm);
        letterboxdHomePage.verifySearchResultsHeading(expectedHeadingText);
    }
}