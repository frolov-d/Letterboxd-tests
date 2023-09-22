package com.jsd.letterboxd.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SwagLabsLoginPage {

    private SelenideElement usernameField = $("#user-name");
    private SelenideElement passwordField = $("#password");
    private SelenideElement loginButton = $("#login-button");
    private SelenideElement headerLabel = $(".app_logo");
    private SelenideElement burgerMenu = $("#react-burger-menu-btn");
    private SelenideElement logoutLink = $("#logout_sidebar_link");
    private SelenideElement loginLogo = $(".login_logo");

    @Step("Logging in to the site")
    public void openLoginPage() {
        open("/");
    }

    @Step("Entering valid credentials")
    public void enterCredentials() {
        usernameField.setValue("standard_user");
        passwordField.setValue("secret_sauce");
        loginButton.click();
    }

    @Step("Verifying valid logging in")
    public void loginVerifying(){
        headerLabel.shouldHave(text("Swag Labs"));
    }

    @Step("Logging out")
    public void logout() {
        burgerMenu.click();
        logoutLink.click();
    }

    @Step("Verifying logout")
    public void logoutVerifying() {
        loginLogo.shouldHave(text("Swag Labs"));
        loginButton.exists();
    }
}
