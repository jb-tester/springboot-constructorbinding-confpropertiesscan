package com.mytests.spring.constructorBindingConfPropertiesScan.confProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

/**
 * *
 * <p>Created by irina on 6/6/2022.</p>
 * <p>Project: springboot-constructorbinding-confpropertiesscan</p>
 * <p><b> No explicit @ConstructorBinding annotations, @Autowired params </b></p>
 **/
@ConfigurationProperties("my.props0")
public class ConfProperties0 {

    String prop1;
    String prop2;

    @Autowired
    //@ConstructorBinding
    public ConfProperties0(String barStr, String fooStr) {
        this.prop1 = barStr;
        this.prop2 = fooStr;
    }

    public String getProp1() {
        return prop1;
    }

    public String getProp2() {
        return prop2;
    }
}
