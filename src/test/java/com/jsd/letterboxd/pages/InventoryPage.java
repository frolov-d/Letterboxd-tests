package com.jsd.letterboxd.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    private SelenideElement backpackDescription = $("#item_4_title_link");
    private SelenideElement backpackAddToCartButton = $("#add-to-cart-sauce-labs-backpack");
    private SelenideElement backpackRemoveFromCartButton = $("#remove-sauce-labs-backpack");
    private SelenideElement cartBadge = $(".shopping_cart_badge");

    @Step("Adding a Sauce Labs Backpack to the cart")
    public void addBackpackToTheCart() {
        backpackDescription.click();
        backpackAddToCartButton.click();
    }

    @Step("Verifying changing button name")
    public void verifyButtonNameChange() {
        backpackRemoveFromCartButton.shouldHave(Condition.text("Remove"));
    }

    @Step("Verifying changing shopping cart counter")
    public void verifyShoppingCartBadge() {
        cartBadge.shouldHave(Condition.text("1"));
    }
}
