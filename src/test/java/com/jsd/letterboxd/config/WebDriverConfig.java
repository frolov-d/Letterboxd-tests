package com.jsd.letterboxd.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties"
})
public interface WebDriverConfig extends Config {

    @Key("browserWithVersion")
    @DefaultValue("chrome,110.0")
    String[] getBrowserAndVersion();

    @Key("browser_size")
    @DefaultValue("1920x1080")
    String getBrowserSize();

    @Key("base_url")
    @DefaultValue("https://www.saucedemo.com")
    String getBaseUrl();

    @Key("selenoid")
    String getRemoteUrl();
}
