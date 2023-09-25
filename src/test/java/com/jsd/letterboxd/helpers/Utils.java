package com.jsd.letterboxd.helpers;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

public class Utils {

    public static boolean areItemsInReverseAlphabeticalOrder(List<SelenideElement> itemNames) {
        for (int i = 0; i < itemNames.size() - 1; i++) {
            String currentName = itemNames.get(i).getText();
            String nextName = itemNames.get(i + 1).getText();
            if (currentName.compareToIgnoreCase(nextName) < 0) {
                return false;
            }
        }
        return true;
    }
}
