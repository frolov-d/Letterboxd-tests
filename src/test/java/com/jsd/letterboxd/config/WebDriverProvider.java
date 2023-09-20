package com.jsd.letterboxd.config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    static AuthConfig authConfig = ConfigFactory.create(AuthConfig.class, System.getProperties());

    public static void config() {
        String[] browserWithVersion = WebDriverProvider.config.getBrowserAndVersion();
//        Configuration.holdBrowserOpen = true;
        Configuration.browser = browserWithVersion[0];
        Configuration.browserVersion = browserWithVersion[1];
        Configuration.browserSize = WebDriverProvider.config.getBrowserSize();
        Configuration.baseUrl = WebDriverProvider.config.getBaseUrl();
        String remoteUrl = WebDriverProvider.config.getRemoteUrl();
        if (remoteUrl != null) {
            Configuration.remote = "https://" + WebDriverProvider.authConfig.remoteUsername() + ":"
                                   + WebDriverProvider.authConfig.remotePassword() + "@" + remoteUrl + "/wd/hub";
        }
        Configuration.pageLoadStrategy = "eager";

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                "enableVNC", true,
                "enableVideo", true
        ));

        Configuration.browserCapabilities = capabilities;
    }
}
