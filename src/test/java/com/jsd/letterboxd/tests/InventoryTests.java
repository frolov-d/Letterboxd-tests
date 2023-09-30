package com.jsd.letterboxd.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
public class InventoryTests extends TestBase {

    @Feature("Inventory")
    @DisplayName("Inventory tests")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void addToCartFromDescription() {
        loginPage.openLoginPage();
        loginPage.enterCredentials();
        inventoryPage.addBackpackToTheCart();
        inventoryPage.verifyButtonNameChange();
        inventoryPage.verifyShoppingCartBadge("1");
        inventoryPage.removeBackpack();
    }

    @Feature("Inventory")
    @DisplayName("Shopping Cart counter test")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void verifyShoppingCartIncreaseCounter() {
        loginPage.openLoginPage();
        loginPage.enterCredentials();
        inventoryPage.addBikeLightToTheCart();
        inventoryPage.verifyShoppingCartBadge("1");
        inventoryPage.addBoltTShirtToTheCart();
        inventoryPage.verifyShoppingCartBadge("2");
        inventoryPage.addJacketToTheCart();
        inventoryPage.verifyShoppingCartBadge("3");
    }

    @Feature("Items sorting")
    @DisplayName("Sorting in reverse alphabetical order")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.MINOR)
    @Test
    void verifyReverseAlphabetizingSorting() {
        loginPage.openLoginPage();
        loginPage.enterCredentials();
        inventoryPage.reverseAlphabetizingSort();
        inventoryPage.verifyReverseAlphabeticalOrder();
    }
}
