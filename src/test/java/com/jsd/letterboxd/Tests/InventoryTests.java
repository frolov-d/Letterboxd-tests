package com.jsd.letterboxd.Tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
public class InventoryTests extends TestBase {

    @Feature("Web tests")
    @DisplayName("Inventory tests")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    void addToCartFromDescription() {
        loginPage.enterCredentials();
        inventoryPage.addBackpackToTheCart();
        inventoryPage.verifyButtonNameChange();
        inventoryPage.verifyShoppingCartBadge();
    }
}
