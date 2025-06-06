package com.mytests.spring.constructorBindingConfPropertiesScan.invalidDir;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.ConstructorBinding;
//import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * *
 * <p>Created by irina on 6/6/2022.</p>
 * <p>Project: springboot-constructorbinding-confpropertiesscan</p>
 * <p><b> Not included via @ConfigurationPropertiesScan  </b></p>
 * <p><b> or @EnableConfigurationProperties  </b></p>
 * <p><b> but included via @Bean </b></p>
 * <p><b> Should report warning probably </b></p>
 **/


public class ConfProperties5 {

    String prop1;
    String prop2;

    public ConfProperties5() {
    }

    @ConstructorBinding
     public ConfProperties5(String prop1, String prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }

    // setters are required now - @ConstructorBinding doesn't work?
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