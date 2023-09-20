package com.jsd.letterboxd;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SwagLabsHomePage {

    private SelenideElement usernameField = $("#user-name");
    private SelenideElement passwordField = $("#password");
    private SelenideElement loginButton = $("#login-button");
    private SelenideElement headerLabel = $(".app_logo");

    @Step("Logging in to the site")
    public void openLoginPage() {
        open("/");
    }

    @Step("Entering valid credentials")
    public void credentialsEntering() {
        usernameField.setValue("standard_user");
        passwordField.setValue("secret_sauce");
        loginButton.click();
    }

    @Step("Verifying valid logging in")
    public void loginVerifying(){
        headerLabel.shouldHave(text("Swag Labs"));
    }
}
