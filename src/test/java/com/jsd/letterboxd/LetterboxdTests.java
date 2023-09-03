package com.jsd.letterboxd;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.cssSelector;

public class LetterboxdTests extends TestBase {

    @Test
    void searchTest() {
        open("https://letterboxd.com/");
        $("#search-q").setValue("Lord of the rings").pressEnter();
        $(cssSelector("h2.section-heading"))
                .shouldHave(Condition.text("FOUND AT LEAST 250 MATCHES FOR “LORD OF THE RINGS”"));
    }
}
