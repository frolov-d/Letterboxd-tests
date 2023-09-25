package com.jsd.letterboxd.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.jsd.letterboxd.helpers.Utils.areItemsInReverseAlphabeticalOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InventoryPage {

    private SelenideElement backpackName = $("#item_4_title_link");
//    private SelenideElement bikeLightName = $("#item_0_title_link");
//    private SelenideElement boltTShirtName = $("#item_1_title_link");
//    private SelenideElement jacketName = $("#item_5_title_link");
//    private SelenideElement onesieName = $("#item_2_title_link");
//    private SelenideElement redTShirtName = $("#item_3_title_link");
    private SelenideElement backpackAddToCartButton = $("#add-to-cart-sauce-labs-backpack");
    private SelenideElement bikeLightAddToCartButton = $("#add-to-cart-sauce-labs-bike-light");
    private SelenideElement boltTShirtAddToCartButton = $("#add-to-cart-sauce-labs-bolt-t-shirt");
    private SelenideElement jacketAddToCartButton = $("#add-to-cart-sauce-labs-fleece-jacket");
//    private SelenideElement onesieAddToCartButton = $("#add-to-cart-sauce-labs-onesie");
//    private SelenideElement redTShirtAddToCartButton = $("#add-to-cart-test.allthethings()-t-shirt-(red)");
    private SelenideElement backpackRemoveFromCartButton = $("#remove-sauce-labs-backpack");
    private SelenideElement cartBadge = $(".shopping_cart_badge");
    private SelenideElement backToProductsButton = $("#back-to-products");
    private SelenideElement sortingButton = $(".product_sort_container");
    private List<SelenideElement> itemNames = $$(".inventory_item_name");

    @Step("Adding a Sauce Labs Backpack to the cart")
    public void addBackpackToTheCart() {
        backpackName.click();
        backpackAddToCartButton.click();
    }

    @Step("Verifying changing button name")
    public void verifyButtonNameChange() {
        backpackRemoveFromCartButton.shouldHave(Condition.text("Remove"));
    }

    @Step("Verifying changing shopping cart counter")
    public void verifyShoppingCartBadge(String counter) {
        cartBadge.shouldHave(Condition.text(counter));
    }

    @Step("Adding first product to the cart")
    public void addBikeLightToTheCart() {
        bikeLightAddToCartButton.click();
    }

    @Step("Adding second product to the cart")
    public void addBoltTShirtToTheCart() {
        boltTShirtAddToCartButton.click();
    }

    @Step("Adding third product to the cart")
    public void addJacketToTheCart() {
        jacketAddToCartButton.click();
    }

    @Step("Clicking on the Back button")
    public void clickOnTheBackButton() {
        backToProductsButton.click();
    }

    @Step("Removing a Backpack from the cart")
    public void removeBackpack() {
        backpackRemoveFromCartButton.click();
    }

    @Step("Clicking on the Sort button")
    public void sort() {
        sortingButton.click();
    }

    @Step("Setting reverse alphabetizing sorting")
    public void reverseAlphabetizingSort() {
        sortingButton.selectOptionByValue("za");
    }

    @Step("Verifying setting reverse alphabetical order")
    public void verifyReverseAlphabeticalOrder() {
        boolean result = areItemsInReverseAlphabeticalOrder(itemNames);
        assertTrue(result, "The list is in reverse alphabetical order");
    }
}
