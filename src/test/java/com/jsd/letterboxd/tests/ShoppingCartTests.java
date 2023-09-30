package com.jsd.letterboxd.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("web")
public class ShoppingCartTests extends TestBase {

    @Feature("Shopping Cart")
    @DisplayName("Shopping Cart tests")
    @Owner("Dmitry F")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    void addItemToTheCartAndBuy() {
        loginPage.openLoginPage();
        loginPage.enterCredentials();
        inventoryPage.addBikeLightToTheCart();
        inventoryPage.clickOnTheCartButton();
        shoppingCartPage.verifyItemInTheCart();
        shoppingCartPage.clickOnTheCheckoutButton();
        shoppingCartPage.enterCustomerData();
        shoppingCartPage.clickOnTheContinueButton();
        shoppingCartPage.verifyItemInTheCart();
        shoppingCartPage.clickOnTheFinishButton();
        shoppingCartPage.verifyFinishingCheckout();
        shoppingCartPage.clickOnTheBackButton();
    }
}
