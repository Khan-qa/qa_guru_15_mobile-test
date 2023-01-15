package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:browserstack.properties"
})

public interface BrowserstackConfig extends Config{
    @Key("browserstackUser")
    @DefaultValue("khanqa_rcZSwV")
    String browserstackUser();

    @Key("browserstackKey")
    @DefaultValue("RKS7tjySWfBNQTrkMsRo")
    String browserstackKey();

    @Key("app")
    @DefaultValue("bs://bfa460016c5aa2b30ec6d534ad72b2e44f6ef14b")
    String app();

    @Key("device")
    @DefaultValue("Google Pixel 3")
    String device();

    @Key("osVersion")
    @DefaultValue("9.0")
    String osVersion();
}
