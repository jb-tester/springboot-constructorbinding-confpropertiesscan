package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * *
 * <p>Created by irina on 6/6/2022.</p>
 * <p>Project: springboot-constructorbinding-confpropertiesscan</p>
 * *
 <b> Just getters and setters: </b>
 */
@ConfigurationProperties("my.props00")
public class ConfPropertiesWithSetters {

    private static final String DEF_PROP2 = "default_prop2_value";
    String prop1 = "default_prop1_value";
    String prop2 = DEF_PROP2;

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public void setProp2(String prop2) {
        this.prop2 = prop2;
    }

    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }


}
