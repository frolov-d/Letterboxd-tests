package com.jsd.letterboxd.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ShoppingCartPage {

    private SelenideElement cartList = $(".cart_list .inventory_item_name");
    private SelenideElement checkoutButton = $("#checkout");
    private SelenideElement firstNameField = $("#first-name");
    private SelenideElement lastNameField = $("#last-name");
    private SelenideElement zipCodeField = $("#postal-code");
    private SelenideElement continueButton = $("#continue");
    private SelenideElement finishButton = $("#finish");
    private SelenideElement checkoutCompleteContainer = $("#checkout_complete_container .complete-header");
    private SelenideElement backHomeButton = $("#back-to-products");

    @Step("Verifying item presence in the cart")
    public void verifyItemInTheCart() {
        cartList.shouldHave(text("Sauce Labs Bike Light"));
    }

    @Step("Clicking on the Checkout button")
    public void clickOnTheCheckoutButton() {
        checkoutButton.click();
    }

    @Step("Entering customer data")
    public void enterCustomerData() {
        firstNameField.setValue("First");
        lastNameField.setValue("Last");
        zipCodeField.setValue("456910"); // todo add Faker
    }

    @Step("Clicking on the Continue button")
    public void clickOnTheContinueButton() {
        continueButton.click();
    }

    @Step("Clicking on the Finish button")
    public void clickOnTheFinishButton() {
        finishButton.click();
    }

    @Step("Verifying finishing checkout")
    public void verifyFinishingCheckout() {
        checkoutCompleteContainer.shouldHave(text("Thank you for your order!"));
    }

    @Step("Clicking on the Back Home button")
    public void clickOnTheBackButton() {
        backHomeButton.click();
    }
}
